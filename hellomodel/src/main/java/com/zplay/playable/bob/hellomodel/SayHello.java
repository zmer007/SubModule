package com.zplay.playable.bob.hellomodel;

import android.util.Log;

/**
 * Description:
 * <p>
 * Created by lgd on 2018/10/31.
 */

public class SayHello {
    private static final String TAG = "SayHello";

    public static void sayHello(String name) {
        Log.d(TAG, "hello " + name);
    }
}
