package com.beitone.medical_store.app.provider;

import java.util.HashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class AccountProvider extends BaseProvider {


    public static void sendAuthCode(Object tag,String phone , OnJsonCallBack onJsonCallBack){
        Map<String, String> params = new HashMap<>();
        params.put("phone" , phone);
        post(tag , "/auth/getPhoneCode" , params , onJsonCallBack);
    }

    public static void doLoginByAuthCode(Object tag,String phone ,
                                         String authCode, OnJsonCallBack onJsonCallBack){
        Map<String, String> params = new HashMap<>();
        params.put("phone" , phone);
        params.put("isRememberMe" , "true");
        params.put("code" , authCode);
        post(tag , "/auth/getTokenByPhoneCode" , params , onJsonCallBack);
    }

    public static void registerAccountByPhone(Object tag,String phone ,String authCode,
                                              String password, OnJsonCallBack onJsonCallBack){
        Map<String, String> params = new HashMap<>();
        params.put("phone" , phone);
        params.put("password" , password);
        params.put("code" , authCode);
        post(tag , "/user/registerByPhone" , params , onJsonCallBack);
    }

}
