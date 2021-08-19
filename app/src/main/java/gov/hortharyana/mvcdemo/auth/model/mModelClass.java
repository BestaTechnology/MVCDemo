package gov.hortharyana.mvcdemo.auth.model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class mModelClass implements LoginModel {

    private String email,password;

    public mModelClass(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public int isValid() {
        if (TextUtils.isEmpty(getEmail()))
        {
            return 0;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 1;

        }else if (getPassword().length()<6){
            return 2;
        }else
            return -1;

    }
}
