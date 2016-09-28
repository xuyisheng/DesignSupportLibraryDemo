package com.hujiang.designsupportlibrarydemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * 通用工具类
 *
 * @author Lshare
 * @date 2016/9/28
 */
public class CommonUtil {
    /**
     * 获取状态栏高度
     *
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        int statusBarHeight = 0;
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId != 0) {
            try {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } catch (Resources.NotFoundException ex) {
            }
        }
        return statusBarHeight;
    }

    /**
     * 获取Actionbar高度
     *
     * @param context
     * @return
     */
    public static int getActionbarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
        float actionbarHeight = typedValue.getDimension(context.getResources().getDisplayMetrics());
        return (int) actionbarHeight;
    }

}
