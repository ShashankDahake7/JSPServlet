package com.CodingNinjas.struts2;

public class LoginAction {
    private String user;

    public String execute() throws Exception {
        return "success";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}