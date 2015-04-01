/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Truong Van Dung
 */
public class role {

    private int role_id;
    private String role_name;
    private String role_des;

    public role() {
    }

    public role(int role_id, String role_name, String role_des) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.role_des = role_des;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_des() {
        return role_des;
    }

    public void setRole_des(String role_des) {
        this.role_des = role_des;
    }
}
