package com.beitone.medical_store.app.ui.account.fragment;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.constant.EventCode;
import com.beitone.medical_store.app.entity.response.AuthLoginResponse;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.httpentity.GetPhoneCodeRequest;
import com.beitone.medical_store.app.httpentity.GetTokenByPhoneCodeRequest;
import com.beitone.medical_store.app.view.AppDialog;
import com.beitone.medical_store.app.widget.AppButton;
import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;

import org.greenrobot.eventbus.EventBus;

import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.bean.EventData;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.http.callback.OnStringCallback;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;
import cn.betatown.mobile.beitonelibrary.widget.CountDownButton;

public class LoginAuthFragment extends BaseFragment {

    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etAuthCode)
    EditText etAuthCode;
    @BindView(R.id.btnLogin)
    AppButton btnLogin;
    @BindView(R.id.tvLoginType1)
    TextView tvLoginType1;
    @BindView(R.id.ivWechatLogin)
    ImageView ivWechatLogin;
    @BindView(R.id.ivQQLogin)
    ImageView ivQQLogin;
    @BindView(R.id.ivClearPhone)
    ImageView ivClearPhone;
    @BindView(R.id.countDownButton)
    CountDownButton countDownButton;
    @BindView(R.id.cbProtocol)
    ImageView cbProtocol;
    @BindView(R.id.tvProtocol)
    TextView tvProtocol;

    private Callback mCallback;

    private AppDialog mSendAuthCodeDialog;

    public LoginAuthFragment(Callback mCallback) {
        this.mCallback = mCallback;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_loginauth;
    }

    @Override
    protected void initViewAndData() {
        etPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (StringUtil.isEmpty(charSequence.toString())) {
                    ivClearPhone.setVisibility(View.INVISIBLE);
                } else {
                    ivClearPhone.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        SpannableString string =
                new SpannableString(getResources().getString(R.string.protocol_hnit));
        // 用户服务协议
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.black));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 6, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //  隐私协议
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.black));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvProtocol.setText(string);
        cbProtocol.setSelected(true);
        mSendAuthCodeDialog = new AppDialog.Builder(getActivity()).setTitle("验证码获取成功，请及时查收")
                .setOnlyConfrim(true)
                .setPositive("确定", null).build();
    }

    @OnClick({R.id.btnLogin, R.id.tvLoginType1, R.id.ivWechatLogin, R.id.ivQQLogin,
            R.id.ivClearPhone, R.id.countDownButton, R.id.cbProtocol})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cbProtocol:
                cbProtocol.setSelected(cbProtocol.isSelected());
                break;
            case R.id.countDownButton:
                String phone = etPhone.getText().toString();
                if (StringUtil.isMobileNO2(phone)) {
                    sendAuthCode(phone);
                } else {
                    showToast("请输入正确的手机号码");
                }
               /* mSendAuthCodeDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        countDownButton.start();
                    }
                });
                mSendAuthCodeDialog.show();*/
                break;
            case R.id.ivClearPhone:
                etPhone.getText().clear();
                break;
            case R.id.btnLogin:
                String mobile = etPhone.getText().toString();
                if (!StringUtil.isMobileNO2(mobile)) {
                    showToast("请输入正确的手机号");
                    return;
                }

                String authCode = etAuthCode.getText().toString();
                if (StringUtil.isEmpty(authCode)) {
                    showToast("请输入验证码");
                    return;
                }

                if (!cbProtocol.isSelected()) {
                    new AppDialog.Builder(getActivity()).setTitle("请阅读并同意以下协议")
                            .setMessage(getDialogSpannable())
                            .setNative("不同意", null)
                            .setPositive("同意", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    cbProtocol.setSelected(true);
                                }
                            }).build().show();
                    return;
                }
                doLogin(mobile, authCode);
                break;
            case R.id.tvLoginType1:
                if (mCallback != null) {
                    mCallback.loginForPassword();
                }
                break;
            case R.id.ivWechatLogin:
                if (mCallback != null) {
                    mCallback.loginWith(1);
                }
                break;
            case R.id.ivQQLogin:
                if (mCallback != null) {
                    mCallback.loginWith(2);
                }
                break;
        }
    }

    private void doLogin(String mobile, String authCode) {
        GetTokenByPhoneCodeRequest request = new GetTokenByPhoneCodeRequest();
        request.phone = mobile;
        request.authCode = authCode;
        BaseProvider.request(new HttpRequest(request).build(getActivity()),
                new OnStringCallback() {
                    @Override
                    public void onResult(Object obj) {
                        if (obj != null) {
                            AuthLoginResponse data = GsonUtil.GsonToBean(obj.toString(),
                                    AuthLoginResponse.class);
                            if (data != null) {
                                if (data.getUserInfo() != null) {
                                    UserHelper.getInstance().putUserId(getActivity(),
                                            data.getUserInfo().getUserId());
                                    UserHelper.getInstance().putUserInfo(data.getUserInfo());
                                }
                                UserHelper.getInstance().putAccessToken(getActivity(),
                                        data.getAccess_token());
                                UserHelper.getInstance().putToken(getActivity(), data.getToken());

                                MedicalApplication.putAccessToken(data.getAccess_token());
                                MedicalApplication.putToken(data.getToken());

                                EventData eventData = new EventData(EventCode.EVENT_LOGIN_SUCCESS);
                                EventBus.getDefault().post(eventData);
                                if (data.isIsFirst()) {
                                    registerIMAccount(mobile, authCode);
                                } else {
                                    loginIMAccount(mobile);
                                   // mCallback.loginSuccess();
                                }
                            }
                        }
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        if (msg.contains("用户不存在")) {
                            showRegisterAccount(mobile, authCode);
                            return;
                        }
                        showToast(msg);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        showToast(msg);
                    }
                }
        );

    }

    private void loginIMAccount(String mobile) {
        EMClient.getInstance().login(mobile, mobile, new EMCallBack() {
            @Override
            public void onSuccess() {
                // 加载群组
                EMClient.getInstance().groupManager().loadAllGroups();
                // 加载会话
                EMClient.getInstance().chatManager().loadAllConversations();



            }

            @Override
            public void onError(int i, String s) {
                showToast("登录失败");
            }

            @Override
            public void onProgress(int i, String s) {

            }
        });
    }

    private void registerIMAccount(String mobile, String authCode) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    EMClient.getInstance().createAccount(mobile, mobile);
                    Message message = Message.obtain();
                    message.what = 100;
                    message.obj = mobile + "," + authCode;
                    mHandler.sendMessage(message);
                } catch (HyphenateException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 100) {
                String str = (String) msg.obj;
                String[] array = str.split(",");
                UserHelper.getInstance().putIMUserName(array[0].trim());
                mCallback.registerAccount(array[0], array[1]);
            }
        }
    };


    private void showRegisterAccount(String mobile, String authCode) {
        new AppDialog.Builder(getActivity()).setTitle("用户不存在，是否设置密码进行注册？")
                .setNative("取消", null)
                .setPositive("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mCallback != null) {
                            mCallback.registerAccount(mobile, authCode);
                        }
                    }
                }).build().show();
    }

    private void sendAuthCode(String phone) {
        GetPhoneCodeRequest codeRequest = new GetPhoneCodeRequest();
        codeRequest.phone = phone;
        BaseProvider.request(new HttpRequest(codeRequest).build(getActivity()),
                new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                countDownButton.start();
                new AppDialog.Builder(getActivity()).setTitle("验证码获取成功，请及时查收")
                        .setOnlyConfrim(true)
                        .setPositive("确定", null).build().show();
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }
        });


        // AccountProvider.sendAuthCode(this, phone,);
    }

    private Spannable getDialogSpannable() {
        SpannableString string =
                new SpannableString(getResources().getString(R.string.protocol_hnit_dialog));
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.black));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 27, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.black));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 36, 42, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return string;
    }

    public interface Callback {
        void loginSuccess();

        void registerAccount(String mobile, String authCode);

        void loginWith(int type);

        void loginForPassword();
    }

}
