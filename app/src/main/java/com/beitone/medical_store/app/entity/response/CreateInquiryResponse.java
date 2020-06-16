package com.beitone.medical_store.app.entity.response;

public class CreateInquiryResponse {


    /**
     * cartId : 0
     * memberId : 0
     * goodsId : 7
     * buyNum : 1
     * commonId : 0
     * bundlingId : 0
     * distributionOrdersId : 0
     * chainId : 0
     * patientName : wang132
     * phone : null
     */

    private String cartId;
    private String memberId;
    private String goodsId;
    private String buyNum;
    private String commonId;
    private String bundlingId;
    private String distributionOrdersId;
    private String chainId;
    private String patientName;
    private String phone;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(String buyNum) {
        this.buyNum = buyNum;
    }

    public String getCommonId() {
        return commonId;
    }

    public void setCommonId(String commonId) {
        this.commonId = commonId;
    }

    public String getBundlingId() {
        return bundlingId;
    }

    public void setBundlingId(String bundlingId) {
        this.bundlingId = bundlingId;
    }

    public String getDistributionOrdersId() {
        return distributionOrdersId;
    }

    public void setDistributionOrdersId(String distributionOrdersId) {
        this.distributionOrdersId = distributionOrdersId;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
