package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class MyRecipelListRequest extends BaseRequestEntity {

    public int current;
    public int size = 10;
    public String userId;

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/medorder/getMyRecipel";
    }

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.GET;
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        if (UserHelper.getInstance().isLogin(MedicalApplication.getContext())){
            LinkedHashMap<String, String> map = new LinkedHashMap<>();
            map.put("Authorization", UserHelper.getInstance().getAccessToken(MedicalApplication.getContext()));
            return map;
        }
        return null;
    }

    @Override
    public String getQuery() {
        return "current=" + current +
                "&size=" + size +
                "&userId=" + userId ;
    }

    @Override
    public Object getParams() {
        return null;
    }
}
