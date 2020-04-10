package com.beitone.medical_store.app.helper;

import com.beitone.medical_store.app.MedicalApplication;

import cn.betatown.mobile.beitonelibrary.util.ACache;

public class CacheHelper {

    private static CacheHelper mHelper;

    private final String KEY_TOKEN = "USER.TOKEN";
    private final String KEY_UID = "USER.ID";

    private boolean isBackGround = true;

    private boolean isLogout = false;

    private ACache mACache;

    private final String CACHE_NAME = "beitone.cache";

    private CacheHelper() {
        mACache = ACache.get(MedicalApplication.getContext(), CACHE_NAME);
    }

    public static CacheHelper getInstance() {
        if (mHelper == null) {
            synchronized (CacheHelper.class) {
                if (mHelper == null) {
                    mHelper = new CacheHelper();
                }
            }
        }
        return mHelper;
    }

    public void putValue(String key, String value) {
        mACache.put(key, value, ACache.TIME_DAY * 365 * 100);
    }

    public String getValueByKey(String key) {
        return mACache.getAsString(key);
    }

    public void clear() {
        mACache.clear();
    }

    public boolean isBackGround() {
        return isBackGround;
    }

    public void setBackGround(boolean backGround) {
        isBackGround = backGround;
    }

    public boolean isLogout() {
        return isLogout;
    }

    public void setLogout(boolean logout) {
        isLogout = logout;
    }
}
