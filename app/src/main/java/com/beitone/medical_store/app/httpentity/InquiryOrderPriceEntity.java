package com.beitone.medical_store.app.httpentity;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class InquiryOrderPriceEntity extends BaseRequestEntity {

    public InquiryOrderBuyData buyData;

    public String token;

    public String clientType;

    @Override
    public String getUrl() {
        return "api/member/buy/virtual/calc";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        return null;
    }

    @Override
    public String getQuery() {
        return "token=" + token
                + "&buyData=" + URLEncoder.encode(GsonUtil.GsonString(buyData))
                + "&clientType=" + clientType;
    }

    @Override
    public Object getParams() {
        return null;
    }

}
