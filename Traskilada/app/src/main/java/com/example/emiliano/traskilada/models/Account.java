package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class Account extends BaseModel{
    private String email;
    private String password;
    private User user;
    private LoginType loginType;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
