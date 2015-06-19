package com.android.black.basic.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by liumingkong on 15/6/12.
 */
public class BaseActivity extends FragmentActivity {

    private String pageTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // 设置背景为空
        getWindow().setBackgroundDrawable(null);
    }

//    protected String getPageTag() {
//        if (Utils.isNull(this.pageTag)) {
//            this.pageTag = ReqGenerate.genPageTag(this.getClass().getName());
//        }
//        return this.pageTag;
//    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
//    /**
//     * 设置返回键生效
//     */
//    protected void setBackBtn() {
//        if (!Utils.isNull(common_header_back_btn_rl)) {
//            common_header_back_btn.setImageDrawable(getResources().getDrawable(R.drawable.common_header_previous));
//            common_header_back_btn_rl.setVisibility(View.VISIBLE);
//            common_header_back_btn_rl.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    finish();
//                }
//            });
//        }
//    }
//
//    protected void setHeaderTitle(int resId) {
//        common_header_title.setText(resId);
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        if (resultCode == Activity.RESULT_OK && requestCode == RequestCodeTable.FORCE_LOGOUT) {
//            Preferences.clearAll(this);
//            EchoUtils.echoLogout();
//            // 更新widget
//            WidgetUIUtils.sendBroadcastWidgetRefresh();
//            RestClient.INSTANCE.clear();
//            SyncboxSdkManager.stopSdkService(BaseActivity.this);
//            StoreService.INSTANCE.stopStoreService();
//            EmojiService.clear();
//            Intent intent = new Intent(BaseActivity.this, LoginActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(intent);
//            this.finish();
//        }
//        if (resultCode != Activity.RESULT_CANCELED) {
//            int which;
//            switch (requestCode) {
//                case RequestCodeTable.RATE_OP:
//                    which = data.getIntExtra(DialogUtil.WHICH, 0);
//                    String rateway = null;
//                    switch (which) {
//                        case RequestCodeTable.RATE_OP_LIKE: // "go to rate"
//                            EchoUtils.echoRate(EchoUtils.RATE_LIKE);
//                            LinkConstants.startToGpRate();
//                            break;
//                        case RequestCodeTable.RATE_OP_UNLIKE: // "ignore"
//                            EchoUtils.echoRate(EchoUtils.RATE_IGNORE);
//                            Intent intent1 = new Intent(this, FeedbackActivity.class);
//                            startActivity(intent1);
//                            break;
//                        case RequestCodeTable.RATE_OP_NEXT: // "don't like"
//                            EchoUtils.echoRate(EchoUtils.RATE_UNLIKE);
//                            break;
//                    }
//                    RatePref.saveRateUs();
//                    break;
//            }
//        }
//
//        super.onActivityResult(requestCode, resultCode, data);
//    }
//
//    class CheckSinglePointListener implements SinglePointListener {
//
//        @Override
//        public void onSignInWithSameUid(long timestamp) {
//            if (SyncBoxPref.getSinglePoint()) {
//                forceLogout(timestamp);
//                SyncBoxPref.saveSinglePoint(false);
//            }
//        }
//
//        @Override
//        public void onDialogMsgRecv(DialogMsgType dialogMsgType) {
//            if (DialogMsgType.RATE_US == dialogMsgType) {
//                showRateDialog();
//            }
//        }
//    }
//
//    protected void showRateDialog() {
//        if (SysConstants.isRussianLanguage()) {
//            RatePref.saveRateUs();
//        } else {
//            RatePref.saveRateTimestamp();
//            UMengUtils.onRateStart(UMengUtils.RATE_SHOW);
//            DialogUtil.startActivityForResult_RateOP(this);
//        }
//    }
//
//    private void forceLogout(long timestamp) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        if (Utils.isZeroLong(timestamp)) {
//            timestamp = new Date().getTime();
//        }
//        String message = String.format(ResourceUtils.resourceString(R.string.signin_single_point), simpleDateFormat.format(timestamp));
//        DialogUtil.startActivityForResult_ForceLogout(this, ResourceUtils.resourceString(R.string.string_offline_notice),
//                message, ResourceUtils.resourceString(R.string.string_confirm)
//        );
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (isNeedCheckBaseActivity && keyCode == KeyEvent.KEYCODE_BACK) {
//            onPageBack();
//            return true;
//        } else {
//            return super.onKeyDown(keyCode, event);
//        }
//    }
//
//    private boolean isNeedCheckBaseActivity = false;
//
//    protected void setNeedCheckBackBtn() {
//        if (!Utils.isNull(common_header_back_btn_rl)) {
//            common_header_back_btn.setImageDrawable(getResources().getDrawable(R.drawable.common_header_previous));
//            common_header_back_btn_rl.setVisibility(View.VISIBLE);
//            common_header_back_btn_rl.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onPageBack();
//                }
//            });
//        }
//        isNeedCheckBaseActivity = true;
//    }
//
//    protected void onPageBack() {
//        if (SyncBoxPushDispatch.isThisAppActivty(this)) {
//            LaunchUtility.startMainActivity(this);
//        } else {
//            finish();
//        }
//    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
