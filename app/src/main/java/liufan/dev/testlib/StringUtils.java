package liufan.dev.testlib;

import android.text.TextUtils;

/**
 * Created by liufan on 16/9/5.
 */
public class StringUtils {
    public static boolean isEmpty(String source) {
        return TextUtils.isEmpty(source);
    }


    public static String thenNull(String source,String placeHolder) {
        return TextUtils.isEmpty(source)?placeHolder:source;
    }
}
