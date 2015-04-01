/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.UserModel;

import entities.user;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import model.ConnectionManager;
import model.I.IInsert;

/**
 *
 * @author Truong Van Dung
 */
public class InsertUser implements IInsert {

    private ConnectionManager connectManager;
    private Connection con;

    public InsertUser() {
        connectManager = ConnectionManager.newInstance();
    }

    @Override
    public int insert(Object ob) {
        int check = 0;
        user user = (user) ob;
        connectManager.openConnection();
        con = connectManager.getConnection();
        try {
            CallableStatement cs = con.prepareCall("{call sp_insertUser(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, user.getName());
            cs.setString(2, user.getUsername());
            cs.setString(3, user.getPassword());
            cs.setString(4, user.getImg());
            cs.setString(5, user.getEmail());
            SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date birthday = new Date(sim.parse(user.getBirthday()).getTime());
            cs.setDate(6, birthday);
            cs.setString(7, user.getSex());
            java.sql.Date register = new Date(new java.util.Date().getTime());
            cs.setDate(8, register);
            cs.setInt(9, user.getRoleid());
            cs.setBoolean(10, user.getStatus());
            check = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return check;
        }
    }
}
