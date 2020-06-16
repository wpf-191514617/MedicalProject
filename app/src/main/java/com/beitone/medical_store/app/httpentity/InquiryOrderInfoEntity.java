package com.beitone.medical_store.app.httpentity;

import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class InquiryOrderInfoEntity extends BaseRequestEntity {

    public QueryParams queryParams = new QueryParams();

    @Override
    public String getUrl() {
        return "api/member/buy/virtual/step1";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        return null;
    }

    @Override
    public String getQuery() {
        return queryParams.toString();
    }

    @Override
    public Object getParams() {
        return null;
    }

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.POST;
    }

    public class QueryParams{
        public String registerId;
        public String orderType;
        public String token;
        public String clientType;
        public List<BuyDataParams> buyData;
        public int isCart;

        @Override
        public String toString() {
            return "registerId=" + registerId +
                    "&orderType=" + orderType +
                    "&token=" + token +
                    "&clientType=" + clientType +
                    "&buyData=" + URLEncoder.encode(GsonUtil.GsonString(buyData)) +
                    "&isCart=" + isCart;
        }
    }



    public static class BuyDataParams{
        public int buyNum;
        public int goodsId;

    }


}
