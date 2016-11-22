package main.attendance.com.attendanceapp;

/**
 * Created by OM SAI RAM on 15/07/16.
 */
public interface LoginView {


    String getUsername();

    void showUsernameError(String message);

    String getPassword();

    void showPasswordError(String message);

    void showLoginSuccess(String message);

    void showLoginError(String message);
}
