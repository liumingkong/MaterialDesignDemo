package com.android.black.main;

import android.content.Intent;
import android.os.Bundle;

import com.android.black.base.BaseActivity;

import butterknife.OnClick;
import widget.view.quickreturn.demo.QuickReturnActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.quickreturn_cv)
    public void onQuickReturn() {
        startActivity(new Intent(this, QuickReturnActivity.class));
    }

    @OnClick(R.id.page_change_show_cv)
    public void onPageChange() {

    }
}
