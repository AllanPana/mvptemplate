package ie.allan.mvptemplate.login;

import ie.allan.mvptemplate.baseMVP.BasePresenter;
import ie.allan.mvptemplate.data.DataManager;

/**
 * Created by cristina on 07/02/18.
 */

public class LoginPresenter<T extends LoginView> extends BasePresenter<T> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    public void onLogin(String email){
        getDataManager().saveEmailId(email);
        getDataManager().setLoggedIn();
        getmMvpView().openMainActivity();
    }
}
