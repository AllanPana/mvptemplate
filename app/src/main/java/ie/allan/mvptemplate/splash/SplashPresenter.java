package ie.allan.mvptemplate.splash;

import ie.allan.mvptemplate.baseMVP.BasePresenter;
import ie.allan.mvptemplate.baseMVP.MVPView;
import ie.allan.mvptemplate.data.DataManager;

/**
 * Created by cristina on 07/02/18.
 */

public class SplashPresenter<T extends SplashView> extends BasePresenter<T>  {


    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    void decideNextActivity(){
        if (!(getDataManager().getLoggedInMode())){
            getmMvpView().openLoginActivity();
        }else {
            getmMvpView().openMainActivity();

        }
    }
}
