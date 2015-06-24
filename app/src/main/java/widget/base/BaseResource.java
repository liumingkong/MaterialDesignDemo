package widget.base;

import android.content.res.Resources;

/**
 * Created by liumingkong on 15/6/24.
 */
public class BaseResource {

    public static String resString(int strId) {
        return getResources().getString(strId);
    }

    private static Resources getResources() {
        return BaseApplication.getAppContext().getResources();
    }

}
