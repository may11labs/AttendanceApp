package main.attendance.com.attendanceapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements LoginView{


    TextView usernameView;
    TextView passwordView;
    LoginService loginService;
    Context mContext;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mContext = this;
        usernameView = (TextView) findViewById(R.id.txtUsername);
        passwordView = (TextView) findViewById(R.id.txtPassword);
        loginService = new LoginService();
        presenter = new LoginPresenter(this,loginService);
    }

    public void checkLogin(View view)
    {
        presenter.onCheckLogin();

//        String username = usernameView.getText().toString();
//        String password = passwordView.getText().toString();
//
//        if(username.isEmpty())
//        {
//            usernameView.setError("Enter username");
//        }
//
//        if(password.isEmpty())
//        {
//            passwordView.setError("Enter password");
//        }
//
//        if(loginService.login(username,password))
//        {
//            Toast.makeText(mContext,"Success",Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            Toast.makeText(mContext,"Fail",Toast.LENGTH_SHORT).show();
//        }

    }

    @Override
    public String getUsername() {
        return usernameView.getText().toString();
    }

    @Override
    public void showUsernameError(String message) {
        usernameView.setError(message);
    }

    @Override
    public String getPassword() {
        return passwordView.getText().toString();
    }

    @Override
    public void showPasswordError(String message) {
        passwordView.setError(message);
    }

    @Override
    public void showLoginSuccess(String message) {
        //You can send intent from here for Main Page.
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginError(String message) {
        Toast.makeText(mContext,message,Toast.LENGTH_SHORT).show();
    }
}
