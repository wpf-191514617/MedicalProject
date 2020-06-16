package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class InquiryOrderInfoResponse {


    /**
     * noSend : 0
     * realName :
     * buyStoreVoList : [{"buyGoodsItemVoList":[{"drugCfType":null,"cartId":0,"goodsId":3376,
     * "commonId":3355,"goodsName":"陈广发医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":30,
     * "imageName":"","buyNum":1,"itemAmount":30,"variableItemAmount":0,"goodsFreight":0,
     * "goodsStorage":10000004,"categoryId":1,"goodsStatus":1,"storeId":43,
     * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,"imageSrc":"http://shop
     * .hyj91.com//public/img/default_image.png","allowSend":1,"freightWeight":0,
     * "freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,"isOwnShop":1,
     * "unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,"batchNum1":0,
     * "batchNum1End":0,"batchNum2":0,"webPrice0":30,"webPrice1":0,"webPrice2":0,"webUsable":0,
     * "appPrice0":30,"appPrice1":0,"appPrice2":0,"appUsable":0,"wechatPrice0":30,
     * "wechatPrice1":0,"wechatPrice2":0,"wechatUsable":0,"promotionBeginTime":null,
     * "promotionEndTime":null,"goodsModal":3,"spuImageSrc":"http://shop.hyj91
     * .com//public/img/default_image.png","spuBuyNum":1,"joinBigSale":0,"promotionType":0,
     * "promotionId":0,"promotionTypeText":null,"promotionTitle":"","goodsPrice0":30,
     * "goodsPrice1":0,"goodsPrice2":0,"basePrice":30,"savePrice":0,"payAmount":0,"book":null,
     * "isGift":0,"giftVoList":[],"bundlingId":0,"groupPrice":0,"distributionOrders":{
     * "distributionOrdersId":0,"memberId":0,"distributorId":0,"commonId":0,"storeId":0,
     * "addTime":null,"commissionRate":0,"ordersGoodsId":0,"ordersFinishTime":null,
     * "finishTime":null,"distributionOrdersType":1,"distributionStorePay":0,
     * "distributionStorePayTime":null},"trysPostUseState":0,"trysSendUseState":0,
     * "goodsSerial":"","trysApplyId":0,"contractItem1":0,"contractItem2":0,"contractItem3":0,
     * "contractItem4":0,"contractItem5":0,"contractItem6":0,"contractItem7":0,"contractItem8":0,
     * "contractItem9":0,"contractItem10":0,"goodsContractVoList":[],"limitAmount":0,"chainId":0,
     * "chainName":null,"virtualOverdueRefund":0,"isSecKill":0,"seckillGoodsId":0,
     * "bargainOpenId":0,"couponAmount":0,"shopCommitmentAmount":0,"shopCommitmentRate":0,
     * "downAmount":0,"finalAmount":0,"foreignTaxRate":0,"isForeign":0,"foreignTaxAmount":0,
     * "pointsMoneyAmount":0,"isStoreVIPDiscount":0,"storeVIPDiscount":0,"isLevelMarketing":0}],
     * "buyGoodsSpuVoList":[{"buyGoodsItemVoList":[{"drugCfType":null,"cartId":0,"goodsId":3376,
     * "commonId":3355,"goodsName":"陈广发医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":30,
     * "imageName":"","buyNum":1,"itemAmount":30,"variableItemAmount":0,"goodsFreight":0,
     * "goodsStorage":10000004,"categoryId":1,"goodsStatus":1,"storeId":43,
     * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,"imageSrc":"http://shop
     * .hyj91.com//public/img/default_image.png","allowSend":1,"freightWeight":0,
     * "freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,"isOwnShop":1,
     * "unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,"batchNum1":0,
     * "batchNum1End":0,"batchNum2":0,"webPrice0":30,"webPrice1":0,"webPrice2":0,"webUsable":0,
     * "appPrice0":30,"appPrice1":0,"appPrice2":0,"appUsable":0,"wechatPrice0":30,
     * "wechatPrice1":0,"wechatPrice2":0,"wechatUsable":0,"promotionBeginTime":null,
     * "promotionEndTime":null,"goodsModal":3,"spuImageSrc":"http://shop.hyj91
     * .com//public/img/default_image.png","spuBuyNum":1,"joinBigSale":0,"promotionType":0,
     * "promotionId":0,"promotionTypeText":null,"promotionTitle":"","goodsPrice0":30,
     * "goodsPrice1":0,"goodsPrice2":0,"basePrice":30,"savePrice":0,"payAmount":0,"book":null,
     * "isGift":0,"giftVoList":[],"bundlingId":0,"groupPrice":0,"distributionOrders":{
     * "distributionOrdersId":0,"memberId":0,"distributorId":0,"commonId":0,"storeId":0,
     * "addTime":null,"commissionRate":0,"ordersGoodsId":0,"ordersFinishTime":null,
     * "finishTime":null,"distributionOrdersType":1,"distributionStorePay":0,
     * "distributionStorePayTime":null},"trysPostUseState":0,"trysSendUseState":0,
     * "goodsSerial":"","trysApplyId":0,"contractItem1":0,"contractItem2":0,"contractItem3":0,
     * "contractItem4":0,"contractItem5":0,"contractItem6":0,"contractItem7":0,"contractItem8":0,
     * "contractItem9":0,"contractItem10":0,"goodsContractVoList":[],"limitAmount":0,"chainId":0,
     * "chainName":null,"virtualOverdueRefund":0,"isSecKill":0,"seckillGoodsId":0,
     * "bargainOpenId":0,"couponAmount":0,"shopCommitmentAmount":0,"shopCommitmentRate":0,
     * "downAmount":0,"finalAmount":0,"foreignTaxRate":0,"isForeign":0,"foreignTaxAmount":0,
     * "pointsMoneyAmount":0,"isStoreVIPDiscount":0,"storeVIPDiscount":0,"isLevelMarketing":0}],
     * "goodsName":"陈广发医生","commonId":3355,"imageSrc":"http://shop.hyj91
     * .com//public/img/default_image.png"}],"storeName":"东莞市滨海湾中心医院","storeId":43,"sellerId":0,
     * "isOnline":0,"conform":null,"voucherVoList":[],"buyItemAmount":30,
     * "buyItemExcludejoinBigSaleAmount":0,"buyStoreExcludejoinBigSaleAmount":0,
     * "freightAmount":0,"isOwnShop":1,"cartBundlingVoList":[],"foreignTaxAmount":0,"itemCount":1}]
     * pointsMoneyValue : 1000
     * memberPointsMoney : 0
     * mobile : 15529000512
     * memberPointsCanUse : 0
     * allowPointsMoney : 1
     * memberPoints : 0
     */

    private int noSend;
    private String realName;
    private int pointsMoneyValue;
    private int memberPointsMoney;
    private String mobile;
    private int memberPointsCanUse;
    private int allowPointsMoney;
    private int memberPoints;
    private List<BuyStoreVoListBean> buyStoreVoList;

    public int getNoSend() {
        return noSend;
    }

    public void setNoSend(int noSend) {
        this.noSend = noSend;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getPointsMoneyValue() {
        return pointsMoneyValue;
    }

    public void setPointsMoneyValue(int pointsMoneyValue) {
        this.pointsMoneyValue = pointsMoneyValue;
    }

    public int getMemberPointsMoney() {
        return memberPointsMoney;
    }

    public void setMemberPointsMoney(int memberPointsMoney) {
        this.memberPointsMoney = memberPointsMoney;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getMemberPointsCanUse() {
        return memberPointsCanUse;
    }

    public void setMemberPointsCanUse(int memberPointsCanUse) {
        this.memberPointsCanUse = memberPointsCanUse;
    }

    public int getAllowPointsMoney() {
        return allowPointsMoney;
    }

    public void setAllowPointsMoney(int allowPointsMoney) {
        this.allowPointsMoney = allowPointsMoney;
    }

    public int getMemberPoints() {
        return memberPoints;
    }

    public void setMemberPoints(int memberPoints) {
        this.memberPoints = memberPoints;
    }

    public List<BuyStoreVoListBean> getBuyStoreVoList() {
        return buyStoreVoList;
    }

    public void setBuyStoreVoList(List<BuyStoreVoListBean> buyStoreVoList) {
        this.buyStoreVoList = buyStoreVoList;
    }

    public static class BuyStoreVoListBean {
        /**
         * buyGoodsItemVoList : [{"drugCfType":null,"cartId":0,"goodsId":3376,"commonId":3355,
         * "goodsName":"陈广发医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":30,"imageName":"",
         * "buyNum":1,"itemAmount":30,"variableItemAmount":0,"goodsFreight":0,
         * "goodsStorage":10000004,"categoryId":1,"goodsStatus":1,"storeId":43,
         * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,
         * "imageSrc":"http://shop.hyj91.com//public/img/default_image.png","allowSend":1,
         * "freightWeight":0,"freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,
         * "isOwnShop":1,"unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,
         * "batchNum1":0,"batchNum1End":0,"batchNum2":0,"webPrice0":30,"webPrice1":0,
         * "webPrice2":0,"webUsable":0,"appPrice0":30,"appPrice1":0,"appPrice2":0,"appUsable":0,
         * "wechatPrice0":30,"wechatPrice1":0,"wechatPrice2":0,"wechatUsable":0,
         * "promotionBeginTime":null,"promotionEndTime":null,"goodsModal":3,
         * "spuImageSrc":"http://shop.hyj91.com//public/img/default_image.png","spuBuyNum":1,
         * "joinBigSale":0,"promotionType":0,"promotionId":0,"promotionTypeText":null,
         * "promotionTitle":"","goodsPrice0":30,"goodsPrice1":0,"goodsPrice2":0,"basePrice":30,
         * "savePrice":0,"payAmount":0,"book":null,"isGift":0,"giftVoList":[],"bundlingId":0,
         * "groupPrice":0,"distributionOrders":{"distributionOrdersId":0,"memberId":0,
         * "distributorId":0,"commonId":0,"storeId":0,"addTime":null,"commissionRate":0,
         * "ordersGoodsId":0,"ordersFinishTime":null,"finishTime":null,
         * "distributionOrdersType":1,"distributionStorePay":0,"distributionStorePayTime":null}
         * ,"trysPostUseState":0,"trysSendUseState":0,"goodsSerial":"","trysApplyId":0,
         * "contractItem1":0,"contractItem2":0,"contractItem3":0,"contractItem4":0,
         * "contractItem5":0,"contractItem6":0,"contractItem7":0,"contractItem8":0,
         * "contractItem9":0,"contractItem10":0,"goodsContractVoList":[],"limitAmount":0,
         * "chainId":0,"chainName":null,"virtualOverdueRefund":0,"isSecKill":0,
         * "seckillGoodsId":0,"bargainOpenId":0,"couponAmount":0,"shopCommitmentAmount":0,
         * "shopCommitmentRate":0,"downAmount":0,"finalAmount":0,"foreignTaxRate":0,
         * "isForeign":0,"foreignTaxAmount":0,"pointsMoneyAmount":0,"isStoreVIPDiscount":0,
         * "storeVIPDiscount":0,"isLevelMarketing":0}]
         * buyGoodsSpuVoList : [{"buyGoodsItemVoList":[{"drugCfType":null,"cartId":0,
         * "goodsId":3376,"commonId":3355,"goodsName":"陈广发医生","goodsFullSpecs":"问诊类型：图文问诊",
         * "goodsPrice":30,"imageName":"","buyNum":1,"itemAmount":30,"variableItemAmount":0,
         * "goodsFreight":0,"goodsStorage":10000004,"categoryId":1,"goodsStatus":1,"storeId":43,
         * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,
         * "imageSrc":"http://shop.hyj91.com//public/img/default_image.png","allowSend":1,
         * "freightWeight":0,"freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,
         * "isOwnShop":1,"unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,
         * "batchNum1":0,"batchNum1End":0,"batchNum2":0,"webPrice0":30,"webPrice1":0,
         * "webPrice2":0,"webUsable":0,"appPrice0":30,"appPrice1":0,"appPrice2":0,"appUsable":0,
         * "wechatPrice0":30,"wechatPrice1":0,"wechatPrice2":0,"wechatUsable":0,
         * "promotionBeginTime":null,"promotionEndTime":null,"goodsModal":3,
         * "spuImageSrc":"http://shop.hyj91.com//public/img/default_image.png","spuBuyNum":1,
         * "joinBigSale":0,"promotionType":0,"promotionId":0,"promotionTypeText":null,
         * "promotionTitle":"","goodsPrice0":30,"goodsPrice1":0,"goodsPrice2":0,"basePrice":30,
         * "savePrice":0,"payAmount":0,"book":null,"isGift":0,"giftVoList":[],"bundlingId":0,
         * "groupPrice":0,"distributionOrders":{"distributionOrdersId":0,"memberId":0,
         * "distributorId":0,"commonId":0,"storeId":0,"addTime":null,"commissionRate":0,
         * "ordersGoodsId":0,"ordersFinishTime":null,"finishTime":null,
         * "distributionOrdersType":1,"distributionStorePay":0,"distributionStorePayTime":null}
         * ,"trysPostUseState":0,"trysSendUseState":0,"goodsSerial":"","trysApplyId":0,
         * "contractItem1":0,"contractItem2":0,"contractItem3":0,"contractItem4":0,
         * "contractItem5":0,"contractItem6":0,"contractItem7":0,"contractItem8":0,
         * "contractItem9":0,"contractItem10":0,"goodsContractVoList":[],"limitAmount":0,
         * "chainId":0,"chainName":null,"virtualOverdueRefund":0,"isSecKill":0,
         * "seckillGoodsId":0,"bargainOpenId":0,"couponAmount":0,"shopCommitmentAmount":0,
         * "shopCommitmentRate":0,"downAmount":0,"finalAmount":0,"foreignTaxRate":0,
         * "isForeign":0,"foreignTaxAmount":0,"pointsMoneyAmount":0,"isStoreVIPDiscount":0,
         * "storeVIPDiscount":0,"isLevelMarketing":0}],"goodsName":"陈广发医生","commonId":3355,
         * "imageSrc":"http://shop.hyj91.com//public/img/default_image.png"}]
         * storeName : 东莞市滨海湾中心医院
         * storeId : 43
         * sellerId : 0
         * isOnline : 0
         * conform : null
         * voucherVoList : []
         * buyItemAmount : 30.0
         * buyItemExcludejoinBigSaleAmount : 0.0
         * buyStoreExcludejoinBigSaleAmount : 0.0
         * freightAmount : 0
         * isOwnShop : 1
         * cartBundlingVoList : []
         * foreignTaxAmount : 0.0
         * itemCount : 1
         */

        private String storeName;
        private int storeId;
        private int sellerId;
        private int isOnline;
        private Object conform;
        private double buyItemAmount;
        private double buyItemExcludejoinBigSaleAmount;
        private double buyStoreExcludejoinBigSaleAmount;
        private int freightAmount;
        private int isOwnShop;
        private double foreignTaxAmount;
        private int itemCount;
        private List<BuyGoodsItemVoListBean> buyGoodsItemVoList;
        private List<BuyGoodsSpuVoListBean> buyGoodsSpuVoList;
        private List<?> voucherVoList;
        private List<?> cartBundlingVoList;

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public int getSellerId() {
            return sellerId;
        }

        public void setSellerId(int sellerId) {
            this.sellerId = sellerId;
        }

        public int getIsOnline() {
            return isOnline;
        }

        public void setIsOnline(int isOnline) {
            this.isOnline = isOnline;
        }

        public Object getConform() {
            return conform;
        }

        public void setConform(Object conform) {
            this.conform = conform;
        }

        public double getBuyItemAmount() {
            return buyItemAmount;
        }

        public void setBuyItemAmount(double buyItemAmount) {
            this.buyItemAmount = buyItemAmount;
        }

        public double getBuyItemExcludejoinBigSaleAmount() {
            return buyItemExcludejoinBigSaleAmount;
        }

        public void setBuyItemExcludejoinBigSaleAmount(double buyItemExcludejoinBigSaleAmount) {
            this.buyItemExcludejoinBigSaleAmount = buyItemExcludejoinBigSaleAmount;
        }

        public double getBuyStoreExcludejoinBigSaleAmount() {
            return buyStoreExcludejoinBigSaleAmount;
        }

        public void setBuyStoreExcludejoinBigSaleAmount(double buyStoreExcludejoinBigSaleAmount) {
            this.buyStoreExcludejoinBigSaleAmount = buyStoreExcludejoinBigSaleAmount;
        }

        public int getFreightAmount() {
            return freightAmount;
        }

        public void setFreightAmount(int freightAmount) {
            this.freightAmount = freightAmount;
        }

        public int getIsOwnShop() {
            return isOwnShop;
        }

        public void setIsOwnShop(int isOwnShop) {
            this.isOwnShop = isOwnShop;
        }

        public double getForeignTaxAmount() {
            return foreignTaxAmount;
        }

        public void setForeignTaxAmount(double foreignTaxAmount) {
            this.foreignTaxAmount = foreignTaxAmount;
        }

        public int getItemCount() {
            return itemCount;
        }

        public void setItemCount(int itemCount) {
            this.itemCount = itemCount;
        }

        public List<BuyGoodsItemVoListBean> getBuyGoodsItemVoList() {
            return buyGoodsItemVoList;
        }

        public void setBuyGoodsItemVoList(List<BuyGoodsItemVoListBean> buyGoodsItemVoList) {
            this.buyGoodsItemVoList = buyGoodsItemVoList;
        }

        public List<BuyGoodsSpuVoListBean> getBuyGoodsSpuVoList() {
            return buyGoodsSpuVoList;
        }

        public void setBuyGoodsSpuVoList(List<BuyGoodsSpuVoListBean> buyGoodsSpuVoList) {
            this.buyGoodsSpuVoList = buyGoodsSpuVoList;
        }

        public List<?> getVoucherVoList() {
            return voucherVoList;
        }

        public void setVoucherVoList(List<?> voucherVoList) {
            this.voucherVoList = voucherVoList;
        }

        public List<?> getCartBundlingVoList() {
            return cartBundlingVoList;
        }

        public void setCartBundlingVoList(List<?> cartBundlingVoList) {
            this.cartBundlingVoList = cartBundlingVoList;
        }

        public static class BuyGoodsItemVoListBean {
            /**
             * drugCfType : null
             * cartId : 0
             * goodsId : 3376
             * commonId : 3355
             * goodsName : 陈广发医生
             * goodsFullSpecs : 问诊类型：图文问诊
             * goodsPrice : 30.0
             * imageName :
             * buyNum : 1
             * itemAmount : 30.0
             * variableItemAmount : 0
             * goodsFreight : 0.0
             * goodsStorage : 10000004
             * categoryId : 1
             * goodsStatus : 1
             * storeId : 43
             * storeName : 东莞市滨海湾中心医院
             * storageStatus : 1
             * freightTemplateId : 0
             * imageSrc : http://shop.hyj91.com//public/img/default_image.png
             * allowSend : 1
             * freightWeight : 0.0
             * freightVolume : 0.0
             * categoryId1 : 1
             * categoryId2 : 1
             * categoryId3 : 1
             * isOwnShop : 1
             * unitName : 单
             * batchNumState : 1
             * batchNum0 : 1
             * batchNum0End : 0
             * batchNum1 : 0
             * batchNum1End : 0
             * batchNum2 : 0
             * webPrice0 : 30.0
             * webPrice1 : 0.0
             * webPrice2 : 0.0
             * webUsable : 0
             * appPrice0 : 30.0
             * appPrice1 : 0.0
             * appPrice2 : 0.0
             * appUsable : 0
             * wechatPrice0 : 30.0
             * wechatPrice1 : 0.0
             * wechatPrice2 : 0.0
             * wechatUsable : 0
             * promotionBeginTime : null
             * promotionEndTime : null
             * goodsModal : 3
             * spuImageSrc : http://shop.hyj91.com//public/img/default_image.png
             * spuBuyNum : 1
             * joinBigSale : 0
             * promotionType : 0
             * promotionId : 0
             * promotionTypeText : null
             * promotionTitle :
             * goodsPrice0 : 30.0
             * goodsPrice1 : 0.0
             * goodsPrice2 : 0.0
             * basePrice : 30.0
             * savePrice : 0.0
             * payAmount : 0
             * book : null
             * isGift : 0
             * giftVoList : []
             * bundlingId : 0
             * groupPrice : 0.0
             * distributionOrders : {"distributionOrdersId":0,"memberId":0,"distributorId":0,
             * "commonId":0,"storeId":0,"addTime":null,"commissionRate":0,"ordersGoodsId":0,
             * "ordersFinishTime":null,"finishTime":null,"distributionOrdersType":1,
             * "distributionStorePay":0,"distributionStorePayTime":null}
             * trysPostUseState : 0
             * trysSendUseState : 0
             * goodsSerial :
             * trysApplyId : 0
             * contractItem1 : 0
             * contractItem2 : 0
             * contractItem3 : 0
             * contractItem4 : 0
             * contractItem5 : 0
             * contractItem6 : 0
             * contractItem7 : 0
             * contractItem8 : 0
             * contractItem9 : 0
             * contractItem10 : 0
             * goodsContractVoList : []
             * limitAmount : 0
             * chainId : 0
             * chainName : null
             * virtualOverdueRefund : 0
             * isSecKill : 0
             * seckillGoodsId : 0
             * bargainOpenId : 0
             * couponAmount : 0
             * shopCommitmentAmount : 0
             * shopCommitmentRate : 0.0
             * downAmount : 0
             * finalAmount : 0
             * foreignTaxRate : 0.0
             * isForeign : 0
             * foreignTaxAmount : 0
             * pointsMoneyAmount : 0
             * isStoreVIPDiscount : 0
             * storeVIPDiscount : 0
             * isLevelMarketing : 0
             */

            private Object drugCfType;
            private int cartId;
            private int goodsId;
            private int commonId;
            private String goodsName;
            private String goodsFullSpecs;
            private double goodsPrice;
            private String imageName;
            private int buyNum;
            private double itemAmount;
            private int variableItemAmount;
            private double goodsFreight;
            private int goodsStorage;
            private int categoryId;
            private int goodsStatus;
            private int storeId;
            private String storeName;
            private int storageStatus;
            private int freightTemplateId;
            private String imageSrc;
            private int allowSend;
            private double freightWeight;
            private double freightVolume;
            private int categoryId1;
            private int categoryId2;
            private int categoryId3;
            private int isOwnShop;
            private String unitName;
            private int batchNumState;
            private int batchNum0;
            private int batchNum0End;
            private int batchNum1;
            private int batchNum1End;
            private int batchNum2;
            private double webPrice0;
            private double webPrice1;
            private double webPrice2;
            private int webUsable;
            private double appPrice0;
            private double appPrice1;
            private double appPrice2;
            private int appUsable;
            private double wechatPrice0;
            private double wechatPrice1;
            private double wechatPrice2;
            private int wechatUsable;
            private Object promotionBeginTime;
            private Object promotionEndTime;
            private int goodsModal;
            private String spuImageSrc;
            private int spuBuyNum;
            private int joinBigSale;
            private int promotionType;
            private int promotionId;
            private Object promotionTypeText;
            private String promotionTitle;
            private double goodsPrice0;
            private double goodsPrice1;
            private double goodsPrice2;
            private double basePrice;
            private double savePrice;
            private int payAmount;
            private Object book;
            private int isGift;
            private int bundlingId;
            private double groupPrice;
            private DistributionOrdersBean distributionOrders;
            private int trysPostUseState;
            private int trysSendUseState;
            private String goodsSerial;
            private int trysApplyId;
            private int contractItem1;
            private int contractItem2;
            private int contractItem3;
            private int contractItem4;
            private int contractItem5;
            private int contractItem6;
            private int contractItem7;
            private int contractItem8;
            private int contractItem9;
            private int contractItem10;
            private int limitAmount;
            private int chainId;
            private Object chainName;
            private int virtualOverdueRefund;
            private int isSecKill;
            private int seckillGoodsId;
            private int bargainOpenId;
            private int couponAmount;
            private int shopCommitmentAmount;
            private double shopCommitmentRate;
            private int downAmount;
            private int finalAmount;
            private double foreignTaxRate;
            private int isForeign;
            private int foreignTaxAmount;
            private int pointsMoneyAmount;
            private int isStoreVIPDiscount;
            private int storeVIPDiscount;
            private int isLevelMarketing;
            private List<?> giftVoList;
            private List<?> goodsContractVoList;

            public Object getDrugCfType() {
                return drugCfType;
            }

            public void setDrugCfType(Object drugCfType) {
                this.drugCfType = drugCfType;
            }

            public int getCartId() {
                return cartId;
            }

            public void setCartId(int cartId) {
                this.cartId = cartId;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public int getCommonId() {
                return commonId;
            }

            public void setCommonId(int commonId) {
                this.commonId = commonId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getGoodsFullSpecs() {
                return goodsFullSpecs;
            }

            public void setGoodsFullSpecs(String goodsFullSpecs) {
                this.goodsFullSpecs = goodsFullSpecs;
            }

            public double getGoodsPrice() {
                return goodsPrice;
            }

            public void setGoodsPrice(double goodsPrice) {
                this.goodsPrice = goodsPrice;
            }

            public String getImageName() {
                return imageName;
            }

            public void setImageName(String imageName) {
                this.imageName = imageName;
            }

            public int getBuyNum() {
                return buyNum;
            }

            public void setBuyNum(int buyNum) {
                this.buyNum = buyNum;
            }

            public double getItemAmount() {
                return itemAmount;
            }

            public void setItemAmount(double itemAmount) {
                this.itemAmount = itemAmount;
            }

            public int getVariableItemAmount() {
                return variableItemAmount;
            }

            public void setVariableItemAmount(int variableItemAmount) {
                this.variableItemAmount = variableItemAmount;
            }

            public double getGoodsFreight() {
                return goodsFreight;
            }

            public void setGoodsFreight(double goodsFreight) {
                this.goodsFreight = goodsFreight;
            }

            public int getGoodsStorage() {
                return goodsStorage;
            }

            public void setGoodsStorage(int goodsStorage) {
                this.goodsStorage = goodsStorage;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public int getGoodsStatus() {
                return goodsStatus;
            }

            public void setGoodsStatus(int goodsStatus) {
                this.goodsStatus = goodsStatus;
            }

            public int getStoreId() {
                return storeId;
            }

            public void setStoreId(int storeId) {
                this.storeId = storeId;
            }

            public String getStoreName() {
                return storeName;
            }

            public void setStoreName(String storeName) {
                this.storeName = storeName;
            }

            public int getStorageStatus() {
                return storageStatus;
            }

            public void setStorageStatus(int storageStatus) {
                this.storageStatus = storageStatus;
            }

            public int getFreightTemplateId() {
                return freightTemplateId;
            }

            public void setFreightTemplateId(int freightTemplateId) {
                this.freightTemplateId = freightTemplateId;
            }

            public String getImageSrc() {
                return imageSrc;
            }

            public void setImageSrc(String imageSrc) {
                this.imageSrc = imageSrc;
            }

            public int getAllowSend() {
                return allowSend;
            }

            public void setAllowSend(int allowSend) {
                this.allowSend = allowSend;
            }

            public double getFreightWeight() {
                return freightWeight;
            }

            public void setFreightWeight(double freightWeight) {
                this.freightWeight = freightWeight;
            }

            public double getFreightVolume() {
                return freightVolume;
            }

            public void setFreightVolume(double freightVolume) {
                this.freightVolume = freightVolume;
            }

            public int getCategoryId1() {
                return categoryId1;
            }

            public void setCategoryId1(int categoryId1) {
                this.categoryId1 = categoryId1;
            }

            public int getCategoryId2() {
                return categoryId2;
            }

            public void setCategoryId2(int categoryId2) {
                this.categoryId2 = categoryId2;
            }

            public int getCategoryId3() {
                return categoryId3;
            }

            public void setCategoryId3(int categoryId3) {
                this.categoryId3 = categoryId3;
            }

            public int getIsOwnShop() {
                return isOwnShop;
            }

            public void setIsOwnShop(int isOwnShop) {
                this.isOwnShop = isOwnShop;
            }

            public String getUnitName() {
                return unitName;
            }

            public void setUnitName(String unitName) {
                this.unitName = unitName;
            }

            public int getBatchNumState() {
                return batchNumState;
            }

            public void setBatchNumState(int batchNumState) {
                this.batchNumState = batchNumState;
            }

            public int getBatchNum0() {
                return batchNum0;
            }

            public void setBatchNum0(int batchNum0) {
                this.batchNum0 = batchNum0;
            }

            public int getBatchNum0End() {
                return batchNum0End;
            }

            public void setBatchNum0End(int batchNum0End) {
                this.batchNum0End = batchNum0End;
            }

            public int getBatchNum1() {
                return batchNum1;
            }

            public void setBatchNum1(int batchNum1) {
                this.batchNum1 = batchNum1;
            }

            public int getBatchNum1End() {
                return batchNum1End;
            }

            public void setBatchNum1End(int batchNum1End) {
                this.batchNum1End = batchNum1End;
            }

            public int getBatchNum2() {
                return batchNum2;
            }

            public void setBatchNum2(int batchNum2) {
                this.batchNum2 = batchNum2;
            }

            public double getWebPrice0() {
                return webPrice0;
            }

            public void setWebPrice0(double webPrice0) {
                this.webPrice0 = webPrice0;
            }

            public double getWebPrice1() {
                return webPrice1;
            }

            public void setWebPrice1(double webPrice1) {
                this.webPrice1 = webPrice1;
            }

            public double getWebPrice2() {
                return webPrice2;
            }

            public void setWebPrice2(double webPrice2) {
                this.webPrice2 = webPrice2;
            }

            public int getWebUsable() {
                return webUsable;
            }

            public void setWebUsable(int webUsable) {
                this.webUsable = webUsable;
            }

            public double getAppPrice0() {
                return appPrice0;
            }

            public void setAppPrice0(double appPrice0) {
                this.appPrice0 = appPrice0;
            }

            public double getAppPrice1() {
                return appPrice1;
            }

            public void setAppPrice1(double appPrice1) {
                this.appPrice1 = appPrice1;
            }

            public double getAppPrice2() {
                return appPrice2;
            }

            public void setAppPrice2(double appPrice2) {
                this.appPrice2 = appPrice2;
            }

            public int getAppUsable() {
                return appUsable;
            }

            public void setAppUsable(int appUsable) {
                this.appUsable = appUsable;
            }

            public double getWechatPrice0() {
                return wechatPrice0;
            }

            public void setWechatPrice0(double wechatPrice0) {
                this.wechatPrice0 = wechatPrice0;
            }

            public double getWechatPrice1() {
                return wechatPrice1;
            }

            public void setWechatPrice1(double wechatPrice1) {
                this.wechatPrice1 = wechatPrice1;
            }

            public double getWechatPrice2() {
                return wechatPrice2;
            }

            public void setWechatPrice2(double wechatPrice2) {
                this.wechatPrice2 = wechatPrice2;
            }

            public int getWechatUsable() {
                return wechatUsable;
            }

            public void setWechatUsable(int wechatUsable) {
                this.wechatUsable = wechatUsable;
            }

            public Object getPromotionBeginTime() {
                return promotionBeginTime;
            }

            public void setPromotionBeginTime(Object promotionBeginTime) {
                this.promotionBeginTime = promotionBeginTime;
            }

            public Object getPromotionEndTime() {
                return promotionEndTime;
            }

            public void setPromotionEndTime(Object promotionEndTime) {
                this.promotionEndTime = promotionEndTime;
            }

            public int getGoodsModal() {
                return goodsModal;
            }

            public void setGoodsModal(int goodsModal) {
                this.goodsModal = goodsModal;
            }

            public String getSpuImageSrc() {
                return spuImageSrc;
            }

            public void setSpuImageSrc(String spuImageSrc) {
                this.spuImageSrc = spuImageSrc;
            }

            public int getSpuBuyNum() {
                return spuBuyNum;
            }

            public void setSpuBuyNum(int spuBuyNum) {
                this.spuBuyNum = spuBuyNum;
            }

            public int getJoinBigSale() {
                return joinBigSale;
            }

            public void setJoinBigSale(int joinBigSale) {
                this.joinBigSale = joinBigSale;
            }

            public int getPromotionType() {
                return promotionType;
            }

            public void setPromotionType(int promotionType) {
                this.promotionType = promotionType;
            }

            public int getPromotionId() {
                return promotionId;
            }

            public void setPromotionId(int promotionId) {
                this.promotionId = promotionId;
            }

            public Object getPromotionTypeText() {
                return promotionTypeText;
            }

            public void setPromotionTypeText(Object promotionTypeText) {
                this.promotionTypeText = promotionTypeText;
            }

            public String getPromotionTitle() {
                return promotionTitle;
            }

            public void setPromotionTitle(String promotionTitle) {
                this.promotionTitle = promotionTitle;
            }

            public double getGoodsPrice0() {
                return goodsPrice0;
            }

            public void setGoodsPrice0(double goodsPrice0) {
                this.goodsPrice0 = goodsPrice0;
            }

            public double getGoodsPrice1() {
                return goodsPrice1;
            }

            public void setGoodsPrice1(double goodsPrice1) {
                this.goodsPrice1 = goodsPrice1;
            }

            public double getGoodsPrice2() {
                return goodsPrice2;
            }

            public void setGoodsPrice2(double goodsPrice2) {
                this.goodsPrice2 = goodsPrice2;
            }

            public double getBasePrice() {
                return basePrice;
            }

            public void setBasePrice(double basePrice) {
                this.basePrice = basePrice;
            }

            public double getSavePrice() {
                return savePrice;
            }

            public void setSavePrice(double savePrice) {
                this.savePrice = savePrice;
            }

            public int getPayAmount() {
                return payAmount;
            }

            public void setPayAmount(int payAmount) {
                this.payAmount = payAmount;
            }

            public Object getBook() {
                return book;
            }

            public void setBook(Object book) {
                this.book = book;
            }

            public int getIsGift() {
                return isGift;
            }

            public void setIsGift(int isGift) {
                this.isGift = isGift;
            }

            public int getBundlingId() {
                return bundlingId;
            }

            public void setBundlingId(int bundlingId) {
                this.bundlingId = bundlingId;
            }

            public double getGroupPrice() {
                return groupPrice;
            }

            public void setGroupPrice(double groupPrice) {
                this.groupPrice = groupPrice;
            }

            public DistributionOrdersBean getDistributionOrders() {
                return distributionOrders;
            }

            public void setDistributionOrders(DistributionOrdersBean distributionOrders) {
                this.distributionOrders = distributionOrders;
            }

            public int getTrysPostUseState() {
                return trysPostUseState;
            }

            public void setTrysPostUseState(int trysPostUseState) {
                this.trysPostUseState = trysPostUseState;
            }

            public int getTrysSendUseState() {
                return trysSendUseState;
            }

            public void setTrysSendUseState(int trysSendUseState) {
                this.trysSendUseState = trysSendUseState;
            }

            public String getGoodsSerial() {
                return goodsSerial;
            }

            public void setGoodsSerial(String goodsSerial) {
                this.goodsSerial = goodsSerial;
            }

            public int getTrysApplyId() {
                return trysApplyId;
            }

            public void setTrysApplyId(int trysApplyId) {
                this.trysApplyId = trysApplyId;
            }

            public int getContractItem1() {
                return contractItem1;
            }

            public void setContractItem1(int contractItem1) {
                this.contractItem1 = contractItem1;
            }

            public int getContractItem2() {
                return contractItem2;
            }

            public void setContractItem2(int contractItem2) {
                this.contractItem2 = contractItem2;
            }

            public int getContractItem3() {
                return contractItem3;
            }

            public void setContractItem3(int contractItem3) {
                this.contractItem3 = contractItem3;
            }

            public int getContractItem4() {
                return contractItem4;
            }

            public void setContractItem4(int contractItem4) {
                this.contractItem4 = contractItem4;
            }

            public int getContractItem5() {
                return contractItem5;
            }

            public void setContractItem5(int contractItem5) {
                this.contractItem5 = contractItem5;
            }

            public int getContractItem6() {
                return contractItem6;
            }

            public void setContractItem6(int contractItem6) {
                this.contractItem6 = contractItem6;
            }

            public int getContractItem7() {
                return contractItem7;
            }

            public void setContractItem7(int contractItem7) {
                this.contractItem7 = contractItem7;
            }

            public int getContractItem8() {
                return contractItem8;
            }

            public void setContractItem8(int contractItem8) {
                this.contractItem8 = contractItem8;
            }

            public int getContractItem9() {
                return contractItem9;
            }

            public void setContractItem9(int contractItem9) {
                this.contractItem9 = contractItem9;
            }

            public int getContractItem10() {
                return contractItem10;
            }

            public void setContractItem10(int contractItem10) {
                this.contractItem10 = contractItem10;
            }

            public int getLimitAmount() {
                return limitAmount;
            }

            public void setLimitAmount(int limitAmount) {
                this.limitAmount = limitAmount;
            }

            public int getChainId() {
                return chainId;
            }

            public void setChainId(int chainId) {
                this.chainId = chainId;
            }

            public Object getChainName() {
                return chainName;
            }

            public void setChainName(Object chainName) {
                this.chainName = chainName;
            }

            public int getVirtualOverdueRefund() {
                return virtualOverdueRefund;
            }

            public void setVirtualOverdueRefund(int virtualOverdueRefund) {
                this.virtualOverdueRefund = virtualOverdueRefund;
            }

            public int getIsSecKill() {
                return isSecKill;
            }

            public void setIsSecKill(int isSecKill) {
                this.isSecKill = isSecKill;
            }

            public int getSeckillGoodsId() {
                return seckillGoodsId;
            }

            public void setSeckillGoodsId(int seckillGoodsId) {
                this.seckillGoodsId = seckillGoodsId;
            }

            public int getBargainOpenId() {
                return bargainOpenId;
            }

            public void setBargainOpenId(int bargainOpenId) {
                this.bargainOpenId = bargainOpenId;
            }

            public int getCouponAmount() {
                return couponAmount;
            }

            public void setCouponAmount(int couponAmount) {
                this.couponAmount = couponAmount;
            }

            public int getShopCommitmentAmount() {
                return shopCommitmentAmount;
            }

            public void setShopCommitmentAmount(int shopCommitmentAmount) {
                this.shopCommitmentAmount = shopCommitmentAmount;
            }

            public double getShopCommitmentRate() {
                return shopCommitmentRate;
            }

            public void setShopCommitmentRate(double shopCommitmentRate) {
                this.shopCommitmentRate = shopCommitmentRate;
            }

            public int getDownAmount() {
                return downAmount;
            }

            public void setDownAmount(int downAmount) {
                this.downAmount = downAmount;
            }

            public int getFinalAmount() {
                return finalAmount;
            }

            public void setFinalAmount(int finalAmount) {
                this.finalAmount = finalAmount;
            }

            public double getForeignTaxRate() {
                return foreignTaxRate;
            }

            public void setForeignTaxRate(double foreignTaxRate) {
                this.foreignTaxRate = foreignTaxRate;
            }

            public int getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(int isForeign) {
                this.isForeign = isForeign;
            }

            public int getForeignTaxAmount() {
                return foreignTaxAmount;
            }

            public void setForeignTaxAmount(int foreignTaxAmount) {
                this.foreignTaxAmount = foreignTaxAmount;
            }

            public int getPointsMoneyAmount() {
                return pointsMoneyAmount;
            }

            public void setPointsMoneyAmount(int pointsMoneyAmount) {
                this.pointsMoneyAmount = pointsMoneyAmount;
            }

            public int getIsStoreVIPDiscount() {
                return isStoreVIPDiscount;
            }

            public void setIsStoreVIPDiscount(int isStoreVIPDiscount) {
                this.isStoreVIPDiscount = isStoreVIPDiscount;
            }

            public int getStoreVIPDiscount() {
                return storeVIPDiscount;
            }

            public void setStoreVIPDiscount(int storeVIPDiscount) {
                this.storeVIPDiscount = storeVIPDiscount;
            }

            public int getIsLevelMarketing() {
                return isLevelMarketing;
            }

            public void setIsLevelMarketing(int isLevelMarketing) {
                this.isLevelMarketing = isLevelMarketing;
            }

            public List<?> getGiftVoList() {
                return giftVoList;
            }

            public void setGiftVoList(List<?> giftVoList) {
                this.giftVoList = giftVoList;
            }

            public List<?> getGoodsContractVoList() {
                return goodsContractVoList;
            }

            public void setGoodsContractVoList(List<?> goodsContractVoList) {
                this.goodsContractVoList = goodsContractVoList;
            }

            public static class DistributionOrdersBean {
                /**
                 * distributionOrdersId : 0
                 * memberId : 0
                 * distributorId : 0
                 * commonId : 0
                 * storeId : 0
                 * addTime : null
                 * commissionRate : 0
                 * ordersGoodsId : 0
                 * ordersFinishTime : null
                 * finishTime : null
                 * distributionOrdersType : 1
                 * distributionStorePay : 0
                 * distributionStorePayTime : null
                 */

                private int distributionOrdersId;
                private int memberId;
                private int distributorId;
                private int commonId;
                private int storeId;
                private Object addTime;
                private int commissionRate;
                private int ordersGoodsId;
                private Object ordersFinishTime;
                private Object finishTime;
                private int distributionOrdersType;
                private int distributionStorePay;
                private Object distributionStorePayTime;

                public int getDistributionOrdersId() {
                    return distributionOrdersId;
                }

                public void setDistributionOrdersId(int distributionOrdersId) {
                    this.distributionOrdersId = distributionOrdersId;
                }

                public int getMemberId() {
                    return memberId;
                }

                public void setMemberId(int memberId) {
                    this.memberId = memberId;
                }

                public int getDistributorId() {
                    return distributorId;
                }

                public void setDistributorId(int distributorId) {
                    this.distributorId = distributorId;
                }

                public int getCommonId() {
                    return commonId;
                }

                public void setCommonId(int commonId) {
                    this.commonId = commonId;
                }

                public int getStoreId() {
                    return storeId;
                }

                public void setStoreId(int storeId) {
                    this.storeId = storeId;
                }

                public Object getAddTime() {
                    return addTime;
                }

                public void setAddTime(Object addTime) {
                    this.addTime = addTime;
                }

                public int getCommissionRate() {
                    return commissionRate;
                }

                public void setCommissionRate(int commissionRate) {
                    this.commissionRate = commissionRate;
                }

                public int getOrdersGoodsId() {
                    return ordersGoodsId;
                }

                public void setOrdersGoodsId(int ordersGoodsId) {
                    this.ordersGoodsId = ordersGoodsId;
                }

                public Object getOrdersFinishTime() {
                    return ordersFinishTime;
                }

                public void setOrdersFinishTime(Object ordersFinishTime) {
                    this.ordersFinishTime = ordersFinishTime;
                }

                public Object getFinishTime() {
                    return finishTime;
                }

                public void setFinishTime(Object finishTime) {
                    this.finishTime = finishTime;
                }

                public int getDistributionOrdersType() {
                    return distributionOrdersType;
                }

                public void setDistributionOrdersType(int distributionOrdersType) {
                    this.distributionOrdersType = distributionOrdersType;
                }

                public int getDistributionStorePay() {
                    return distributionStorePay;
                }

                public void setDistributionStorePay(int distributionStorePay) {
                    this.distributionStorePay = distributionStorePay;
                }

                public Object getDistributionStorePayTime() {
                    return distributionStorePayTime;
                }

                public void setDistributionStorePayTime(Object distributionStorePayTime) {
                    this.distributionStorePayTime = distributionStorePayTime;
                }
            }
        }

        public static class BuyGoodsSpuVoListBean {
            /**
             * buyGoodsItemVoList : [{"drugCfType":null,"cartId":0,"goodsId":3376,
             * "commonId":3355,"goodsName":"陈广发医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":30,
             * "imageName":"","buyNum":1,"itemAmount":30,"variableItemAmount":0,"goodsFreight":0,
             * "goodsStorage":10000004,"categoryId":1,"goodsStatus":1,"storeId":43,
             * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,
             * "imageSrc":"http://shop.hyj91.com//public/img/default_image.png","allowSend":1,
             * "freightWeight":0,"freightVolume":0,"categoryId1":1,"categoryId2":1,
             * "categoryId3":1,"isOwnShop":1,"unitName":"单","batchNumState":1,"batchNum0":1,
             * "batchNum0End":0,"batchNum1":0,"batchNum1End":0,"batchNum2":0,"webPrice0":30,
             * "webPrice1":0,"webPrice2":0,"webUsable":0,"appPrice0":30,"appPrice1":0,
             * "appPrice2":0,"appUsable":0,"wechatPrice0":30,"wechatPrice1":0,"wechatPrice2":0,
             * "wechatUsable":0,"promotionBeginTime":null,"promotionEndTime":null,"goodsModal":3,
             * "spuImageSrc":"http://shop.hyj91.com//public/img/default_image.png","spuBuyNum":1,
             * "joinBigSale":0,"promotionType":0,"promotionId":0,"promotionTypeText":null,
             * "promotionTitle":"","goodsPrice0":30,"goodsPrice1":0,"goodsPrice2":0,
             * "basePrice":30,"savePrice":0,"payAmount":0,"book":null,"isGift":0,"giftVoList":[],
             * "bundlingId":0,"groupPrice":0,"distributionOrders":{"distributionOrdersId":0,
             * "memberId":0,"distributorId":0,"commonId":0,"storeId":0,"addTime":null,
             * "commissionRate":0,"ordersGoodsId":0,"ordersFinishTime":null,"finishTime":null,
             * "distributionOrdersType":1,"distributionStorePay":0,
             * "distributionStorePayTime":null},"trysPostUseState":0,"trysSendUseState":0,
             * "goodsSerial":"","trysApplyId":0,"contractItem1":0,"contractItem2":0,
             * "contractItem3":0,"contractItem4":0,"contractItem5":0,"contractItem6":0,
             * "contractItem7":0,"contractItem8":0,"contractItem9":0,"contractItem10":0,
             * "goodsContractVoList":[],"limitAmount":0,"chainId":0,"chainName":null,
             * "virtualOverdueRefund":0,"isSecKill":0,"seckillGoodsId":0,"bargainOpenId":0,
             * "couponAmount":0,"shopCommitmentAmount":0,"shopCommitmentRate":0,"downAmount":0,
             * "finalAmount":0,"foreignTaxRate":0,"isForeign":0,"foreignTaxAmount":0,
             * "pointsMoneyAmount":0,"isStoreVIPDiscount":0,"storeVIPDiscount":0,
             * "isLevelMarketing":0}]
             * goodsName : 陈广发医生
             * commonId : 3355
             * imageSrc : http://shop.hyj91.com//public/img/default_image.png
             */

            private String goodsName;
            private int commonId;
            private String imageSrc;
            private List<BuyGoodsItemVoListBeanX> buyGoodsItemVoList;

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public int getCommonId() {
                return commonId;
            }

            public void setCommonId(int commonId) {
                this.commonId = commonId;
            }

            public String getImageSrc() {
                return imageSrc;
            }

            public void setImageSrc(String imageSrc) {
                this.imageSrc = imageSrc;
            }

            public List<BuyGoodsItemVoListBeanX> getBuyGoodsItemVoList() {
                return buyGoodsItemVoList;
            }

            public void setBuyGoodsItemVoList(List<BuyGoodsItemVoListBeanX> buyGoodsItemVoList) {
                this.buyGoodsItemVoList = buyGoodsItemVoList;
            }

            public static class BuyGoodsItemVoListBeanX {
                /**
                 * drugCfType : null
                 * cartId : 0
                 * goodsId : 3376
                 * commonId : 3355
                 * goodsName : 陈广发医生
                 * goodsFullSpecs : 问诊类型：图文问诊
                 * goodsPrice : 30.0
                 * imageName :
                 * buyNum : 1
                 * itemAmount : 30.0
                 * variableItemAmount : 0
                 * goodsFreight : 0.0
                 * goodsStorage : 10000004
                 * categoryId : 1
                 * goodsStatus : 1
                 * storeId : 43
                 * storeName : 东莞市滨海湾中心医院
                 * storageStatus : 1
                 * freightTemplateId : 0
                 * imageSrc : http://shop.hyj91.com//public/img/default_image.png
                 * allowSend : 1
                 * freightWeight : 0.0
                 * freightVolume : 0.0
                 * categoryId1 : 1
                 * categoryId2 : 1
                 * categoryId3 : 1
                 * isOwnShop : 1
                 * unitName : 单
                 * batchNumState : 1
                 * batchNum0 : 1
                 * batchNum0End : 0
                 * batchNum1 : 0
                 * batchNum1End : 0
                 * batchNum2 : 0
                 * webPrice0 : 30.0
                 * webPrice1 : 0.0
                 * webPrice2 : 0.0
                 * webUsable : 0
                 * appPrice0 : 30.0
                 * appPrice1 : 0.0
                 * appPrice2 : 0.0
                 * appUsable : 0
                 * wechatPrice0 : 30.0
                 * wechatPrice1 : 0.0
                 * wechatPrice2 : 0.0
                 * wechatUsable : 0
                 * promotionBeginTime : null
                 * promotionEndTime : null
                 * goodsModal : 3
                 * spuImageSrc : http://shop.hyj91.com//public/img/default_image.png
                 * spuBuyNum : 1
                 * joinBigSale : 0
                 * promotionType : 0
                 * promotionId : 0
                 * promotionTypeText : null
                 * promotionTitle :
                 * goodsPrice0 : 30.0
                 * goodsPrice1 : 0.0
                 * goodsPrice2 : 0.0
                 * basePrice : 30.0
                 * savePrice : 0.0
                 * payAmount : 0
                 * book : null
                 * isGift : 0
                 * giftVoList : []
                 * bundlingId : 0
                 * groupPrice : 0.0
                 * distributionOrders : {"distributionOrdersId":0,"memberId":0,"distributorId":0,
                 * "commonId":0,"storeId":0,"addTime":null,"commissionRate":0,"ordersGoodsId":0,
                 * "ordersFinishTime":null,"finishTime":null,"distributionOrdersType":1,
                 * "distributionStorePay":0,"distributionStorePayTime":null}
                 * trysPostUseState : 0
                 * trysSendUseState : 0
                 * goodsSerial :
                 * trysApplyId : 0
                 * contractItem1 : 0
                 * contractItem2 : 0
                 * contractItem3 : 0
                 * contractItem4 : 0
                 * contractItem5 : 0
                 * contractItem6 : 0
                 * contractItem7 : 0
                 * contractItem8 : 0
                 * contractItem9 : 0
                 * contractItem10 : 0
                 * goodsContractVoList : []
                 * limitAmount : 0
                 * chainId : 0
                 * chainName : null
                 * virtualOverdueRefund : 0
                 * isSecKill : 0
                 * seckillGoodsId : 0
                 * bargainOpenId : 0
                 * couponAmount : 0
                 * shopCommitmentAmount : 0
                 * shopCommitmentRate : 0.0
                 * downAmount : 0
                 * finalAmount : 0
                 * foreignTaxRate : 0.0
                 * isForeign : 0
                 * foreignTaxAmount : 0
                 * pointsMoneyAmount : 0
                 * isStoreVIPDiscount : 0
                 * storeVIPDiscount : 0
                 * isLevelMarketing : 0
                 */

                private Object drugCfType;
                private int cartId;
                private int goodsId;
                private int commonId;
                private String goodsName;
                private String goodsFullSpecs;
                private double goodsPrice;
                private String imageName;
                private int buyNum;
                private double itemAmount;
                private int variableItemAmount;
                private double goodsFreight;
                private int goodsStorage;
                private int categoryId;
                private int goodsStatus;
                private int storeId;
                private String storeName;
                private int storageStatus;
                private int freightTemplateId;
                private String imageSrc;
                private int allowSend;
                private double freightWeight;
                private double freightVolume;
                private int categoryId1;
                private int categoryId2;
                private int categoryId3;
                private int isOwnShop;
                private String unitName;
                private int batchNumState;
                private int batchNum0;
                private int batchNum0End;
                private int batchNum1;
                private int batchNum1End;
                private int batchNum2;
                private double webPrice0;
                private double webPrice1;
                private double webPrice2;
                private int webUsable;
                private double appPrice0;
                private double appPrice1;
                private double appPrice2;
                private int appUsable;
                private double wechatPrice0;
                private double wechatPrice1;
                private double wechatPrice2;
                private int wechatUsable;
                private Object promotionBeginTime;
                private Object promotionEndTime;
                private int goodsModal;
                private String spuImageSrc;
                private int spuBuyNum;
                private int joinBigSale;
                private int promotionType;
                private int promotionId;
                private Object promotionTypeText;
                private String promotionTitle;
                private double goodsPrice0;
                private double goodsPrice1;
                private double goodsPrice2;
                private double basePrice;
                private double savePrice;
                private int payAmount;
                private Object book;
                private int isGift;
                private int bundlingId;
                private double groupPrice;
                private DistributionOrdersBeanX distributionOrders;
                private int trysPostUseState;
                private int trysSendUseState;
                private String goodsSerial;
                private int trysApplyId;
                private int contractItem1;
                private int contractItem2;
                private int contractItem3;
                private int contractItem4;
                private int contractItem5;
                private int contractItem6;
                private int contractItem7;
                private int contractItem8;
                private int contractItem9;
                private int contractItem10;
                private int limitAmount;
                private int chainId;
                private Object chainName;
                private int virtualOverdueRefund;
                private int isSecKill;
                private int seckillGoodsId;
                private int bargainOpenId;
                private int couponAmount;
                private int shopCommitmentAmount;
                private double shopCommitmentRate;
                private int downAmount;
                private int finalAmount;
                private double foreignTaxRate;
                private int isForeign;
                private int foreignTaxAmount;
                private int pointsMoneyAmount;
                private int isStoreVIPDiscount;
                private int storeVIPDiscount;
                private int isLevelMarketing;
                private List<?> giftVoList;
                private List<?> goodsContractVoList;

                public Object getDrugCfType() {
                    return drugCfType;
                }

                public void setDrugCfType(Object drugCfType) {
                    this.drugCfType = drugCfType;
                }

                public int getCartId() {
                    return cartId;
                }

                public void setCartId(int cartId) {
                    this.cartId = cartId;
                }

                public int getGoodsId() {
                    return goodsId;
                }

                public void setGoodsId(int goodsId) {
                    this.goodsId = goodsId;
                }

                public int getCommonId() {
                    return commonId;
                }

                public void setCommonId(int commonId) {
                    this.commonId = commonId;
                }

                public String getGoodsName() {
                    return goodsName;
                }

                public void setGoodsName(String goodsName) {
                    this.goodsName = goodsName;
                }

                public String getGoodsFullSpecs() {
                    return goodsFullSpecs;
                }

                public void setGoodsFullSpecs(String goodsFullSpecs) {
                    this.goodsFullSpecs = goodsFullSpecs;
                }

                public double getGoodsPrice() {
                    return goodsPrice;
                }

                public void setGoodsPrice(double goodsPrice) {
                    this.goodsPrice = goodsPrice;
                }

                public String getImageName() {
                    return imageName;
                }

                public void setImageName(String imageName) {
                    this.imageName = imageName;
                }

                public int getBuyNum() {
                    return buyNum;
                }

                public void setBuyNum(int buyNum) {
                    this.buyNum = buyNum;
                }

                public double getItemAmount() {
                    return itemAmount;
                }

                public void setItemAmount(double itemAmount) {
                    this.itemAmount = itemAmount;
                }

                public int getVariableItemAmount() {
                    return variableItemAmount;
                }

                public void setVariableItemAmount(int variableItemAmount) {
                    this.variableItemAmount = variableItemAmount;
                }

                public double getGoodsFreight() {
                    return goodsFreight;
                }

                public void setGoodsFreight(double goodsFreight) {
                    this.goodsFreight = goodsFreight;
                }

                public int getGoodsStorage() {
                    return goodsStorage;
                }

                public void setGoodsStorage(int goodsStorage) {
                    this.goodsStorage = goodsStorage;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public int getGoodsStatus() {
                    return goodsStatus;
                }

                public void setGoodsStatus(int goodsStatus) {
                    this.goodsStatus = goodsStatus;
                }

                public int getStoreId() {
                    return storeId;
                }

                public void setStoreId(int storeId) {
                    this.storeId = storeId;
                }

                public String getStoreName() {
                    return storeName;
                }

                public void setStoreName(String storeName) {
                    this.storeName = storeName;
                }

                public int getStorageStatus() {
                    return storageStatus;
                }

                public void setStorageStatus(int storageStatus) {
                    this.storageStatus = storageStatus;
                }

                public int getFreightTemplateId() {
                    return freightTemplateId;
                }

                public void setFreightTemplateId(int freightTemplateId) {
                    this.freightTemplateId = freightTemplateId;
                }

                public String getImageSrc() {
                    return imageSrc;
                }

                public void setImageSrc(String imageSrc) {
                    this.imageSrc = imageSrc;
                }

                public int getAllowSend() {
                    return allowSend;
                }

                public void setAllowSend(int allowSend) {
                    this.allowSend = allowSend;
                }

                public double getFreightWeight() {
                    return freightWeight;
                }

                public void setFreightWeight(double freightWeight) {
                    this.freightWeight = freightWeight;
                }

                public double getFreightVolume() {
                    return freightVolume;
                }

                public void setFreightVolume(double freightVolume) {
                    this.freightVolume = freightVolume;
                }

                public int getCategoryId1() {
                    return categoryId1;
                }

                public void setCategoryId1(int categoryId1) {
                    this.categoryId1 = categoryId1;
                }

                public int getCategoryId2() {
                    return categoryId2;
                }

                public void setCategoryId2(int categoryId2) {
                    this.categoryId2 = categoryId2;
                }

                public int getCategoryId3() {
                    return categoryId3;
                }

                public void setCategoryId3(int categoryId3) {
                    this.categoryId3 = categoryId3;
                }

                public int getIsOwnShop() {
                    return isOwnShop;
                }

                public void setIsOwnShop(int isOwnShop) {
                    this.isOwnShop = isOwnShop;
                }

                public String getUnitName() {
                    return unitName;
                }

                public void setUnitName(String unitName) {
                    this.unitName = unitName;
                }

                public int getBatchNumState() {
                    return batchNumState;
                }

                public void setBatchNumState(int batchNumState) {
                    this.batchNumState = batchNumState;
                }

                public int getBatchNum0() {
                    return batchNum0;
                }

                public void setBatchNum0(int batchNum0) {
                    this.batchNum0 = batchNum0;
                }

                public int getBatchNum0End() {
                    return batchNum0End;
                }

                public void setBatchNum0End(int batchNum0End) {
                    this.batchNum0End = batchNum0End;
                }

                public int getBatchNum1() {
                    return batchNum1;
                }

                public void setBatchNum1(int batchNum1) {
                    this.batchNum1 = batchNum1;
                }

                public int getBatchNum1End() {
                    return batchNum1End;
                }

                public void setBatchNum1End(int batchNum1End) {
                    this.batchNum1End = batchNum1End;
                }

                public int getBatchNum2() {
                    return batchNum2;
                }

                public void setBatchNum2(int batchNum2) {
                    this.batchNum2 = batchNum2;
                }

                public double getWebPrice0() {
                    return webPrice0;
                }

                public void setWebPrice0(double webPrice0) {
                    this.webPrice0 = webPrice0;
                }

                public double getWebPrice1() {
                    return webPrice1;
                }

                public void setWebPrice1(double webPrice1) {
                    this.webPrice1 = webPrice1;
                }

                public double getWebPrice2() {
                    return webPrice2;
                }

                public void setWebPrice2(double webPrice2) {
                    this.webPrice2 = webPrice2;
                }

                public int getWebUsable() {
                    return webUsable;
                }

                public void setWebUsable(int webUsable) {
                    this.webUsable = webUsable;
                }

                public double getAppPrice0() {
                    return appPrice0;
                }

                public void setAppPrice0(double appPrice0) {
                    this.appPrice0 = appPrice0;
                }

                public double getAppPrice1() {
                    return appPrice1;
                }

                public void setAppPrice1(double appPrice1) {
                    this.appPrice1 = appPrice1;
                }

                public double getAppPrice2() {
                    return appPrice2;
                }

                public void setAppPrice2(double appPrice2) {
                    this.appPrice2 = appPrice2;
                }

                public int getAppUsable() {
                    return appUsable;
                }

                public void setAppUsable(int appUsable) {
                    this.appUsable = appUsable;
                }

                public double getWechatPrice0() {
                    return wechatPrice0;
                }

                public void setWechatPrice0(double wechatPrice0) {
                    this.wechatPrice0 = wechatPrice0;
                }

                public double getWechatPrice1() {
                    return wechatPrice1;
                }

                public void setWechatPrice1(double wechatPrice1) {
                    this.wechatPrice1 = wechatPrice1;
                }

                public double getWechatPrice2() {
                    return wechatPrice2;
                }

                public void setWechatPrice2(double wechatPrice2) {
                    this.wechatPrice2 = wechatPrice2;
                }

                public int getWechatUsable() {
                    return wechatUsable;
                }

                public void setWechatUsable(int wechatUsable) {
                    this.wechatUsable = wechatUsable;
                }

                public Object getPromotionBeginTime() {
                    return promotionBeginTime;
                }

                public void setPromotionBeginTime(Object promotionBeginTime) {
                    this.promotionBeginTime = promotionBeginTime;
                }

                public Object getPromotionEndTime() {
                    return promotionEndTime;
                }

                public void setPromotionEndTime(Object promotionEndTime) {
                    this.promotionEndTime = promotionEndTime;
                }

                public int getGoodsModal() {
                    return goodsModal;
                }

                public void setGoodsModal(int goodsModal) {
                    this.goodsModal = goodsModal;
                }

                public String getSpuImageSrc() {
                    return spuImageSrc;
                }

                public void setSpuImageSrc(String spuImageSrc) {
                    this.spuImageSrc = spuImageSrc;
                }

                public int getSpuBuyNum() {
                    return spuBuyNum;
                }

                public void setSpuBuyNum(int spuBuyNum) {
                    this.spuBuyNum = spuBuyNum;
                }

                public int getJoinBigSale() {
                    return joinBigSale;
                }

                public void setJoinBigSale(int joinBigSale) {
                    this.joinBigSale = joinBigSale;
                }

                public int getPromotionType() {
                    return promotionType;
                }

                public void setPromotionType(int promotionType) {
                    this.promotionType = promotionType;
                }

                public int getPromotionId() {
                    return promotionId;
                }

                public void setPromotionId(int promotionId) {
                    this.promotionId = promotionId;
                }

                public Object getPromotionTypeText() {
                    return promotionTypeText;
                }

                public void setPromotionTypeText(Object promotionTypeText) {
                    this.promotionTypeText = promotionTypeText;
                }

                public String getPromotionTitle() {
                    return promotionTitle;
                }

                public void setPromotionTitle(String promotionTitle) {
                    this.promotionTitle = promotionTitle;
                }

                public double getGoodsPrice0() {
                    return goodsPrice0;
                }

                public void setGoodsPrice0(double goodsPrice0) {
                    this.goodsPrice0 = goodsPrice0;
                }

                public double getGoodsPrice1() {
                    return goodsPrice1;
                }

                public void setGoodsPrice1(double goodsPrice1) {
                    this.goodsPrice1 = goodsPrice1;
                }

                public double getGoodsPrice2() {
                    return goodsPrice2;
                }

                public void setGoodsPrice2(double goodsPrice2) {
                    this.goodsPrice2 = goodsPrice2;
                }

                public double getBasePrice() {
                    return basePrice;
                }

                public void setBasePrice(double basePrice) {
                    this.basePrice = basePrice;
                }

                public double getSavePrice() {
                    return savePrice;
                }

                public void setSavePrice(double savePrice) {
                    this.savePrice = savePrice;
                }

                public int getPayAmount() {
                    return payAmount;
                }

                public void setPayAmount(int payAmount) {
                    this.payAmount = payAmount;
                }

                public Object getBook() {
                    return book;
                }

                public void setBook(Object book) {
                    this.book = book;
                }

                public int getIsGift() {
                    return isGift;
                }

                public void setIsGift(int isGift) {
                    this.isGift = isGift;
                }

                public int getBundlingId() {
                    return bundlingId;
                }

                public void setBundlingId(int bundlingId) {
                    this.bundlingId = bundlingId;
                }

                public double getGroupPrice() {
                    return groupPrice;
                }

                public void setGroupPrice(double groupPrice) {
                    this.groupPrice = groupPrice;
                }

                public DistributionOrdersBeanX getDistributionOrders() {
                    return distributionOrders;
                }

                public void setDistributionOrders(DistributionOrdersBeanX distributionOrders) {
                    this.distributionOrders = distributionOrders;
                }

                public int getTrysPostUseState() {
                    return trysPostUseState;
                }

                public void setTrysPostUseState(int trysPostUseState) {
                    this.trysPostUseState = trysPostUseState;
                }

                public int getTrysSendUseState() {
                    return trysSendUseState;
                }

                public void setTrysSendUseState(int trysSendUseState) {
                    this.trysSendUseState = trysSendUseState;
                }

                public String getGoodsSerial() {
                    return goodsSerial;
                }

                public void setGoodsSerial(String goodsSerial) {
                    this.goodsSerial = goodsSerial;
                }

                public int getTrysApplyId() {
                    return trysApplyId;
                }

                public void setTrysApplyId(int trysApplyId) {
                    this.trysApplyId = trysApplyId;
                }

                public int getContractItem1() {
                    return contractItem1;
                }

                public void setContractItem1(int contractItem1) {
                    this.contractItem1 = contractItem1;
                }

                public int getContractItem2() {
                    return contractItem2;
                }

                public void setContractItem2(int contractItem2) {
                    this.contractItem2 = contractItem2;
                }

                public int getContractItem3() {
                    return contractItem3;
                }

                public void setContractItem3(int contractItem3) {
                    this.contractItem3 = contractItem3;
                }

                public int getContractItem4() {
                    return contractItem4;
                }

                public void setContractItem4(int contractItem4) {
                    this.contractItem4 = contractItem4;
                }

                public int getContractItem5() {
                    return contractItem5;
                }

                public void setContractItem5(int contractItem5) {
                    this.contractItem5 = contractItem5;
                }

                public int getContractItem6() {
                    return contractItem6;
                }

                public void setContractItem6(int contractItem6) {
                    this.contractItem6 = contractItem6;
                }

                public int getContractItem7() {
                    return contractItem7;
                }

                public void setContractItem7(int contractItem7) {
                    this.contractItem7 = contractItem7;
                }

                public int getContractItem8() {
                    return contractItem8;
                }

                public void setContractItem8(int contractItem8) {
                    this.contractItem8 = contractItem8;
                }

                public int getContractItem9() {
                    return contractItem9;
                }

                public void setContractItem9(int contractItem9) {
                    this.contractItem9 = contractItem9;
                }

                public int getContractItem10() {
                    return contractItem10;
                }

                public void setContractItem10(int contractItem10) {
                    this.contractItem10 = contractItem10;
                }

                public int getLimitAmount() {
                    return limitAmount;
                }

                public void setLimitAmount(int limitAmount) {
                    this.limitAmount = limitAmount;
                }

                public int getChainId() {
                    return chainId;
                }

                public void setChainId(int chainId) {
                    this.chainId = chainId;
                }

                public Object getChainName() {
                    return chainName;
                }

                public void setChainName(Object chainName) {
                    this.chainName = chainName;
                }

                public int getVirtualOverdueRefund() {
                    return virtualOverdueRefund;
                }

                public void setVirtualOverdueRefund(int virtualOverdueRefund) {
                    this.virtualOverdueRefund = virtualOverdueRefund;
                }

                public int getIsSecKill() {
                    return isSecKill;
                }

                public void setIsSecKill(int isSecKill) {
                    this.isSecKill = isSecKill;
                }

                public int getSeckillGoodsId() {
                    return seckillGoodsId;
                }

                public void setSeckillGoodsId(int seckillGoodsId) {
                    this.seckillGoodsId = seckillGoodsId;
                }

                public int getBargainOpenId() {
                    return bargainOpenId;
                }

                public void setBargainOpenId(int bargainOpenId) {
                    this.bargainOpenId = bargainOpenId;
                }

                public int getCouponAmount() {
                    return couponAmount;
                }

                public void setCouponAmount(int couponAmount) {
                    this.couponAmount = couponAmount;
                }

                public int getShopCommitmentAmount() {
                    return shopCommitmentAmount;
                }

                public void setShopCommitmentAmount(int shopCommitmentAmount) {
                    this.shopCommitmentAmount = shopCommitmentAmount;
                }

                public double getShopCommitmentRate() {
                    return shopCommitmentRate;
                }

                public void setShopCommitmentRate(double shopCommitmentRate) {
                    this.shopCommitmentRate = shopCommitmentRate;
                }

                public int getDownAmount() {
                    return downAmount;
                }

                public void setDownAmount(int downAmount) {
                    this.downAmount = downAmount;
                }

                public int getFinalAmount() {
                    return finalAmount;
                }

                public void setFinalAmount(int finalAmount) {
                    this.finalAmount = finalAmount;
                }

                public double getForeignTaxRate() {
                    return foreignTaxRate;
                }

                public void setForeignTaxRate(double foreignTaxRate) {
                    this.foreignTaxRate = foreignTaxRate;
                }

                public int getIsForeign() {
                    return isForeign;
                }

                public void setIsForeign(int isForeign) {
                    this.isForeign = isForeign;
                }

                public int getForeignTaxAmount() {
                    return foreignTaxAmount;
                }

                public void setForeignTaxAmount(int foreignTaxAmount) {
                    this.foreignTaxAmount = foreignTaxAmount;
                }

                public int getPointsMoneyAmount() {
                    return pointsMoneyAmount;
                }

                public void setPointsMoneyAmount(int pointsMoneyAmount) {
                    this.pointsMoneyAmount = pointsMoneyAmount;
                }

                public int getIsStoreVIPDiscount() {
                    return isStoreVIPDiscount;
                }

                public void setIsStoreVIPDiscount(int isStoreVIPDiscount) {
                    this.isStoreVIPDiscount = isStoreVIPDiscount;
                }

                public int getStoreVIPDiscount() {
                    return storeVIPDiscount;
                }

                public void setStoreVIPDiscount(int storeVIPDiscount) {
                    this.storeVIPDiscount = storeVIPDiscount;
                }

                public int getIsLevelMarketing() {
                    return isLevelMarketing;
                }

                public void setIsLevelMarketing(int isLevelMarketing) {
                    this.isLevelMarketing = isLevelMarketing;
                }

                public List<?> getGiftVoList() {
                    return giftVoList;
                }

                public void setGiftVoList(List<?> giftVoList) {
                    this.giftVoList = giftVoList;
                }

                public List<?> getGoodsContractVoList() {
                    return goodsContractVoList;
                }

                public void setGoodsContractVoList(List<?> goodsContractVoList) {
                    this.goodsContractVoList = goodsContractVoList;
                }

                public static class DistributionOrdersBeanX {
                    /**
                     * distributionOrdersId : 0
                     * memberId : 0
                     * distributorId : 0
                     * commonId : 0
                     * storeId : 0
                     * addTime : null
                     * commissionRate : 0
                     * ordersGoodsId : 0
                     * ordersFinishTime : null
                     * finishTime : null
                     * distributionOrdersType : 1
                     * distributionStorePay : 0
                     * distributionStorePayTime : null
                     */

                    private int distributionOrdersId;
                    private int memberId;
                    private int distributorId;
                    private int commonId;
                    private int storeId;
                    private Object addTime;
                    private int commissionRate;
                    private int ordersGoodsId;
                    private Object ordersFinishTime;
                    private Object finishTime;
                    private int distributionOrdersType;
                    private int distributionStorePay;
                    private Object distributionStorePayTime;

                    public int getDistributionOrdersId() {
                        return distributionOrdersId;
                    }

                    public void setDistributionOrdersId(int distributionOrdersId) {
                        this.distributionOrdersId = distributionOrdersId;
                    }

                    public int getMemberId() {
                        return memberId;
                    }

                    public void setMemberId(int memberId) {
                        this.memberId = memberId;
                    }

                    public int getDistributorId() {
                        return distributorId;
                    }

                    public void setDistributorId(int distributorId) {
                        this.distributorId = distributorId;
                    }

                    public int getCommonId() {
                        return commonId;
                    }

                    public void setCommonId(int commonId) {
                        this.commonId = commonId;
                    }

                    public int getStoreId() {
                        return storeId;
                    }

                    public void setStoreId(int storeId) {
                        this.storeId = storeId;
                    }

                    public Object getAddTime() {
                        return addTime;
                    }

                    public void setAddTime(Object addTime) {
                        this.addTime = addTime;
                    }

                    public int getCommissionRate() {
                        return commissionRate;
                    }

                    public void setCommissionRate(int commissionRate) {
                        this.commissionRate = commissionRate;
                    }

                    public int getOrdersGoodsId() {
                        return ordersGoodsId;
                    }

                    public void setOrdersGoodsId(int ordersGoodsId) {
                        this.ordersGoodsId = ordersGoodsId;
                    }

                    public Object getOrdersFinishTime() {
                        return ordersFinishTime;
                    }

                    public void setOrdersFinishTime(Object ordersFinishTime) {
                        this.ordersFinishTime = ordersFinishTime;
                    }

                    public Object getFinishTime() {
                        return finishTime;
                    }

                    public void setFinishTime(Object finishTime) {
                        this.finishTime = finishTime;
                    }

                    public int getDistributionOrdersType() {
                        return distributionOrdersType;
                    }

                    public void setDistributionOrdersType(int distributionOrdersType) {
                        this.distributionOrdersType = distributionOrdersType;
                    }

                    public int getDistributionStorePay() {
                        return distributionStorePay;
                    }

                    public void setDistributionStorePay(int distributionStorePay) {
                        this.distributionStorePay = distributionStorePay;
                    }

                    public Object getDistributionStorePayTime() {
                        return distributionStorePayTime;
                    }

                    public void setDistributionStorePayTime(Object distributionStorePayTime) {
                        this.distributionStorePayTime = distributionStorePayTime;
                    }
                }
            }
        }
    }
}
