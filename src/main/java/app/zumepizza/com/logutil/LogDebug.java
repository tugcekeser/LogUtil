package app.zumepizza.com.logutil;

import android.util.Log;

/**
 * Created by Rabia Tugce Keser on 1/13/19.
 * Copyright (c) 2019 Zume Pizza Inc
 */
public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
