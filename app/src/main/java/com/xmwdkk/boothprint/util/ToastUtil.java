package com.xmwdkk.boothprint.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @author air
 */
public class ToastUtil {

    public static void showToast(Context context, String message) {
        if (null != context && !TextUtils.isEmpty(message)) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }


}
