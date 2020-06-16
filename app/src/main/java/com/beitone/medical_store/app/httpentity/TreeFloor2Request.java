package com.beitone.medical_store.app.httpentity;

import android.text.TextUtils;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class TreeFloor2Request extends BaseRequestEntity {

    public String hospitalId;

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/dept/tree/floor2";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization", UserHelper.getInstance().getAccessToken(MedicalApplication.getContext()));
        return map;
    }

    @Override
    public String getQuery() {
        if (TextUtils.isEmpty(hospitalId)){
            return null;
        }
        return "hospitalId=" + hospitalId;
    }

    @Override
    public Object getParams() {
        return null;
    }
}
