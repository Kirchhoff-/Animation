package com.kirchhoff.animation;

import android.app.Application;
import android.content.Context;

/**
 * @author Kirchhoff-
 */

public class App extends Application {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
