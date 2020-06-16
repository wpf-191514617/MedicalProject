package cn.betatown.mobile.beitonelibrary;

import android.app.Application;
import android.content.Context;

import cn.betatown.mobile.beitonelibrary.util.PreferencesUtils;

public class BeiToneApplication extends Application {

    private static final String accessTokenKey = "accessToken.Key";
    private static final String tokenKey = "token.Key";

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }

    public static void putAccessToken(String accessToken){
        PreferencesUtils.putString(context , accessTokenKey , accessToken);
    }

    public static String getAccessToken(){
        return PreferencesUtils.getString(context , accessTokenKey);
    }

    public static void putToken(String token){
        PreferencesUtils.putString(context , tokenKey , token);
    }

    public static String getToken(){
        return PreferencesUtils.getString(context , tokenKey);
    }

}
