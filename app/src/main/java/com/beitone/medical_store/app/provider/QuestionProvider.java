package com.beitone.medical_store.app.provider;

import android.content.Context;

import com.beitone.medical_store.app.httpentity.ConditionDesPostStrRequest;

import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class QuestionProvider extends BaseProvider {

    /*public static void submitConditionDes(Context context , ConditionDesPostStrRequest request ,
                                          OnJsonCallBack onJsonCallBack){
        *//*Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("allergy" , request.allergy);
        objectMap.put("subsequentVisit", request.subsequentVisit);
        if (AdapterUtil.isListNotEmpty(request.imgsList)){
            objectMap.put("imgsList" , request.imgsList.toString());
        }
        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(context,
                HttpRequestMethod.POST_STR, "")
                .addHead("Authorization", UserHelper.getInstance().getUserToken(context))
                .addQueryParams(query)
                .addParams(objectMap)
                .build();*//*
        HttpRequest httpRequest = new HttpRequest(request);
        request(httpRequest.build(context) , onJsonCallBack);
    }*/

}
