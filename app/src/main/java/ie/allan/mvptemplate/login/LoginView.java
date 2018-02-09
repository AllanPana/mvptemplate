package ie.allan.mvptemplate.login;

import ie.allan.mvptemplate.baseMVP.MVPView;

/**
 * Created by cristina on 07/02/18.
 */

public interface LoginView extends MVPView {

    void openMainActivity();
    void onLoginButtonClick();

}
