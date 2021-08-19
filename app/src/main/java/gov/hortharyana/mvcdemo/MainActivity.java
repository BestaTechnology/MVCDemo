package gov.hortharyana.mvcdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import gov.hortharyana.mvcdemo.auth.controller.LoginController;
import gov.hortharyana.mvcdemo.auth.controller.LoginControllerr;
import gov.hortharyana.mvcdemo.auth.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    EditText email,password;
    Button loginBtn;
    LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email= findViewById(R.id.email_et);
        password= findViewById(R.id.password_et);
        loginBtn= findViewById(R.id.login_btn);
        loginController=new LoginControllerr(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginController.OnLogin(email.getText().toString().trim(),password.getText().toString().trim());

            }
        });


    }


    @Override
    public void onLoginSucess(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}