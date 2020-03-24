package com.beitone.medical_store.app.ui.interrogation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class SubmitQuestionActivity extends BaseActivity {

    @BindView(R.id.tvSubmitPrompt)
    TextView tvSubmitPrompt;
    @BindView(R.id.etSubmitQuestion)
    EditText etSubmitQuestion;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_submit_question;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("快速提问");
        tvSubmitPrompt.setSelected(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_next) {
            jumpTo(SelectSeeDoctorPeopleActivity.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
