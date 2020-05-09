package com.beitone.medical_store.app.provider;

import android.content.Context;

import com.beitone.medical_store.app.entity.request.ConditionDesRequest;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.HashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class QuestionProvider extends BaseProvider {

    public static void submitConditionDes(Context context , ConditionDesRequest request ,
                                          OnJsonCallBack onJsonCallBack){
        Map<String, String> query = GsonUtil.GsonToMaps(GsonUtil.GsonString(request.queryParams));
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("allergy" , request.allergy);
        if (AdapterUtil.isListNotEmpty(request.imgsList)){
            objectMap.put("imgsList" , request.imgsList.toString());
        }
        objectMap.put("subsequentVisit" , request.subsequentVisit);
        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(context,
                HttpRequestMethod.POST_STR , "/hyj-inquiry/inquiry/patient/symptom/add")
                .addHead("Authorization" , UserHelper.getInstance().getUserToken(context))
                .addQueryParams(query)
                .addParams(objectMap)
                .build();
        request(httpRequest.build() , onJsonCallBack);
    }

}
