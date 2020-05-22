package com.beitone.medical_store.app.helper;

import android.content.Context;

import com.qiniu.android.common.Zone;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.storage.UpCompletionHandler;
import com.qiniu.android.storage.UploadManager;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

public class FileUploadHelper {

    private UploadManager mQiNiuUploadManager;

    private static FileUploadHelper mHelper;

    private static Context mContext;

    private int mCurrentIndex = 0;

    private List<File> compressFiles;

    private List<String> uploadFilePath;

    private OnUploadCallback mOnUploadCallback;

    private FileUploadHelper(){
        mQiNiuUploadManager = new UploadManager(new Configuration.Builder()
                .zone(Zone.zone2)
                .build());
    }

    public static FileUploadHelper getInstance(Context context){
        if (mHelper == null){
            synchronized (FileUploadHelper.class){
                if (mHelper == null){
                    mHelper = new FileUploadHelper();
                }
            }
        }
        mContext = context;
        return mHelper;
    }

    public void compressWithUploadImgs(List<String> images , OnUploadCallback onUploadCallback){
        mCurrentIndex = 0;
        compressFiles = new ArrayList<>();
        mOnUploadCallback = onUploadCallback;
        compressImageDoneUpload(images);
    }

    private void compressImageDoneUpload(List<String> images){
        if (mCurrentIndex == images.size()){
            mCurrentIndex = 0;
            uploadFilePath = new ArrayList<>();
            uploadPhoto(compressFiles);
        } else {
            Luban.with(mContext).load(images.get(mCurrentIndex))
                    .ignoreBy(100)
                    .setCompressListener(new OnCompressListener() {
                        @Override
                        public void onStart() {

                        }

                        @Override
                        public void onSuccess(File file) {
                            compressFiles.add(file);
                            mCurrentIndex++;
                            compressImageDoneUpload(images);
                        }

                        @Override
                        public void onError(Throwable e) {
                            mCurrentIndex++;
                            compressImageDoneUpload(images);
                        }
                    }).launch();
        }
    }

    private void uploadPhoto(List<File> files) {
        if (mCurrentIndex == files.size()){
            mCurrentIndex = 0;
            if (mOnUploadCallback != null){
                mOnUploadCallback.OnUploadComplete(uploadFilePath);
            }
        } else {
            mQiNiuUploadManager.put(files.get(mCurrentIndex),
                    getFileNameWithSuffix(files.get(mCurrentIndex).getPath()), getUploadToken(),
                    new UpCompletionHandler() {
                        @Override
                        public void complete(String key, ResponseInfo info, JSONObject response) {
                            mCurrentIndex++;
                            uploadFilePath.add(QiNiuConfig.DOMAIN + key);
                            uploadPhoto(files);
                        }

                    },null);
        }
    }


    public String getUploadToken(){
        return QiNiuAuth.create(QiNiuConfig.ACCESS_KEY, QiNiuConfig.SECRET_KEY).uploadToken(QiNiuConfig.BUCKET_NAME);
    }



    public String getFileNameWithSuffix(String pathandname) {
        int start = pathandname.lastIndexOf("/");
        if (start != -1) {
            return pathandname.substring(start + 1);
        } else {
            return null;
        }
    }


    public interface OnUploadCallback{
        void OnUploadComplete(List<String> uploadFile);
    }

}
