package com.beitone.medical_store.app.provider;

import android.content.Context;

import com.beitone.medical_store.app.helper.UserHelper;

import java.util.HashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class AccountProvider extends BaseProvider {


    /*public static void sendAuthCode(Object tag,String phone , OnJsonCallBack onJsonCallBack){

        Map<String, Object> params = new HashMap<>();
        params.put("phone" , phone);
        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);
    }*/

   /* public static void doLoginByAuthCode(Object tag,String phone ,
                                         String authCode, OnJsonCallBack onJsonCallBack){
        Map<String, Object> params = new HashMap<>();
        params.put("phone" , phone);
        params.put("isRememberMe" , "true");
        params.put("code" , authCode);

        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "/platform-auth/auth/getTokenByPhoneCode")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);
    }*/


    /*public static void setLoginPassword(Context tag,
                                        String newPasswd, OnJsonCallBack onJsonCallBack){
        Map<String, Object> params = new HashMap<>();
        params.put("newPasswd" , newPasswd);
        params.put("userId" , UserHelper.getInstance().getUserId(tag));

        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "/platform-auth/user/update/passwd")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);
    }*/


    /*public static void registerAccountByPhone(Object tag,String phone ,String authCode,
                                              String password, OnJsonCallBack onJsonCallBack){
        Map<String, Object> params = new HashMap<>();
        params.put("phone" , phone);
        params.put("password" , password);
        params.put("code" , authCode);

        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "/platform-auth/user/registerByPhone")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);

        //post(tag , "/user/registerByPhone" , params , onJsonCallBack);
    }*/

   /* public static void doLoginByPassword(Object tag, String phone,
                                         String password, OnJsonCallBack onJsonCallBack) {
        Map<String, Object> params = new HashMap<>();
        params.put("userName" , phone);
        params.put("isRememberMe" , "true");
        params.put("password" , password);
        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "/platform-auth/auth/getTokenByUserPWD")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);
       // post(tag , "/auth/getTokenByUserPWD" , params , onJsonCallBack);
    }*/


    /*public static void findPassword(Context tag, String phone,String authCode,
                                    String password, OnJsonCallBack onJsonCallBack){
        Map<String, Object> params = new HashMap<>();
        params.put("phone" , phone);
        params.put("newPasswd" , password);
        params.put("code" , authCode);

        HttpRequest httpRequest = new HttpRequest.HttpRequestBuilder(tag ,
                HttpRequestMethod.POST , "/platform-auth/user/update/passwdByPhone")
                .addParams(params)
                .build();
        request(httpRequest.build() , onJsonCallBack);


        //post(tag , "/user/update/passwdByPhone" , params , onJsonCallBack);
    }*/

}
