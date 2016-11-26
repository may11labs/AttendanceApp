package main.attendance.com.attendanceapp;

public class LoginService {
    public boolean login(String username, String password) {

        if(username.equals("akshaya") && password.equals("1234"))
            return true;
        else
            return false;

    }
}
