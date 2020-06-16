package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class PaymentResponse {


    /**
     * payAmount : 0.01
     * payId : 161
     * predepositAmount : 0.0
     * allowPredeposit : 0
     * paymentList : [{"paymentCode":"wxpay","paymentName":"微信"}]
     */

    private String payAmount;
    private String payId;
    private String predepositAmount;
    private String allowPredeposit;
    private List<PaymentListBean> paymentList;

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPredepositAmount() {
        return predepositAmount;
    }

    public void setPredepositAmount(String predepositAmount) {
        this.predepositAmount = predepositAmount;
    }

    public String getAllowPredeposit() {
        return allowPredeposit;
    }

    public void setAllowPredeposit(String allowPredeposit) {
        this.allowPredeposit = allowPredeposit;
    }

    public List<PaymentListBean> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<PaymentListBean> paymentList) {
        this.paymentList = paymentList;
    }

    public static class PaymentListBean {
        /**
         * paymentCode : wxpay
         * paymentName : 微信
         */

        private String paymentCode;
        private String paymentName;

        public String getPaymentCode() {
            return paymentCode;
        }

        public void setPaymentCode(String paymentCode) {
            this.paymentCode = paymentCode;
        }

        public String getPaymentName() {
            return paymentName;
        }

        public void setPaymentName(String paymentName) {
            this.paymentName = paymentName;
        }
    }
}
