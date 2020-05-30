package com.beitone.medical.doctor.ui.user;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class IntroductionEditActivity extends BaseActivity {

    @BindView(R.id.etSpecialty)
    EditText etSpecialty;
    @BindView(R.id.etIntroduction)
    EditText etIntroduction;
    @BindView(R.id.btnSave)
    AppButton btnSave;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_introduction_edit;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("个人简介");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_preview , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_preview){
            jumpTo(IntroductionPreviewActivity.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btnSave)
    public void onViewClicked() {
        finish();
    }
}
