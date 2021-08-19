package gov.hortharyana.mvcdemo.auth.controller;

import gov.hortharyana.mvcdemo.auth.model.mModelClass;
import gov.hortharyana.mvcdemo.auth.view.LoginView;

public class LoginControllerr implements LoginController {


    LoginView loginView;

    public LoginControllerr(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void OnLogin(String email, String password) {

        mModelClass mModelClass=new mModelClass(email,password);
        int loginCode= mModelClass.isValid();

        if (loginCode==0){
            loginView.onLoginError("Please enter email");

        }else if (loginCode==1){

            loginView.onLoginError("Please enter valid email");
        }else if (loginCode==2){
            loginView.onLoginError("Password should be minimum 6 characters");
        }else {
            loginView.onLoginSucess("Login Success");
        }

    }
}
