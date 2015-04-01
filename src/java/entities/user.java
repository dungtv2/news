/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Truong Van Dung
 */
public class user {

    private int id;
    private String name;
    private String username;
    private String password;
    private String img;
    private String email;
    private String birthday;
    private String sex;
    private String date_regis;
    private int roleid;
    private String role_name;
    private boolean status;

    public user() {
    }

    public user(int id, String name, String username, String password, String img, String email, String birthday, String sex, String date_regis, int roleid, boolean status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.img = img;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.date_regis = date_regis;
        this.roleid = roleid;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate_regis() {
        return date_regis;
    }

    public void setDate_regis(String date_regis) {
        this.date_regis = date_regis;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
