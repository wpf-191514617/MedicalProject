package com.beitone.medical_store.app.httpentity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class GetPhoneCodeRequest extends BaseRequestEntity {

    public String phone;

    @Override
    public String getUrl() {
        return "inqApi/qdp-auth/oauth/getPhoneCode";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        return null;
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Object getParams() {
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("phone" , phone);
        return params;
    }
}
