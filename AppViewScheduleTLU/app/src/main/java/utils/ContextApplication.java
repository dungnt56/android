package utils;

import android.app.Application;
import android.content.Context;

public class ContextApplication extends Application {

    private static ContextApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getAppContext() {
        return instance.getApplicationContext();
    }
}
