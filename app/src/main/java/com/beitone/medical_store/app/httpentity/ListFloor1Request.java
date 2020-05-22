package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class ListFloor1Request extends BaseRequestEntity {

    public String hospitalId;

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/dept/list/floor1";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        if (UserHelper.getInstance().isLogin(MedicalApplication.getContext())){
            LinkedHashMap<String, String> map = new LinkedHashMap<>();
            map.put("Authorization", UserHelper.getInstance().getUserToken(MedicalApplication.getContext()));
            return map;
        }
        return null;
    }

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.GET;
    }

    @Override
    public String getQuery() {
        return "hospitalId=" + hospitalId;
    }

    @Override
    public Object getParams() {
        return null;
    }
}
