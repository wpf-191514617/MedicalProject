package com.beitone.medical_store.app.httpentity;

import java.util.ArrayList;
import java.util.List;

public class InquiryOrderBuyData
{


    /**
     * isCart : 0
     * mobile : 13059400674
     * realName :
     * couponIdList : []
     * usePoints : 1
     * storeList : [{"storeId":43,"receiverMessage":"","conformId":null,"voucherId":null,
     * "goodsList":[{"registerId":"88676076667762463078","orderType":"1","goodsId":7,
     * "buyNum":1,"cartId":0}]}]
     */

    private int isCart;
    private String mobile;
    private String realName;
    private int usePoints;
    private List<?> couponIdList = new ArrayList<>();
    private List<StoreListBean> storeList;

    public int getIsCart() {
        return isCart;
    }

    public void setIsCart(int isCart) {
        this.isCart = isCart;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getUsePoints() {
        return usePoints;
    }

    public void setUsePoints(int usePoints) {
        this.usePoints = usePoints;
    }

    public List<?> getCouponIdList() {
        return couponIdList;
    }

    public void setCouponIdList(List<?> couponIdList) {
        this.couponIdList = couponIdList;
    }

    public List<StoreListBean> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<StoreListBean> storeList) {
        this.storeList = storeList;
    }

    public static class StoreListBean {
        /**
         * storeId : 43
         * receiverMessage :
         * conformId : null
         * voucherId : null
         * goodsList : [{"registerId":"88676076667762463078","orderType":"1","goodsId":7,
         * "buyNum":1,"cartId":0}]
         */

        private int storeId;
        private String receiverMessage;
        private Object conformId;
        private Object voucherId;
        private List<StoreListBean.GoodsListBean> goodsList;

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public String getReceiverMessage() {
            return receiverMessage;
        }

        public void setReceiverMessage(String receiverMessage) {
            this.receiverMessage = receiverMessage;
        }

        public Object getConformId() {
            return conformId;
        }

        public void setConformId(Object conformId) {
            this.conformId = conformId;
        }

        public Object getVoucherId() {
            return voucherId;
        }

        public void setVoucherId(Object voucherId) {
            this.voucherId = voucherId;
        }

        public List<StoreListBean.GoodsListBean> getGoodsList() {
            return goodsList;
        }

        public void setGoodsList(List<StoreListBean.GoodsListBean> goodsList) {
            this.goodsList = goodsList;
        }

        public static class GoodsListBean {
            /**
             * registerId : 88676076667762463078
             * orderType : 1
             * goodsId : 7
             * buyNum : 1
             * cartId : 0
             */

            private String registerId;
            private String orderType;
            private int goodsId;
            private int buyNum;
            private int cartId;

            public String getRegisterId() {
                return registerId;
            }

            public void setRegisterId(String registerId) {
                this.registerId = registerId;
            }

            public String getOrderType() {
                return orderType;
            }

            public void setOrderType(String orderType) {
                this.orderType = orderType;
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

            public int getCartId() {
                return cartId;
            }

            public void setCartId(int cartId) {
                this.cartId = cartId;
            }
        }
    }
}
