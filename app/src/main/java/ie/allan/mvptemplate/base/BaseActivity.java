package ie.allan.mvptemplate.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import ie.allan.mvptemplate.MyApplication;
import ie.allan.mvptemplate.baseMVP.BasePresenter;
import ie.allan.mvptemplate.baseMVP.MVPView;
import ie.allan.mvptemplate.data.DataManager;

/**
 * Created by allan on 01/03/17.
 */

public abstract class BaseActivity  extends AppCompatActivity{

    protected Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mUnbinder = ButterKnife.bind(this);
        setPresenter();
        initView();

    }

    protected abstract void initView();

    @Override
    protected void onStart() {
        super.onStart();

    }

    /**
     *
     * @return the Layout of the extending activity
     */
    @LayoutRes
    public abstract int getLayout();

    public abstract void setPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }


}
