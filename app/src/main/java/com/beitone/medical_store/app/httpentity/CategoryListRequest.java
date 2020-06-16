package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class CategoryListRequest extends BaseRequestEntity {

    @Override
    public String getUrl() {
        return "/api/category/list";
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
        return null;
    }

    @Override
    public Object getParams() {
        return null;
    }
}
