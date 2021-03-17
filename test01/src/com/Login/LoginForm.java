package com.Login;

public class LoginForm {
    UserDAO dao = new UserDAO();
    public void init(){
        System.out.println("初始化完成！");
    }
    public void display(){
        System.out.println("显示窗口成功！");
    }
    public void validate(){
        String userName = "张三";
        String userPassword ="123";
        if (!dao.findUser(userName, userPassword)) {
            System.out.println("登录失败！");
        } else System.out.println("登录成功！");
    }
}
