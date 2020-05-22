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

    private int cartId;
    private int memberId;
    private int goodsId;
    private int buyNum;
    private int commonId;
    private int bundlingId;
    private int distributionOrdersId;
    private int chainId;
    private String patientName;
    private Object phone;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public int getCommonId() {
        return commonId;
    }

    public void setCommonId(int commonId) {
        this.commonId = commonId;
    }

    public int getBundlingId() {
        return bundlingId;
    }

    public void setBundlingId(int bundlingId) {
        this.bundlingId = bundlingId;
    }

    public int getDistributionOrdersId() {
        return distributionOrdersId;
    }

    public void setDistributionOrdersId(int distributionOrdersId) {
        this.distributionOrdersId = distributionOrdersId;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }
}
