package ie.allan.mvptemplate.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import ie.allan.mvptemplate.MyApplication;
import ie.allan.mvptemplate.R;
import ie.allan.mvptemplate.base.BaseActivity;
import ie.allan.mvptemplate.baseMVP.MVPView;
import ie.allan.mvptemplate.splash.SplashActivity;

public class MainActivity extends BaseActivity implements MainView {

    private MainPresenter mainPresenter;

    @BindView(R.id.text)
    TextView textView;

    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setPresenter() {
        mainPresenter = new MainPresenter(((MyApplication)getApplication()).getDataManager());
        mainPresenter.attachView(this);
    }

    @Override
    protected void initView() {
        textView.setText(mainPresenter.getEmailId());
        Button button = (Button) findViewById(R.id.buttonLogout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.logOutUser();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        startActivity(SplashActivity.getIntent(this));
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
