package com.beitone.medical_store.app.httpentity;

import java.net.URLEncoder;
import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class InquiryOrderPayEntity extends BaseRequestEntity {

    public String token;

    public String payId;

    public String predepositPay;

    public String payPwd;

    @Override
    public String getUrl() {
        return "api/member/buy/pay/virtual/app/wxpay";
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
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("token" , token);
        hashMap.put("payId" , payId);
        hashMap.put("predepositPay" , predepositPay);
        hashMap.put("payPwd" , payPwd);
        return hashMap;
    }

}
