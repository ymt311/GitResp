package com.Login;

public class MainClass {
    public static void main(String args[]){
        LoginForm login = new LoginForm();
        login.init();
        login.display();
        login.validate();
    }
}
