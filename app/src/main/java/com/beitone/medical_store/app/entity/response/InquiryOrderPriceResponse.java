package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class InquiryOrderPriceResponse {


    /**
     * storeTotalDiscountAmount : 0.0
     * couponAmount : 0.0
     * buyGoodsItemAmount : 0.01
     * platTotalDiscountAmount : 0.0
     * storeList : [{"buyGoodsItemVoList":[{"drugCfType":null,"cartId":0,"goodsId":3388,
     * "commonId":3359,"goodsName":"考拉医生医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":0.01,
     * "imageName":"","buyNum":1,"itemAmount":0.01,"variableItemAmount":0,"goodsFreight":0,
     * "goodsStorage":10000001,"categoryId":1,"goodsStatus":1,"storeId":43,
     * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,"imageSrc":"http://shop
     * .hyj91.com//public/img/default_image.png","allowSend":1,"freightWeight":0,
     * "freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,"isOwnShop":1,
     * "unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,"batchNum1":0,
     * "batchNum1End":0,"batchNum2":0,"webPrice0":0.01,"webPrice1":0.01,"webPrice2":0.01,
     * "webUsable":0,"appPrice0":0.01,"appPrice1":0.01,"appPrice2":0.01,"appUsable":0,
     * "wechatPrice0":0.01,"wechatPrice1":0.01,"wechatPrice2":0.01,"wechatUsable":0,
     * "promotionBegStringime":null,"promotionEndTime":null,"goodsModal":3,
     * "spuImageSrc":"http://shop.hyj91.com//public/img/default_image.png","spuBuyNum":1,
     * "joinBigSale":0,"promotionType":0,"promotionId":0,"promotionTypeText":null,
     * "promotionTitle":"","goodsPrice0":0.01,"goodsPrice1":0.01,"goodsPrice2":0.01,"basePrice":0
     * .01,"savePrice":0,"payAmount":0.01,"book":null,"isGift":0,"giftVoList":[],"bundlingId":0,
     * "groupPrice":0,"distributionOrders":{"distributionOrdersId":0,"memberId":0,
     * "distributorId":0,"commonId":0,"storeId":0,"addTime":null,"commissionRate":0,
     * "ordersGoodsId":0,"ordersFinishTime":null,"finishTime":null,"distributionOrdersType":1,
     * "distributionStorePay":0,"distributionStorePayTime":null},"trysPostUseState":0,
     * "trysSendUseState":0,"goodsSerial":"","trysApplyId":0,"contractItem1":0,"contractItem2":0,
     * "contractItem3":0,"contractItem4":0,"contractItem5":0,"contractItem6":0,"contractItem7":0,
     * "contractItem8":0,"contractItem9":0,"contractItem10":0,"goodsContractVoList":[],
     * "limitAmount":0,"chainId":0,"chainName":null,"virtualOverdueRefund":0,"isSecKill":0,
     * "seckillGoodsId":0,"bargainOpenId":0,"couponAmount":0,"shopCommitmentAmount":0,
     * "shopCommitmentRate":0,"downAmount":0,"finalAmount":0,"foreignTaxRate":0,"isForeign":0,
     * "foreignTaxAmount":0,"poStringsMoneyAmount":0,"isStoreVIPDiscount":0,"storeVIPDiscount":0,
     * "isLevelMarketing":0}],"storeName":"东莞市滨海湾中心医院","storeId":43,"paymentTypeCode":"online",
     * "isOwnShop":1,"receiverMessage":null,"invoiceTitle":null,"invoiceContent":null,
     * "invoiceCode":null,"shipTimeType":0,"buyItemAmount":0.01,
     * "buyItemExcludejoinBigSaleAmount":0,"freightAmount":0,"conform":null,"voucher":null,
     * "couponAmount":0,"poStringsMoneyAmount":0,"shopCommitmentAmount":0,"buyAmount0":0.01,
     * "buyAmount1":0.01,"buyAmount2":0.01,"buyAmount3":0,"buyAmount4":0,"buyAmount5":0,
     * "buyAmount6":0,"ordersType":0,"taxAmount":0,"storeDiscountAmount":0,
     * "platDiscountAmount":0,"memberPoStrings":0}]
     * poStringsMoneyAmount : 0.0
     */

    private String storeTotalDiscountAmount;
    private String couponAmount;
    private String buyGoodsItemAmount;
    private String platTotalDiscountAmount;
    private String poStringsMoneyAmount;
    private List<StoreListBean> storeList;

    public String getStoreTotalDiscountAmount() {
        return storeTotalDiscountAmount;
    }

    public void setStoreTotalDiscountAmount(String storeTotalDiscountAmount) {
        this.storeTotalDiscountAmount = storeTotalDiscountAmount;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getBuyGoodsItemAmount() {
        return buyGoodsItemAmount;
    }

    public void setBuyGoodsItemAmount(String buyGoodsItemAmount) {
        this.buyGoodsItemAmount = buyGoodsItemAmount;
    }

    public String getPlatTotalDiscountAmount() {
        return platTotalDiscountAmount;
    }

    public void setPlatTotalDiscountAmount(String platTotalDiscountAmount) {
        this.platTotalDiscountAmount = platTotalDiscountAmount;
    }

    public String getPoStringsMoneyAmount() {
        return poStringsMoneyAmount;
    }

    public void setPoStringsMoneyAmount(String poStringsMoneyAmount) {
        this.poStringsMoneyAmount = poStringsMoneyAmount;
    }

    public List<StoreListBean> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<StoreListBean> storeList) {
        this.storeList = storeList;
    }

    public static class StoreListBean {
        /**
         * buyGoodsItemVoList : [{"drugCfType":null,"cartId":0,"goodsId":3388,"commonId":3359,
         * "goodsName":"考拉医生医生","goodsFullSpecs":"问诊类型：图文问诊","goodsPrice":0.01,"imageName":"",
         * "buyNum":1,"itemAmount":0.01,"variableItemAmount":0,"goodsFreight":0,
         * "goodsStorage":10000001,"categoryId":1,"goodsStatus":1,"storeId":43,
         * "storeName":"东莞市滨海湾中心医院","storageStatus":1,"freightTemplateId":0,
         * "imageSrc":"http://shop.hyj91.com//public/img/default_image.png","allowSend":1,
         * "freightWeight":0,"freightVolume":0,"categoryId1":1,"categoryId2":1,"categoryId3":1,
         * "isOwnShop":1,"unitName":"单","batchNumState":1,"batchNum0":1,"batchNum0End":0,
         * "batchNum1":0,"batchNum1End":0,"batchNum2":0,"webPrice0":0.01,"webPrice1":0.01,
         * "webPrice2":0.01,"webUsable":0,"appPrice0":0.01,"appPrice1":0.01,"appPrice2":0.01,
         * "appUsable":0,"wechatPrice0":0.01,"wechatPrice1":0.01,"wechatPrice2":0.01,
         * "wechatUsable":0,"promotionBegStringime":null,"promotionEndTime":null,"goodsModal":3,
         * "spuImageSrc":"http://shop.hyj91.com//public/img/default_image.png","spuBuyNum":1,
         * "joinBigSale":0,"promotionType":0,"promotionId":0,"promotionTypeText":null,
         * "promotionTitle":"","goodsPrice0":0.01,"goodsPrice1":0.01,"goodsPrice2":0.01,
         * "basePrice":0.01,"savePrice":0,"payAmount":0.01,"book":null,"isGift":0,
         * "giftVoList":[],"bundlingId":0,"groupPrice":0,"distributionOrders":{
         * "distributionOrdersId":0,"memberId":0,"distributorId":0,"commonId":0,"storeId":0,
         * "addTime":null,"commissionRate":0,"ordersGoodsId":0,"ordersFinishTime":null,
         * "finishTime":null,"distributionOrdersType":1,"distributionStorePay":0,
         * "distributionStorePayTime":null},"trysPostUseState":0,"trysSendUseState":0,
         * "goodsSerial":"","trysApplyId":0,"contractItem1":0,"contractItem2":0,
         * "contractItem3":0,"contractItem4":0,"contractItem5":0,"contractItem6":0,
         * "contractItem7":0,"contractItem8":0,"contractItem9":0,"contractItem10":0,
         * "goodsContractVoList":[],"limitAmount":0,"chainId":0,"chainName":null,
         * "virtualOverdueRefund":0,"isSecKill":0,"seckillGoodsId":0,"bargainOpenId":0,
         * "couponAmount":0,"shopCommitmentAmount":0,"shopCommitmentRate":0,"downAmount":0,
         * "finalAmount":0,"foreignTaxRate":0,"isForeign":0,"foreignTaxAmount":0,
         * "poStringsMoneyAmount":0,"isStoreVIPDiscount":0,"storeVIPDiscount":0,"isLevelMarketing":0}]
         * storeName : 东莞市滨海湾中心医院
         * storeId : 43
         * paymentTypeCode : online
         * isOwnShop : 1
         * receiverMessage : null
         * invoiceTitle : null
         * invoiceContent : null
         * invoiceCode : null
         * shipTimeType : 0
         * buyItemAmount : 0.01
         * buyItemExcludejoinBigSaleAmount : 0.0
         * freightAmount : 0
         * conform : null
         * voucher : null
         * couponAmount : 0.0
         * poStringsMoneyAmount : 0
         * shopCommitmentAmount : 0.0
         * buyAmount0 : 0.01
         * buyAmount1 : 0.01
         * buyAmount2 : 0.01
         * buyAmount3 : 0.0
         * buyAmount4 : 0.0
         * buyAmount5 : 0.0
         * buyAmount6 : 0
         * ordersType : 0
         * taxAmount : 0.0
         * storeDiscountAmount : 0
         * platDiscountAmount : 0
         * memberPoStrings : 0
         */

        private String storeName;
        private String storeId;
        private String paymentTypeCode;
        private String isOwnShop;
        private String receiverMessage;
        private String invoiceTitle;
        private String invoiceContent;
        private String invoiceCode;
        private String shipTimeType;
        private String buyItemAmount;
        private String buyItemExcludejoinBigSaleAmount;
        private String freightAmount;
        private String conform;
        private String voucher;
        private String couponAmount;
        private String poStringsMoneyAmount;
        private String shopCommitmentAmount;
        private String buyAmount0;
        private String buyAmount1;
        private String buyAmount2;
        private String buyAmount3;
        private String buyAmount4;
        private String buyAmount5;
        private String buyAmount6;
        private String ordersType;
        private String taxAmount;
        private String storeDiscountAmount;
        private String platDiscountAmount;
        private String memberPoStrings;
        private List<BuyGoodsItemVoListBean> buyGoodsItemVoList;

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public String getPaymentTypeCode() {
            return paymentTypeCode;
        }

        public void setPaymentTypeCode(String paymentTypeCode) {
            this.paymentTypeCode = paymentTypeCode;
        }

        public String getIsOwnShop() {
            return isOwnShop;
        }

        public void setIsOwnShop(String isOwnShop) {
            this.isOwnShop = isOwnShop;
        }

        public String getReceiverMessage() {
            return receiverMessage;
        }

        public void setReceiverMessage(String receiverMessage) {
            this.receiverMessage = receiverMessage;
        }

        public String getInvoiceTitle() {
            return invoiceTitle;
        }

        public void setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
        }

        public String getInvoiceContent() {
            return invoiceContent;
        }

        public void setInvoiceContent(String invoiceContent) {
            this.invoiceContent = invoiceContent;
        }

        public String getInvoiceCode() {
            return invoiceCode;
        }

        public void setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
        }

        public String getShipTimeType() {
            return shipTimeType;
        }

        public void setShipTimeType(String shipTimeType) {
            this.shipTimeType = shipTimeType;
        }

        public String getBuyItemAmount() {
            return buyItemAmount;
        }

        public void setBuyItemAmount(String buyItemAmount) {
            this.buyItemAmount = buyItemAmount;
        }

        public String getBuyItemExcludejoinBigSaleAmount() {
            return buyItemExcludejoinBigSaleAmount;
        }

        public void setBuyItemExcludejoinBigSaleAmount(String buyItemExcludejoinBigSaleAmount) {
            this.buyItemExcludejoinBigSaleAmount = buyItemExcludejoinBigSaleAmount;
        }

        public String getFreightAmount() {
            return freightAmount;
        }

        public void setFreightAmount(String freightAmount) {
            this.freightAmount = freightAmount;
        }

        public String getConform() {
            return conform;
        }

        public void setConform(String conform) {
            this.conform = conform;
        }

        public String getVoucher() {
            return voucher;
        }

        public void setVoucher(String voucher) {
            this.voucher = voucher;
        }

        public String getCouponAmount() {
            return couponAmount;
        }

        public void setCouponAmount(String couponAmount) {
            this.couponAmount = couponAmount;
        }

        public String getPoStringsMoneyAmount() {
            return poStringsMoneyAmount;
        }

        public void setPoStringsMoneyAmount(String poStringsMoneyAmount) {
            this.poStringsMoneyAmount = poStringsMoneyAmount;
        }

        public String getShopCommitmentAmount() {
            return shopCommitmentAmount;
        }

        public void setShopCommitmentAmount(String shopCommitmentAmount) {
            this.shopCommitmentAmount = shopCommitmentAmount;
        }

        public String getBuyAmount0() {
            return buyAmount0;
        }

        public void setBuyAmount0(String buyAmount0) {
            this.buyAmount0 = buyAmount0;
        }

        public String getBuyAmount1() {
            return buyAmount1;
        }

        public void setBuyAmount1(String buyAmount1) {
            this.buyAmount1 = buyAmount1;
        }

        public String getBuyAmount2() {
            return buyAmount2;
        }

        public void setBuyAmount2(String buyAmount2) {
            this.buyAmount2 = buyAmount2;
        }

        public String getBuyAmount3() {
            return buyAmount3;
        }

        public void setBuyAmount3(String buyAmount3) {
            this.buyAmount3 = buyAmount3;
        }

        public String getBuyAmount4() {
            return buyAmount4;
        }

        public void setBuyAmount4(String buyAmount4) {
            this.buyAmount4 = buyAmount4;
        }

        public String getBuyAmount5() {
            return buyAmount5;
        }

        public void setBuyAmount5(String buyAmount5) {
            this.buyAmount5 = buyAmount5;
        }

        public String getBuyAmount6() {
            return buyAmount6;
        }

        public void setBuyAmount6(String buyAmount6) {
            this.buyAmount6 = buyAmount6;
        }

        public String getOrdersType() {
            return ordersType;
        }

        public void setOrdersType(String ordersType) {
            this.ordersType = ordersType;
        }

        public String getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
        }

        public String getStoreDiscountAmount() {
            return storeDiscountAmount;
        }

        public void setStoreDiscountAmount(String storeDiscountAmount) {
            this.storeDiscountAmount = storeDiscountAmount;
        }

        public String getPlatDiscountAmount() {
            return platDiscountAmount;
        }

        public void setPlatDiscountAmount(String platDiscountAmount) {
            this.platDiscountAmount = platDiscountAmount;
        }

        public String getMemberPoStrings() {
            return memberPoStrings;
        }

        public void setMemberPoStrings(String memberPoStrings) {
            this.memberPoStrings = memberPoStrings;
        }

        public List<BuyGoodsItemVoListBean> getBuyGoodsItemVoList() {
            return buyGoodsItemVoList;
        }

        public void setBuyGoodsItemVoList(List<BuyGoodsItemVoListBean> buyGoodsItemVoList) {
            this.buyGoodsItemVoList = buyGoodsItemVoList;
        }

        public static class BuyGoodsItemVoListBean {
            /**
             * drugCfType : null
             * cartId : 0
             * goodsId : 3388
             * commonId : 3359
             * goodsName : 考拉医生医生
             * goodsFullSpecs : 问诊类型：图文问诊
             * goodsPrice : 0.01
             * imageName :
             * buyNum : 1
             * itemAmount : 0.01
             * variableItemAmount : 0
             * goodsFreight : 0.0
             * goodsStorage : 10000001
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
             * webPrice0 : 0.01
             * webPrice1 : 0.01
             * webPrice2 : 0.01
             * webUsable : 0
             * appPrice0 : 0.01
             * appPrice1 : 0.01
             * appPrice2 : 0.01
             * appUsable : 0
             * wechatPrice0 : 0.01
             * wechatPrice1 : 0.01
             * wechatPrice2 : 0.01
             * wechatUsable : 0
             * promotionBegStringime : null
             * promotionEndTime : null
             * goodsModal : 3
             * spuImageSrc : http://shop.hyj91.com//public/img/default_image.png
             * spuBuyNum : 1
             * joinBigSale : 0
             * promotionType : 0
             * promotionId : 0
             * promotionTypeText : null
             * promotionTitle :
             * goodsPrice0 : 0.01
             * goodsPrice1 : 0.01
             * goodsPrice2 : 0.01
             * basePrice : 0.01
             * savePrice : 0.0
             * payAmount : 0.01
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
             * poStringsMoneyAmount : 0
             * isStoreVIPDiscount : 0
             * storeVIPDiscount : 0
             * isLevelMarketing : 0
             */

            private String drugCfType;
            private String cartId;
            private String goodsId;
            private String commonId;
            private String goodsName;
            private String goodsFullSpecs;
            private String goodsPrice;
            private String imageName;
            private String buyNum;
            private String itemAmount;
            private String variableItemAmount;
            private String goodsFreight;
            private String goodsStorage;
            private String categoryId;
            private String goodsStatus;
            private String storeId;
            private String storeName;
            private String storageStatus;
            private String freightTemplateId;
            private String imageSrc;
            private String allowSend;
            private String freightWeight;
            private String freightVolume;
            private String categoryId1;
            private String categoryId2;
            private String categoryId3;
            private String isOwnShop;
            private String unitName;
            private String batchNumState;
            private String batchNum0;
            private String batchNum0End;
            private String batchNum1;
            private String batchNum1End;
            private String batchNum2;
            private String webPrice0;
            private String webPrice1;
            private String webPrice2;
            private String webUsable;
            private String appPrice0;
            private String appPrice1;
            private String appPrice2;
            private String appUsable;
            private String wechatPrice0;
            private String wechatPrice1;
            private String wechatPrice2;
            private String wechatUsable;
            private String promotionBegStringime;
            private String promotionEndTime;
            private String goodsModal;
            private String spuImageSrc;
            private String spuBuyNum;
            private String joinBigSale;
            private String promotionType;
            private String promotionId;
            private String promotionTypeText;
            private String promotionTitle;
            private String goodsPrice0;
            private String goodsPrice1;
            private String goodsPrice2;
            private String basePrice;
            private String savePrice;
            private String payAmount;
            private String book;
            private String isGift;
            private String bundlingId;
            private String groupPrice;
            private DistributionOrdersBean distributionOrders;
            private String trysPostUseState;
            private String trysSendUseState;
            private String goodsSerial;
            private String trysApplyId;
            private String contractItem1;
            private String contractItem2;
            private String contractItem3;
            private String contractItem4;
            private String contractItem5;
            private String contractItem6;
            private String contractItem7;
            private String contractItem8;
            private String contractItem9;
            private String contractItem10;
            private String limitAmount;
            private String chainId;
            private String chainName;
            private String virtualOverdueRefund;
            private String isSecKill;
            private String seckillGoodsId;
            private String bargainOpenId;
            private String couponAmount;
            private String shopCommitmentAmount;
            private String shopCommitmentRate;
            private String downAmount;
            private String finalAmount;
            private String foreignTaxRate;
            private String isForeign;
            private String foreignTaxAmount;
            private String poStringsMoneyAmount;
            private String isStoreVIPDiscount;
            private String storeVIPDiscount;
            private String isLevelMarketing;
            private List<?> giftVoList;
            private List<?> goodsContractVoList;

            public String getDrugCfType() {
                return drugCfType;
            }

            public void setDrugCfType(String drugCfType) {
                this.drugCfType = drugCfType;
            }

            public String getCartId() {
                return cartId;
            }

            public void setCartId(String cartId) {
                this.cartId = cartId;
            }

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getCommonId() {
                return commonId;
            }

            public void setCommonId(String commonId) {
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

            public String getGoodsPrice() {
                return goodsPrice;
            }

            public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
            }

            public String getImageName() {
                return imageName;
            }

            public void setImageName(String imageName) {
                this.imageName = imageName;
            }

            public String getBuyNum() {
                return buyNum;
            }

            public void setBuyNum(String buyNum) {
                this.buyNum = buyNum;
            }

            public String getItemAmount() {
                return itemAmount;
            }

            public void setItemAmount(String itemAmount) {
                this.itemAmount = itemAmount;
            }

            public String getVariableItemAmount() {
                return variableItemAmount;
            }

            public void setVariableItemAmount(String variableItemAmount) {
                this.variableItemAmount = variableItemAmount;
            }

            public String getGoodsFreight() {
                return goodsFreight;
            }

            public void setGoodsFreight(String goodsFreight) {
                this.goodsFreight = goodsFreight;
            }

            public String getGoodsStorage() {
                return goodsStorage;
            }

            public void setGoodsStorage(String goodsStorage) {
                this.goodsStorage = goodsStorage;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getGoodsStatus() {
                return goodsStatus;
            }

            public void setGoodsStatus(String goodsStatus) {
                this.goodsStatus = goodsStatus;
            }

            public String getStoreId() {
                return storeId;
            }

            public void setStoreId(String storeId) {
                this.storeId = storeId;
            }

            public String getStoreName() {
                return storeName;
            }

            public void setStoreName(String storeName) {
                this.storeName = storeName;
            }

            public String getStorageStatus() {
                return storageStatus;
            }

            public void setStorageStatus(String storageStatus) {
                this.storageStatus = storageStatus;
            }

            public String getFreightTemplateId() {
                return freightTemplateId;
            }

            public void setFreightTemplateId(String freightTemplateId) {
                this.freightTemplateId = freightTemplateId;
            }

            public String getImageSrc() {
                return imageSrc;
            }

            public void setImageSrc(String imageSrc) {
                this.imageSrc = imageSrc;
            }

            public String getAllowSend() {
                return allowSend;
            }

            public void setAllowSend(String allowSend) {
                this.allowSend = allowSend;
            }

            public String getFreightWeight() {
                return freightWeight;
            }

            public void setFreightWeight(String freightWeight) {
                this.freightWeight = freightWeight;
            }

            public String getFreightVolume() {
                return freightVolume;
            }

            public void setFreightVolume(String freightVolume) {
                this.freightVolume = freightVolume;
            }

            public String getCategoryId1() {
                return categoryId1;
            }

            public void setCategoryId1(String categoryId1) {
                this.categoryId1 = categoryId1;
            }

            public String getCategoryId2() {
                return categoryId2;
            }

            public void setCategoryId2(String categoryId2) {
                this.categoryId2 = categoryId2;
            }

            public String getCategoryId3() {
                return categoryId3;
            }

            public void setCategoryId3(String categoryId3) {
                this.categoryId3 = categoryId3;
            }

            public String getIsOwnShop() {
                return isOwnShop;
            }

            public void setIsOwnShop(String isOwnShop) {
                this.isOwnShop = isOwnShop;
            }

            public String getUnitName() {
                return unitName;
            }

            public void setUnitName(String unitName) {
                this.unitName = unitName;
            }

            public String getBatchNumState() {
                return batchNumState;
            }

            public void setBatchNumState(String batchNumState) {
                this.batchNumState = batchNumState;
            }

            public String getBatchNum0() {
                return batchNum0;
            }

            public void setBatchNum0(String batchNum0) {
                this.batchNum0 = batchNum0;
            }

            public String getBatchNum0End() {
                return batchNum0End;
            }

            public void setBatchNum0End(String batchNum0End) {
                this.batchNum0End = batchNum0End;
            }

            public String getBatchNum1() {
                return batchNum1;
            }

            public void setBatchNum1(String batchNum1) {
                this.batchNum1 = batchNum1;
            }

            public String getBatchNum1End() {
                return batchNum1End;
            }

            public void setBatchNum1End(String batchNum1End) {
                this.batchNum1End = batchNum1End;
            }

            public String getBatchNum2() {
                return batchNum2;
            }

            public void setBatchNum2(String batchNum2) {
                this.batchNum2 = batchNum2;
            }

            public String getWebPrice0() {
                return webPrice0;
            }

            public void setWebPrice0(String webPrice0) {
                this.webPrice0 = webPrice0;
            }

            public String getWebPrice1() {
                return webPrice1;
            }

            public void setWebPrice1(String webPrice1) {
                this.webPrice1 = webPrice1;
            }

            public String getWebPrice2() {
                return webPrice2;
            }

            public void setWebPrice2(String webPrice2) {
                this.webPrice2 = webPrice2;
            }

            public String getWebUsable() {
                return webUsable;
            }

            public void setWebUsable(String webUsable) {
                this.webUsable = webUsable;
            }

            public String getAppPrice0() {
                return appPrice0;
            }

            public void setAppPrice0(String appPrice0) {
                this.appPrice0 = appPrice0;
            }

            public String getAppPrice1() {
                return appPrice1;
            }

            public void setAppPrice1(String appPrice1) {
                this.appPrice1 = appPrice1;
            }

            public String getAppPrice2() {
                return appPrice2;
            }

            public void setAppPrice2(String appPrice2) {
                this.appPrice2 = appPrice2;
            }

            public String getAppUsable() {
                return appUsable;
            }

            public void setAppUsable(String appUsable) {
                this.appUsable = appUsable;
            }

            public String getWechatPrice0() {
                return wechatPrice0;
            }

            public void setWechatPrice0(String wechatPrice0) {
                this.wechatPrice0 = wechatPrice0;
            }

            public String getWechatPrice1() {
                return wechatPrice1;
            }

            public void setWechatPrice1(String wechatPrice1) {
                this.wechatPrice1 = wechatPrice1;
            }

            public String getWechatPrice2() {
                return wechatPrice2;
            }

            public void setWechatPrice2(String wechatPrice2) {
                this.wechatPrice2 = wechatPrice2;
            }

            public String getWechatUsable() {
                return wechatUsable;
            }

            public void setWechatUsable(String wechatUsable) {
                this.wechatUsable = wechatUsable;
            }

            public String getPromotionBegStringime() {
                return promotionBegStringime;
            }

            public void setPromotionBegStringime(String promotionBegStringime) {
                this.promotionBegStringime = promotionBegStringime;
            }

            public String getPromotionEndTime() {
                return promotionEndTime;
            }

            public void setPromotionEndTime(String promotionEndTime) {
                this.promotionEndTime = promotionEndTime;
            }

            public String getGoodsModal() {
                return goodsModal;
            }

            public void setGoodsModal(String goodsModal) {
                this.goodsModal = goodsModal;
            }

            public String getSpuImageSrc() {
                return spuImageSrc;
            }

            public void setSpuImageSrc(String spuImageSrc) {
                this.spuImageSrc = spuImageSrc;
            }

            public String getSpuBuyNum() {
                return spuBuyNum;
            }

            public void setSpuBuyNum(String spuBuyNum) {
                this.spuBuyNum = spuBuyNum;
            }

            public String getJoinBigSale() {
                return joinBigSale;
            }

            public void setJoinBigSale(String joinBigSale) {
                this.joinBigSale = joinBigSale;
            }

            public String getPromotionType() {
                return promotionType;
            }

            public void setPromotionType(String promotionType) {
                this.promotionType = promotionType;
            }

            public String getPromotionId() {
                return promotionId;
            }

            public void setPromotionId(String promotionId) {
                this.promotionId = promotionId;
            }

            public String getPromotionTypeText() {
                return promotionTypeText;
            }

            public void setPromotionTypeText(String promotionTypeText) {
                this.promotionTypeText = promotionTypeText;
            }

            public String getPromotionTitle() {
                return promotionTitle;
            }

            public void setPromotionTitle(String promotionTitle) {
                this.promotionTitle = promotionTitle;
            }

            public String getGoodsPrice0() {
                return goodsPrice0;
            }

            public void setGoodsPrice0(String goodsPrice0) {
                this.goodsPrice0 = goodsPrice0;
            }

            public String getGoodsPrice1() {
                return goodsPrice1;
            }

            public void setGoodsPrice1(String goodsPrice1) {
                this.goodsPrice1 = goodsPrice1;
            }

            public String getGoodsPrice2() {
                return goodsPrice2;
            }

            public void setGoodsPrice2(String goodsPrice2) {
                this.goodsPrice2 = goodsPrice2;
            }

            public String getBasePrice() {
                return basePrice;
            }

            public void setBasePrice(String basePrice) {
                this.basePrice = basePrice;
            }

            public String getSavePrice() {
                return savePrice;
            }

            public void setSavePrice(String savePrice) {
                this.savePrice = savePrice;
            }

            public String getPayAmount() {
                return payAmount;
            }

            public void setPayAmount(String payAmount) {
                this.payAmount = payAmount;
            }

            public String getBook() {
                return book;
            }

            public void setBook(String book) {
                this.book = book;
            }

            public String getIsGift() {
                return isGift;
            }

            public void setIsGift(String isGift) {
                this.isGift = isGift;
            }

            public String getBundlingId() {
                return bundlingId;
            }

            public void setBundlingId(String bundlingId) {
                this.bundlingId = bundlingId;
            }

            public String getGroupPrice() {
                return groupPrice;
            }

            public void setGroupPrice(String groupPrice) {
                this.groupPrice = groupPrice;
            }

            public DistributionOrdersBean getDistributionOrders() {
                return distributionOrders;
            }

            public void setDistributionOrders(DistributionOrdersBean distributionOrders) {
                this.distributionOrders = distributionOrders;
            }

            public String getTrysPostUseState() {
                return trysPostUseState;
            }

            public void setTrysPostUseState(String trysPostUseState) {
                this.trysPostUseState = trysPostUseState;
            }

            public String getTrysSendUseState() {
                return trysSendUseState;
            }

            public void setTrysSendUseState(String trysSendUseState) {
                this.trysSendUseState = trysSendUseState;
            }

            public String getGoodsSerial() {
                return goodsSerial;
            }

            public void setGoodsSerial(String goodsSerial) {
                this.goodsSerial = goodsSerial;
            }

            public String getTrysApplyId() {
                return trysApplyId;
            }

            public void setTrysApplyId(String trysApplyId) {
                this.trysApplyId = trysApplyId;
            }

            public String getContractItem1() {
                return contractItem1;
            }

            public void setContractItem1(String contractItem1) {
                this.contractItem1 = contractItem1;
            }

            public String getContractItem2() {
                return contractItem2;
            }

            public void setContractItem2(String contractItem2) {
                this.contractItem2 = contractItem2;
            }

            public String getContractItem3() {
                return contractItem3;
            }

            public void setContractItem3(String contractItem3) {
                this.contractItem3 = contractItem3;
            }

            public String getContractItem4() {
                return contractItem4;
            }

            public void setContractItem4(String contractItem4) {
                this.contractItem4 = contractItem4;
            }

            public String getContractItem5() {
                return contractItem5;
            }

            public void setContractItem5(String contractItem5) {
                this.contractItem5 = contractItem5;
            }

            public String getContractItem6() {
                return contractItem6;
            }

            public void setContractItem6(String contractItem6) {
                this.contractItem6 = contractItem6;
            }

            public String getContractItem7() {
                return contractItem7;
            }

            public void setContractItem7(String contractItem7) {
                this.contractItem7 = contractItem7;
            }

            public String getContractItem8() {
                return contractItem8;
            }

            public void setContractItem8(String contractItem8) {
                this.contractItem8 = contractItem8;
            }

            public String getContractItem9() {
                return contractItem9;
            }

            public void setContractItem9(String contractItem9) {
                this.contractItem9 = contractItem9;
            }

            public String getContractItem10() {
                return contractItem10;
            }

            public void setContractItem10(String contractItem10) {
                this.contractItem10 = contractItem10;
            }

            public String getLimitAmount() {
                return limitAmount;
            }

            public void setLimitAmount(String limitAmount) {
                this.limitAmount = limitAmount;
            }

            public String getChainId() {
                return chainId;
            }

            public void setChainId(String chainId) {
                this.chainId = chainId;
            }

            public String getChainName() {
                return chainName;
            }

            public void setChainName(String chainName) {
                this.chainName = chainName;
            }

            public String getVirtualOverdueRefund() {
                return virtualOverdueRefund;
            }

            public void setVirtualOverdueRefund(String virtualOverdueRefund) {
                this.virtualOverdueRefund = virtualOverdueRefund;
            }

            public String getIsSecKill() {
                return isSecKill;
            }

            public void setIsSecKill(String isSecKill) {
                this.isSecKill = isSecKill;
            }

            public String getSeckillGoodsId() {
                return seckillGoodsId;
            }

            public void setSeckillGoodsId(String seckillGoodsId) {
                this.seckillGoodsId = seckillGoodsId;
            }

            public String getBargainOpenId() {
                return bargainOpenId;
            }

            public void setBargainOpenId(String bargainOpenId) {
                this.bargainOpenId = bargainOpenId;
            }

            public String getCouponAmount() {
                return couponAmount;
            }

            public void setCouponAmount(String couponAmount) {
                this.couponAmount = couponAmount;
            }

            public String getShopCommitmentAmount() {
                return shopCommitmentAmount;
            }

            public void setShopCommitmentAmount(String shopCommitmentAmount) {
                this.shopCommitmentAmount = shopCommitmentAmount;
            }

            public String getShopCommitmentRate() {
                return shopCommitmentRate;
            }

            public void setShopCommitmentRate(String shopCommitmentRate) {
                this.shopCommitmentRate = shopCommitmentRate;
            }

            public String getDownAmount() {
                return downAmount;
            }

            public void setDownAmount(String downAmount) {
                this.downAmount = downAmount;
            }

            public String getFinalAmount() {
                return finalAmount;
            }

            public void setFinalAmount(String finalAmount) {
                this.finalAmount = finalAmount;
            }

            public String getForeignTaxRate() {
                return foreignTaxRate;
            }

            public void setForeignTaxRate(String foreignTaxRate) {
                this.foreignTaxRate = foreignTaxRate;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public String getForeignTaxAmount() {
                return foreignTaxAmount;
            }

            public void setForeignTaxAmount(String foreignTaxAmount) {
                this.foreignTaxAmount = foreignTaxAmount;
            }

            public String getPoStringsMoneyAmount() {
                return poStringsMoneyAmount;
            }

            public void setPoStringsMoneyAmount(String poStringsMoneyAmount) {
                this.poStringsMoneyAmount = poStringsMoneyAmount;
            }

            public String getIsStoreVIPDiscount() {
                return isStoreVIPDiscount;
            }

            public void setIsStoreVIPDiscount(String isStoreVIPDiscount) {
                this.isStoreVIPDiscount = isStoreVIPDiscount;
            }

            public String getStoreVIPDiscount() {
                return storeVIPDiscount;
            }

            public void setStoreVIPDiscount(String storeVIPDiscount) {
                this.storeVIPDiscount = storeVIPDiscount;
            }

            public String getIsLevelMarketing() {
                return isLevelMarketing;
            }

            public void setIsLevelMarketing(String isLevelMarketing) {
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

                private String distributionOrdersId;
                private String memberId;
                private String distributorId;
                private String commonId;
                private String storeId;
                private String addTime;
                private String commissionRate;
                private String ordersGoodsId;
                private String ordersFinishTime;
                private String finishTime;
                private String distributionOrdersType;
                private String distributionStorePay;
                private String distributionStorePayTime;

                public String getDistributionOrdersId() {
                    return distributionOrdersId;
                }

                public void setDistributionOrdersId(String distributionOrdersId) {
                    this.distributionOrdersId = distributionOrdersId;
                }

                public String getMemberId() {
                    return memberId;
                }

                public void setMemberId(String memberId) {
                    this.memberId = memberId;
                }

                public String getDistributorId() {
                    return distributorId;
                }

                public void setDistributorId(String distributorId) {
                    this.distributorId = distributorId;
                }

                public String getCommonId() {
                    return commonId;
                }

                public void setCommonId(String commonId) {
                    this.commonId = commonId;
                }

                public String getStoreId() {
                    return storeId;
                }

                public void setStoreId(String storeId) {
                    this.storeId = storeId;
                }

                public String getAddTime() {
                    return addTime;
                }

                public void setAddTime(String addTime) {
                    this.addTime = addTime;
                }

                public String getCommissionRate() {
                    return commissionRate;
                }

                public void setCommissionRate(String commissionRate) {
                    this.commissionRate = commissionRate;
                }

                public String getOrdersGoodsId() {
                    return ordersGoodsId;
                }

                public void setOrdersGoodsId(String ordersGoodsId) {
                    this.ordersGoodsId = ordersGoodsId;
                }

                public String getOrdersFinishTime() {
                    return ordersFinishTime;
                }

                public void setOrdersFinishTime(String ordersFinishTime) {
                    this.ordersFinishTime = ordersFinishTime;
                }

                public String getFinishTime() {
                    return finishTime;
                }

                public void setFinishTime(String finishTime) {
                    this.finishTime = finishTime;
                }

                public String getDistributionOrdersType() {
                    return distributionOrdersType;
                }

                public void setDistributionOrdersType(String distributionOrdersType) {
                    this.distributionOrdersType = distributionOrdersType;
                }

                public String getDistributionStorePay() {
                    return distributionStorePay;
                }

                public void setDistributionStorePay(String distributionStorePay) {
                    this.distributionStorePay = distributionStorePay;
                }

                public String getDistributionStorePayTime() {
                    return distributionStorePayTime;
                }

                public void setDistributionStorePayTime(String distributionStorePayTime) {
                    this.distributionStorePayTime = distributionStorePayTime;
                }
            }
        }
    }
}
