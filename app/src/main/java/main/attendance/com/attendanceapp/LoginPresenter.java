package main.attendance.com.attendanceapp;

public class LoginPresenter {

    LoginView loginView;
    LoginService loginService;

    LoginPresenter(LoginView loginView, LoginService loginService)
    {
        this.loginView=loginView;
        this.loginService=loginService;
    }

    public void onCheckLogin() {

        String username = loginView.getUsername();
        String password = loginView.getPassword();

        if(username.isEmpty()) {
            loginView.showUsernameError("Enter Username");
            return;
        }

         if(password.isEmpty()) {
            loginView.showPasswordError("Enter Password");
            return;
        }

        boolean result = loginService.login(username,password);
         if(result)
        {
            loginView.showLoginSuccess("Success");
            return;
        }

        loginView.showLoginError("Fail");


    }
}
