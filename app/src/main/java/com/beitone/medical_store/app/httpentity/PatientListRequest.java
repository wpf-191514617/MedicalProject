package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class PatientListRequest extends BaseRequestEntity {

    public String userId;

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/patient/list";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization", UserHelper.getInstance().getUserToken(MedicalApplication.getContext()));
        return map;
    }

    @Override
    public String getQuery() {
        return "userId=" + userId;
    }

    @Override
    public Object getParams() {
        return null;
    }
}
