package com.beitone.medical_store.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.SelectImageEntity;
import com.bumptech.glide.Glide;

import net.shopnc.b2b2c.android.custom.MyGridView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import me.jessyan.autosize.utils.ScreenUtils;

public class SelectImageLayout extends LinearLayout {

    private MyGridView mGridView;
    private int mSpacing;
    private int mColCount;
    private int mMaxSelectCount;

    private int mLeftMargin,mRightMargin;

    private FeedGridAdapter mFeedGridAdapter;
    private OnSelectImageListener mOnSelectImageListener;
    private SelectImageEntity mAddSelectImageEntity;
    private List<SelectImageEntity> selectImageEntityList;


    public SelectImageLayout(Context context) {
        this(context,null);
    }

    public SelectImageLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SelectImageLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context , attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.SelectImageLayout);
        mSpacing = array.getDimensionPixelSize(R.styleable.SelectImageLayout_spacing , 10);
        mColCount = array.getInteger(R.styleable.SelectImageLayout_colCount , 3);
        mMaxSelectCount = array.getInteger(R.styleable.SelectImageLayout_maxSelectCount , 9);
        array.recycle();
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_gridview ,
                this);
        mLeftMargin = 0;
        mRightMargin = 0;
        mGridView = contentView.findViewById(R.id.gridImage);
        mGridView.setHorizontalSpacing(mSpacing);
        mGridView.setVerticalSpacing(mSpacing);
        mGridView.setNumColumns(mColCount);
    }

    public void setOnSelectImageListener(OnSelectImageListener mOnSelectImageListener) {
        this.mOnSelectImageListener = mOnSelectImageListener;
    }

    public void setMargin(int leftMargin , int rightMargin) {
        this.mLeftMargin = leftMargin;
        this.mRightMargin = rightMargin;
    }

    public void initData(Context context) {
        mAddSelectImageEntity = new SelectImageEntity();
        mAddSelectImageEntity.isAdd = true;
        List<SelectImageEntity> imageEntities = new ArrayList<>();
        imageEntities.add(mAddSelectImageEntity);
        mFeedGridAdapter = new FeedGridAdapter(context,imageEntities);
        mGridView.setAdapter(mFeedGridAdapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (mFeedGridAdapter.getItem(i).isAdd){
                    if (mOnSelectImageListener != null){
                        mOnSelectImageListener.onSelectImage();
                    }
                }
            }
        });
    }

    public int getMaxSelectCount(){
        return mMaxSelectCount - mFeedGridAdapter.getDataFilter().size();
    }


    public void addImages(List<String> imgs){
        List<SelectImageEntity> entities = mFeedGridAdapter.getDataFilter();
        for (String image : imgs) {
            SelectImageEntity imageEntity = new SelectImageEntity();
            imageEntity.imagePath = image;
            entities.add(imageEntity);
        }
        entities.add(mAddSelectImageEntity);
        mFeedGridAdapter.setData(entities);
    }

    public void addImageFiles(List<File> imgs){
        List<String> images = new ArrayList<>();
        for (File img : imgs) {
            images.add(img.getPath());
        }
        addImages(images);
    }


    class FeedGridAdapter extends BaseAdapter {

        private List<SelectImageEntity> imageData;

        private Context mContext;

        private int mItemSize ;

        public FeedGridAdapter(Context context,List<SelectImageEntity> imageData) {
            this.mContext = context;
            this.imageData = imageData;
            int[] sizeArray = ScreenUtils.getScreenSize(mContext);
            int width = sizeArray[0];
            mItemSize = (width - mLeftMargin - mRightMargin - mSpacing*(mColCount-1))/mColCount;
        }

        @Override
        public int getCount() {
            if (AdapterUtil.isListNotEmpty(imageData)){
                return imageData.size() > mMaxSelectCount ? mMaxSelectCount : imageData.size();
            }
            return 0;
        }

        public List<SelectImageEntity> getDataFilter(){
            List<SelectImageEntity> selectImageEntities = new ArrayList<>();
            for (SelectImageEntity imageDatum : imageData) {
                if (!imageDatum.isAdd){
                    selectImageEntities.add(imageDatum);
                }
            }
            return selectImageEntities;
        }

        @Override
        public SelectImageEntity getItem(int i) {
            return imageData.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            if (view == null){
                view = LayoutInflater.from(mContext).inflate(R.layout.item_select_image , null);
                viewHolder = new ViewHolder();
                viewHolder.ivPhoto = view.findViewById(R.id.ivPhoto);
                viewHolder.ivAddFlag = view.findViewById(R.id.ivAddFlag);
                viewHolder.ivRemoveImage = view.findViewById(R.id.ivRemoveImage);
                viewHolder.layoutPhoto =view.findViewById(R.id.layoutPhoto);

                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewHolder.layoutPhoto.getLayoutParams();
                layoutParams.width = mItemSize;
                layoutParams.height = mItemSize;
                viewHolder.layoutPhoto.setLayoutParams(layoutParams);

                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            SelectImageEntity imageEntity = imageData.get(i);

            if (imageEntity != null){
                if (imageEntity.isAdd){
                    viewHolder.ivAddFlag.setVisibility(View.VISIBLE);
                    viewHolder.ivPhoto.setVisibility(View.INVISIBLE);
                    viewHolder.ivRemoveImage.setVisibility(View.INVISIBLE);
                } else {
                    viewHolder.ivAddFlag.setVisibility(View.INVISIBLE);
                    viewHolder.ivPhoto.setVisibility(View.VISIBLE);
                    viewHolder.ivRemoveImage.setVisibility(View.VISIBLE);
                    Glide.with(mContext).load(imageEntity.imagePath).into(viewHolder.ivPhoto);
                }
            }

            viewHolder.ivRemoveImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageData.remove(i);
                    notifyDataSetChanged();
                }
            });

            return view;
        }

        public void setData(List<SelectImageEntity> entities) {
            this.imageData = entities;
            notifyDataSetChanged();
        }

        class ViewHolder{
            LinearLayout layoutPhoto;
            ImageView ivPhoto , ivAddFlag , ivRemoveImage;
        }
    }


    public interface OnSelectImageListener{
        void onSelectImage();
    }

}
