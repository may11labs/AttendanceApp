package main.attendance.com.attendanceapp;

/**
 * Created by OM SAI RAM on 15/07/16.
 */
public class LoginService {
    public boolean login(String username, String password) {

        if(username.equals("akshaya") && password.equals("1234"))
            return true;
        else
            return false;

    }
}
