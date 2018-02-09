package ie.allan.mvptemplate.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ie.allan.mvptemplate.MyApplication;
import ie.allan.mvptemplate.R;
import ie.allan.mvptemplate.base.BaseActivity;
import ie.allan.mvptemplate.main.MainActivity;
import ie.allan.mvptemplate.splash.SplashActivity;
import ie.allan.mvptemplate.utils.CommonUtils;

public class LoginActivity extends BaseActivity implements  LoginView{

    private LoginPresenter loginPresenter;

    @Override
    public int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void setPresenter() {
        loginPresenter = new LoginPresenter(((MyApplication)getApplication()).getDataManager());
        loginPresenter.attachView(this);
    }

    @Override
    protected void initView() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "allan", Toast.LENGTH_LONG).show();
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {

        EditText emailEditText = (EditText) findViewById(R.id.editTextEmail);
        EditText passWordEditText = (EditText) findViewById(R.id.editTextPassword);
        String stringEmail = String.valueOf(emailEditText.getText());
        String stringPassword = String.valueOf(passWordEditText.getText());


        if (!CommonUtils.isEmailValid(stringEmail)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (stringPassword == null || stringPassword.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        loginPresenter.onLogin(stringEmail);
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

    public static Intent getIntent(Context splashActivity) {
        return new Intent(splashActivity, LoginActivity.class);
    }
}
