package com.beitone.medical_store.app.provider;

import android.content.Context;

import com.beitone.medical_store.app.entity.request.ConditionDesRequest;

import java.util.HashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class QuestionProvider extends BaseProvider {

    public static void submitConditionDes(Context context , ConditionDesRequest request ,
                                          OnJsonCallBack onJsonCallBack){
        Map<String, String> query = GsonUtil.GsonToMaps(GsonUtil.GsonString(request.queryParams));
        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(context,
                HttpRequestMethod.POST , "/inquiry/patient/symptom/add")
                .addQueryParams(query)
                .addParams(GsonUtil.GsonToMaps(request.toString()))
                .build();
        request(httpRequest.build() , onJsonCallBack);
    }

}
