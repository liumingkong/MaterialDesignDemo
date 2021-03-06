package widget.base;

import android.content.Context;

import widget.base.ui.BaseActivity;

import com.android.black.base.MainApplication;
import com.android.black.main.MainActivity;
import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;
import widget.view.quickreturn.demo.QuickReturnActivity;

import javax.inject.Singleton;

/**
 * Created by liumingkong on 15/6/18.
 */
@Module(
        // 标记说明该Module为不完整的Module
        // 不完整的Module允许缺少对象实例
        complete = false,
        // 若是这个Module提供的对象绑定, 可能被injects列表中以外的类使用
        // 这个类提供的其他方法有可能被除了injects包含的类之外的类所用，那么避免报错就要在@Module加上 参数library=true
        library = true,

        injects = {
                MainApplication.class,
                BaseApplication.class,
                MainActivity.class,
                BaseActivity.class,
                QuickReturnActivity.class
        },

        staticInjections = {
                Ln.class
        }
)
public class DaggerBasicModule {
    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Singleton
    @Provides
    Ln.BaseConfig provideBasicConfig(Context context) {
        return new Ln.BaseConfig(context);
    }

    @Singleton
    @Provides
    Ln.Print providePrint() {
        return new Ln.Print();
    }


    @Provides
    Context provideAppContext() {
        return BaseApplication.getAppContext();
    }
}
