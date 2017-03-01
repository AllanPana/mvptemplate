package ie.allan.mvptemplate.baseMVP;

/**
 * Created by allan on 01/03/17.
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */

public interface Presenter <T extends MVPView>{


    void attachView(T mVPView);

    void detachView();
}
