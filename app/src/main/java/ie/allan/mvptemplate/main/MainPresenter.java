package ie.allan.mvptemplate.main;

import ie.allan.mvptemplate.baseMVP.BasePresenter;
import ie.allan.mvptemplate.data.DataManager;

/**
 * Created by cristina on 08/02/18.
 */

class MainPresenter<T extends MainView> extends BasePresenter<T>{

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    protected void logOutUser(){
        getDataManager().clear();
        getmMvpView().openSplashActivity();

    }
}
