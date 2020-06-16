package com.beitone.medical_store.app.helper;

import android.content.Context;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.entity.response.UserResponse;

import cn.betatown.mobile.beitonelibrary.util.GsonUtil;
import cn.betatown.mobile.beitonelibrary.util.PreferencesUtils;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class UserHelper {

    private static UserHelper mInstance;

    private final String KEY_USERINFO = "USER.INFO";

    private final String KEY_USERID = "USER_ID";

    private final String KEY_ACCESSTOKEN = "USER_ACCESSTOKEN";

    private final String KEY_TOKEN = "USER_TOKEN";

    private final String KEY_IM_USERNAME = "IM_USERNAME";

    private UserHelper() {
    }

    public static UserHelper getInstance() {
        if (mInstance == null) {
            synchronized (UserHelper.class) {
                if (mInstance == null) {
                    mInstance = new UserHelper();
                }
            }
        }
        return mInstance;
    }


    public void putUserId(Context context, String userId) {
        context = MedicalApplication.getContext();
        PreferencesUtils.putString(context, KEY_USERID, userId);
    }

    public String getUserId(Context context) {
        context = MedicalApplication.getContext();
        return PreferencesUtils.getString(context, KEY_USERID);
    }

    public void putAccessToken(Context context, String userToken) {
        context = MedicalApplication.getContext();
        PreferencesUtils.putString(context, KEY_ACCESSTOKEN, userToken);
    }

    public String getAccessToken(Context context) {
        context = MedicalApplication.getContext();
        return PreferencesUtils.getString(context, KEY_ACCESSTOKEN);
    }

    public void putToken(Context context, String userToken) {
        context = MedicalApplication.getContext();
        PreferencesUtils.putString(context, KEY_TOKEN, userToken);
    }

    public String getToken(Context context) {
        context = MedicalApplication.getContext();
        return PreferencesUtils.getString(context, KEY_TOKEN);
    }

    public void putIMUserName(String userName) {
        PreferencesUtils.putString(MedicalApplication.getContext(), KEY_IM_USERNAME, userName);
    }

    public String getIMUserName() {
        return PreferencesUtils.getString(MedicalApplication.getContext(), KEY_IM_USERNAME);
    }

    public void putUserInfo(UserResponse response) {
        CacheHelper.getInstance().putValue(KEY_USERINFO, GsonUtil.GsonString(response));
    }

    public UserResponse getUserInfo() {
        String s = CacheHelper.getInstance().getValueByKey(KEY_USERINFO);
        if (StringUtil.isEmpty(s)) {
            return null;
        }
        return GsonUtil.GsonToBean(s, UserResponse.class);
    }


    public void logout(Context context) {
        putUserId(context, "");
        putAccessToken(context, "");
    }

    public boolean isLogin(Context context) {
        if (!StringUtil.isEmpty(getUserId(context)) &&
                !StringUtil.isEmpty(getAccessToken(context))) {
            return true;
        }
        return false;
    }

}
