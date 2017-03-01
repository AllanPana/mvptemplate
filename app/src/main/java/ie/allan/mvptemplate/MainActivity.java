package ie.allan.mvptemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ie.allan.mvptemplate.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }
}
