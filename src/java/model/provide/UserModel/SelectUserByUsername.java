/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.UserModel;

import entities.user;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.ConnectionManager;
import model.I.ISelect;

/**
 *
 * @author Truong Van Dung
 */
public class SelectUserByUsername extends AbstractSearchByAll implements ISelect<user> {

    private ConnectionManager connectManager;
    private Connection con;

    public SelectUserByUsername() {
        connectManager = ConnectionManager.newInstance();
    }

    @Override
    public List<user> select(user t) {
        List<user> list = null;
        connectManager.openConnection();
        con = connectManager.getConnection();
        try {
            list = new ArrayList<user>();
            CallableStatement cs = con.prepareCall("{call sp_selectUserByUsername(?)}");
            cs.setString(1, t.getUsername());
            ResultSet rs = cs.executeQuery();
            list = SelectUserCode.select(rs);
        } catch (Exception e) {
        } finally {
            connectManager.closeConnection();
            return list;
        }
    }
     @Override
    public void search(String str) {
        user user = new user();
        user.setUsername(str);
        if (select(user) != null && select(user).size() > 0) {
            super.setList(select(user));
            super.setNextSearch(null);
        } else {
            super.change(str);
        }
    }
}
