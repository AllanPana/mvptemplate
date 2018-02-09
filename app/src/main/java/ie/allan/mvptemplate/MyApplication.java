package ie.allan.mvptemplate;

import android.app.Application;

import ie.allan.mvptemplate.data.DataManager;
import ie.allan.mvptemplate.data.SharedPrefsHelper;

/**
 * Created by cristina on 07/02/18.
 */

public class MyApplication extends Application {

    private DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }


    public DataManager getDataManager(){
        return dataManager;
    }
}
