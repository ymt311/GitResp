package com.Login;

public class UserDAO {
    DBUtil db = new DBUtil();
    public boolean findUser(String userName,String userPassword) {
        if (!db.getConnection()) {
            return false;
        } else {
            boolean b = true;
            return b;
        }
    }
}
