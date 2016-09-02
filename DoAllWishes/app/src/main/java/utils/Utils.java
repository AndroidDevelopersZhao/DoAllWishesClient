package utils;

import android.app.Activity;
import android.app.Fragment;

import zhaowenyun.doallwishes.xian.R;

/**
 * Created by zhaowenyun on 16/9/2.
 */
public class Utils {
    public static void replace(Activity aty, Fragment f){
        aty.getFragmentManager().beginTransaction().replace(R.id.view, f).commit();
    }
}
