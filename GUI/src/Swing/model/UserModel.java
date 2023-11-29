package model;

import java.awt.List;
import java.util.ArrayList;

public class UserModel {
    private String email;
    private String password;

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

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public ArrayList<UserModel> list = new ArrayList<>();
}
