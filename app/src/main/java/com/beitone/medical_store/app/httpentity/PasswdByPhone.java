package com.beitone.medical_store.app.httpentity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class PasswdByPhone extends BaseRequestEntity {

    public String phone;
    public String password;
    public String authCode;

    @Override
    public String getUrl() {
        return "inqApi/platform-auth/user/update/passwdByPhone";
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
        params.put("newPasswd" , password);
        params.put("code" , authCode);
        return params;
    }
}
