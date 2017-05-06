package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class Account extends BaseModel {
    private String email;
    private String password;
    private User user;
    private LoginType loginType;

    public String getEmail() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Account setUser(User user) {
        this.user = user;
        return this;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public Account setLoginType(LoginType loginType) {
        this.loginType = loginType;
        return this;
    }
}
