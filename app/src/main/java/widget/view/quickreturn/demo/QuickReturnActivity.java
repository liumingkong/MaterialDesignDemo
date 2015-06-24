package widget.view.quickreturn.demo;

import android.os.Bundle;

import com.android.black.base.BaseActivity;
import com.android.black.main.R;

import butterknife.OnClick;

/**
 * Created by liumingkong on 15/6/24.
 */
public class QuickReturnActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quickreturn);
        setBackBtn();
    }

    @OnClick(R.id.qr_twitter_cv)
    public void onTwitterCv() {

    }
}
