package com.beitone.medical_store.app.ui.interrogation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.constant.AppConstant;
import com.beitone.medical_store.app.constant.EventCode;
import com.beitone.medical_store.app.entity.response.InquiryOrderInfoResponse;
import com.beitone.medical_store.app.entity.response.InquiryOrderPayResponse;
import com.beitone.medical_store.app.entity.response.InquiryOrderPriceResponse;
import com.beitone.medical_store.app.entity.response.PayIdResponse;
import com.beitone.medical_store.app.entity.response.PaymentResponse;
import com.beitone.medical_store.app.helper.InquiryHelper;
import com.beitone.medical_store.app.httpentity.InquiryOrderBuyData;
import com.beitone.medical_store.app.httpentity.InquiryOrderInfoEntity;
import com.beitone.medical_store.app.httpentity.InquiryOrderPayEntity;
import com.beitone.medical_store.app.httpentity.InquiryOrderPaymentEntity;
import com.beitone.medical_store.app.httpentity.InquiryOrderPriceEntity;
import com.beitone.medical_store.app.httpentity.InquiryOrderSaveEntity;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.bean.EventData;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.http.callback.OnStringCallback;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class SubmitInterrogationOrderActivity extends BaseActivity {

    @BindView(R.id.tvInterrogationName)
    TextView tvInterrogationName;
    @BindView(R.id.tvInterrogationPrice)
    TextView tvInterrogationPrice;
    @BindView(R.id.tvDiscount)
    TextView tvDiscount;
    @BindView(R.id.ivDiscount)
    ImageView ivDiscount;
    @BindView(R.id.tvCoupon)
    TextView tvCoupon;
    @BindView(R.id.ivCoupon)
    ImageView ivCoupon;
    @BindView(R.id.ivWechatPay)
    ImageView ivWechatPay;
    @BindView(R.id.layoutWechatPay)
    LinearLayout layoutWechatPay;
    @BindView(R.id.ivSystemPay)
    ImageView ivSystemPay;
    @BindView(R.id.layoutSystemPay)
    LinearLayout layoutSystemPay;
    @BindView(R.id.ivAliPay)
    ImageView ivAliPay;
    @BindView(R.id.layoutAliPay)
    LinearLayout layoutAliPay;
    @BindView(R.id.tvTotalPrice)
    TextView tvTotalPrice;
    @BindView(R.id.tvPay)
    TextView tvPay;

    private final int REQUEST_ORDERINFO = 1;
    private final int REQUEST_ORDERPRICE = 2;
    private final int REQUEST_SAVEORDER = 3;
    private final int REQUEST_PAYMENT = 4;

    private String mGoodsId;

    private InquiryOrderBuyData mBuyData;

    private PaymentResponse mPaymentResponse;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_submit_interrogationorder;
    }


    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case REQUEST_ORDERINFO:
                    getOrderInfo();
                    break;
                case REQUEST_ORDERPRICE:
                    InquiryOrderInfoResponse infoResponse = (InquiryOrderInfoResponse) msg.obj;
                    getPriceInfo(infoResponse);
                    break;
                case REQUEST_PAYMENT:
                    PayIdResponse payIdResponse = (PayIdResponse) msg.obj;
                    getPayment(payIdResponse);
                    break;
                case REQUEST_SAVEORDER:
                    saveOrder();
                    break;
            }
        }
    };


    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        mGoodsId = extras.getString("goodsId", "");
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        ivWechatPay.setSelected(true);
        setTitle("问诊订单");
        showLoadingDialog();
        mHandler.sendEmptyMessage(REQUEST_ORDERINFO);
    }

    /**
     * 获取价格信息
     */
    private void getPriceInfo(InquiryOrderInfoResponse orderInfoResponse) {
        if (!AdapterUtil.isListNotEmpty(orderInfoResponse.getBuyStoreVoList())) {
            return;
        }
        InquiryOrderInfoResponse.BuyStoreVoListBean storeVoListBean =
                orderInfoResponse.getBuyStoreVoList().get(0);

        InquiryOrderPriceEntity priceEntity = new InquiryOrderPriceEntity();
        priceEntity.clientType = AppConstant.CLIENT_TYPE;
        priceEntity.token = MedicalApplication.getToken();
        mBuyData = new InquiryOrderBuyData();
        mBuyData.setIsCart(0);
        mBuyData.setMobile(orderInfoResponse.getMobile());
        mBuyData.setRealName(orderInfoResponse.getRealName());
        mBuyData.setUsePoints(orderInfoResponse.getMemberPointsCanUse());

        List<InquiryOrderBuyData.StoreListBean> listBeans = new ArrayList<>();

        InquiryOrderBuyData.StoreListBean listBean =
                new InquiryOrderBuyData.StoreListBean();
        listBean.setStoreId(storeVoListBean.getStoreId());

        List<InquiryOrderBuyData.StoreListBean.GoodsListBean> goodsListBeans = new ArrayList<>();
        InquiryOrderBuyData.StoreListBean.GoodsListBean goodsListBean =
                new InquiryOrderBuyData.StoreListBean.GoodsListBean();
        goodsListBean.setBuyNum(1);
        goodsListBean.setCartId(0);
        goodsListBean.setOrderType(AppConstant.INQUIRY_TEXT);
        goodsListBean.setGoodsId(Integer.parseInt(mGoodsId));
        goodsListBean.setRegisterId(InquiryHelper.getInquirRegisterId());
        goodsListBeans.add(goodsListBean);

        listBean.setGoodsList(goodsListBeans);
        listBeans.add(listBean);
        mBuyData.setStoreList(listBeans);
        priceEntity.buyData = mBuyData;

        BaseProvider.request(new HttpRequest(priceEntity).build(this),
                new OnJsonCallBack<InquiryOrderPriceResponse>() {
                    @Override
                    public void onResult(InquiryOrderPriceResponse data) {
                        if (data != null) {
                            setText(tvInterrogationPrice, data.getBuyGoodsItemAmount());
                            setText(tvTotalPrice, data.getBuyGoodsItemAmount());
                            mHandler.sendEmptyMessage(REQUEST_SAVEORDER);
                        }
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        onDismissLoading();
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        onDismissLoading();
                    }
                });
    }

    /**
     * 获取订单信息
     */
    private void getOrderInfo() {
        List<InquiryOrderInfoEntity.BuyDataParams> params = new ArrayList<>();
        InquiryOrderInfoEntity.BuyDataParams buyDataParams =
                new InquiryOrderInfoEntity.BuyDataParams();
        buyDataParams.buyNum = 1;
        buyDataParams.goodsId = Integer.parseInt(mGoodsId);
        params.add(buyDataParams);

        InquiryOrderInfoEntity infoEntity = new InquiryOrderInfoEntity();
        infoEntity.queryParams.clientType = AppConstant.CLIENT_TYPE;
        infoEntity.queryParams.isCart = 0;
        infoEntity.queryParams.orderType = AppConstant.INQUIRY_TEXT;
        infoEntity.queryParams.registerId = InquiryHelper.getInquirRegisterId();
        infoEntity.queryParams.token = MedicalApplication.getToken();
        infoEntity.queryParams.buyData = params;
        BaseProvider.request(new HttpRequest(infoEntity).build(this),
                new OnJsonCallBack<InquiryOrderInfoResponse>() {
                    @Override
                    public void onResult(InquiryOrderInfoResponse data) {
                        if (data != null) {
                            Message message = Message.obtain();
                            message.what = REQUEST_ORDERPRICE;
                            message.obj = data;
                            mHandler.sendMessage(message);
                        }
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        onDismissLoading();
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        onDismissLoading();
                    }
                });


    }


    @OnClick({R.id.layoutWechatPay, R.id.layoutSystemPay, R.id.layoutAliPay, R.id.tvPay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutWechatPay:
                ivWechatPay.setSelected(true);
                ivSystemPay.setSelected(false);
                ivAliPay.setSelected(false);
                break;
            case R.id.layoutSystemPay:
                ivWechatPay.setSelected(false);
                ivSystemPay.setSelected(true);
                ivAliPay.setSelected(false);
                break;
            case R.id.layoutAliPay:
                ivWechatPay.setSelected(false);
                ivSystemPay.setSelected(false);
                ivAliPay.setSelected(true);
                break;
            case R.id.tvPay:
                if (mPaymentResponse != null) {
                    onPay();
                } else {
                    showToast("获取信息失败");
                }
                break;
        }
    }

    private void saveOrder() {
        InquiryOrderSaveEntity saveEntity = new InquiryOrderSaveEntity();
        saveEntity.buyData = mBuyData;
        saveEntity.clientType = AppConstant.CLIENT_TYPE;
        saveEntity.token = MedicalApplication.getToken();
        BaseProvider.request(new HttpRequest(saveEntity).build(this),
                new OnJsonCallBack<PayIdResponse>() {
                    @Override
                    public void onResult(PayIdResponse data) {
                        if (data != null) {
                            Message message = Message.obtain();
                            message.obj = data;
                            message.what = REQUEST_PAYMENT;
                            mHandler.sendMessage(message);
                        }
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        onDismissLoading();
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        onDismissLoading();
                    }
                });
    }

    private void getPayment(PayIdResponse payIdResponse) {
        InquiryOrderPaymentEntity paymentEntity = new InquiryOrderPaymentEntity();
        paymentEntity.clientType = "app";
        paymentEntity.payId = payIdResponse.payId;
        paymentEntity.token = MedicalApplication.getToken();
        BaseProvider.request(new HttpRequest(paymentEntity).build(this),
                new OnJsonCallBack<PaymentResponse>() {
                    @Override
                    public void onResult(PaymentResponse data) {
                        onDismissLoading();
                        if (data != null) {
                            mPaymentResponse = data;
                            if (AdapterUtil.isListNotEmpty(data.getPaymentList())) {
                                showPaymentView(data.getPaymentList());
                            }
                        }
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        onDismissLoading();
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        onDismissLoading();
                    }
                });

    }

    private void onPay() {
        InquiryOrderPayEntity orderPayEntity = new InquiryOrderPayEntity();
        orderPayEntity.payId = mPaymentResponse.getPayId();
        orderPayEntity.token = MedicalApplication.getToken();
        orderPayEntity.predepositPay = "0";
        orderPayEntity.payPwd = "";
        BaseProvider.request(new HttpRequest(orderPayEntity).build(this),
                new OnJsonCallBack<InquiryOrderPayResponse>() {
                    @Override
                    public void onResult(InquiryOrderPayResponse data) {
                        if (data != null && data.getPayParam() != null) {
                            doWxPay(data.getPayParam());
                        }
                    }
                });
    }

    private void doWxPay(InquiryOrderPayResponse.PayParamBean data) {
        IWXAPI api = WXAPIFactory.createWXAPI(this, data.getAppid());
        api.registerApp(data.getAppid());
        if (!api.isWXAppInstalled()) {
            showToast("未安装微信");
            return;
        }
        //这里的bean，是服务器返回的json生成的bean
        PayReq payRequest = new PayReq();
        payRequest.appId = data.getAppid();
        payRequest.partnerId = data.getPartnerid();
        payRequest.prepayId = data.getPrepayid();
        payRequest.packageValue = data.getPackageX();
        payRequest.nonceStr = data.getNoncestr();
        payRequest.timeStamp = data.getTimestamp();
        payRequest.sign = data.getSign();
        //发起请求，调起微信前去支付
        api.sendReq(payRequest);
    }

    @Override
    protected boolean isRegisterEventBus() {
        return true;
    }

    @Override
    protected void onEventComming(EventData eventData) {
        super.onEventComming(eventData);
        if (eventData != null && eventData.CODE == EventCode.EVENT_PAY_SUCCESS){
            // TODO   支付订单成功   去问诊
        }
    }

    private void showPaymentView(List<PaymentResponse.PaymentListBean> paymentList) {
        /*for (PaymentResponse.PaymentListBean paymentListBean : paymentList) {
            if (paymentListBean.getPaymentName().equals("wxpay")){
                layoutWechatPay.setVisibility(View.VISIBLE);
            }
            if (paymentListBean.getPaymentName().equals("alipay")){
                layoutAliPay.setVisibility(View.VISIBLE);
            }
        }*/
    }

}
