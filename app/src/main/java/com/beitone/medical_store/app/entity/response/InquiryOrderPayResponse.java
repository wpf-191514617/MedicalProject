package com.beitone.medical_store.app.entity.response;

import com.google.gson.annotations.SerializedName;

public class InquiryOrderPayResponse {


    /**
     * payParam : {"package":"Sign=WXPay","appid":"wxbd2632ebcade4714",
     * "sign":"870CA35FD4AFC178B41572AAE710C626","partnerid":"1584481341",
     * "prepayid":"wx10171312861508c953148b261701680000",
     * "noncestr":"xpfz910n3hcwuwjxa53wgiwjqul6xnhz","timestamp":1591780392}
     * payId : 163
     * isPayed : 0
     */

    private PayParamBean payParam;
    private String payId;
    private String isPayed;

    public PayParamBean getPayParam() {
        return payParam;
    }

    public void setPayParam(PayParamBean payParam) {
        this.payParam = payParam;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed;
    }

    public static class PayParamBean {
        /**
         * package : Sign=WXPay
         * appid : wxbd2632ebcade4714
         * sign : 870CA35FD4AFC178B41572AAE710C626
         * partnerid : 1584481341
         * prepayid : wx10171312861508c953148b261701680000
         * noncestr : xpfz910n3hcwuwjxa53wgiwjqul6xnhz
         * timestamp : 1591780392
         */

        @SerializedName("package")
        private String packageX;
        private String appid;
        private String sign;
        private String partnerid;
        private String prepayid;
        private String noncestr;
        private String timestamp;

        public String getPackageX() {
            return packageX;
        }

        public void setPackageX(String packageX) {
            this.packageX = packageX;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getPartnerid() {
            return partnerid;
        }

        public void setPartnerid(String partnerid) {
            this.partnerid = partnerid;
        }

        public String getPrepayid() {
            return prepayid;
        }

        public void setPrepayid(String prepayid) {
            this.prepayid = prepayid;
        }

        public String getNoncestr() {
            return noncestr;
        }

        public void setNoncestr(String noncestr) {
            this.noncestr = noncestr;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }
}
