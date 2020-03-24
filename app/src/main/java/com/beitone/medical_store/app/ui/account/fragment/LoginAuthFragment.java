package com.beitone.medical_store.app.ui.account.fragment;

import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.view.AppDialog;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
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
    CheckBox cbProtocol;
    @BindView(R.id.tvProtocol)
    TextView tvProtocol;

    private Callback mCallback;

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
        cbProtocol.setChecked(true);
    }

    @OnClick({R.id.btnLogin, R.id.tvLoginType1, R.id.ivWechatLogin, R.id.ivQQLogin,
            R.id.ivClearPhone, R.id.countDownButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.countDownButton:
                countDownButton.start();
                new AppDialog.Builder(getActivity()).setTitle("验证码获取成功，请及时查收")
                        .setOnlyConfrim(true)
                        .setPositive("确定", null).build().show();
                break;
            case R.id.ivClearPhone:
                etPhone.getText().clear();
                break;
            case R.id.btnLogin:
                //if (!cbProtocol.isChecked()){
                    new AppDialog.Builder(getActivity()).setTitle("请阅读并同意以下协议")
                            .setMessage(getDialogSpannable())
                            .setNative("不同意", null)
                            .setPositive("同意", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    cbProtocol.setChecked(true);
                                }
                            }).build().show();
                  //  return;
               // }
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

        void loginWith(int type);

        void loginForPassword();
    }

}