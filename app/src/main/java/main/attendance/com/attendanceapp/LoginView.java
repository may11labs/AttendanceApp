package main.attendance.com.attendanceapp;

public interface LoginView {


    String getUsername();

    void showUsernameError(String message);

    String getPassword();

    void showPasswordError(String message);

    void showLoginSuccess(String message);

    void showLoginError(String message);
}
