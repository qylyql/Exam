package com.swufestu.examtally;

import android.app.Application;

import com.swufestu.examtally.db.DBManager;


public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DBManager.initDB(getApplicationContext());
    }
}

