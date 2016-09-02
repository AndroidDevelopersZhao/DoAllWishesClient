package utils;

/**
 * Created by zhaowenyun on 16/9/2.
 */
public class Log {
    static String tag = "城会吃";

    public static void d(String msg) {
        android.util.Log.d(tag, msg);
    }

    public static void e(String msg) {
        android.util.Log.e(tag, msg);
    }
}
