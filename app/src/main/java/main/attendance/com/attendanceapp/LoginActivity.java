package main.attendance.com.attendanceapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements LoginView
{

    TextView usernameView;
    TextView passwordView;
    LoginService loginService;
    Context mContext;
    LoginPresenter presenter;

    Button btnTeacher;
    Button btnPrincipal;
    Button btnPassSubmit;

    LinearLayout linPassLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

        //TODO Parameterize School Name
        /*getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        TextView title=(TextView)findViewById(getResources().getIdentifier("action_bar_title", "id", getPackageName()));
        title.setText("Mount Carmel High School");*/

        mContext = this;
        //usernameView = (TextView) findViewById(R.id.txtUsername);
        //passwordView = (TextView) findViewById(R.id.txtPassword);

        loginService = new LoginService();
        presenter = new LoginPresenter(this,loginService);

        btnPrincipal = (Button) findViewById(R.id.btnPrincipal);
        btnTeacher = (Button) findViewById(R.id.btnTeacher);
        btnPassSubmit = (Button) findViewById(R.id.btnPassSubmit);
        linPassLayout = (LinearLayout) findViewById(R.id.linPassLayout);

        btnTeacher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                linPassLayout.setVisibility(View.VISIBLE);
            }
        });

        btnPassSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, OptionActivity.class);
                startActivity(intent);
            }
        });

        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginActivity.this, OptionActivity.class);
                startActivity(intent);
            }
        });

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
