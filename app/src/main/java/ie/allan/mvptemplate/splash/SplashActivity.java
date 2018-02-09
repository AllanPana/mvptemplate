package ie.allan.mvptemplate.splash;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ie.allan.mvptemplate.MyApplication;
import ie.allan.mvptemplate.R;
import ie.allan.mvptemplate.base.BaseActivity;
import ie.allan.mvptemplate.login.LoginActivity;
import ie.allan.mvptemplate.main.MainActivity;

public class SplashActivity extends BaseActivity implements SplashView{

    private SplashPresenter splashPresenter;


    public static Intent getIntent(Context mainActivity) {
        return new Intent(mainActivity, SplashActivity.class);
    }

    @Override
    public int getLayout() {
        Log.e("allan", "splash");
        return R.layout.activity_splash;
    }

    @Override
    public void setPresenter() {
        splashPresenter = new SplashPresenter(((MyApplication)getApplication()).getDataManager());
        splashPresenter.attachView(this);
        splashPresenter.decideNextActivity();

    }

    @Override
    protected void initView() {

    }

    @Override
    public void openMainActivity() {

        Intent intent = MainActivity.getIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onException(String message) {

    }

}
