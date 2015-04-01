/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.RoleModel;

import entities.role;
import java.sql.CallableStatement;
import java.sql.Connection;
import model.ConnectionManager;
import model.I.IUpdate;

/**
 *
 * @author Truong Van Dung
 */
public class UpdateRole implements IUpdate {

    private ConnectionManager connectManager;
    private Connection con;

    public UpdateRole() {
        connectManager = ConnectionManager.newInstance();
    }

    @Override
    public int update(Object ob) {
        int check = 0;
        role role = (role) ob;
        connectManager.openConnection();
        con = connectManager.getConnection();
        try {
            CallableStatement cs = con.prepareCall("{call sp_updateRole(?,?,?)}");
            cs.setInt(1, role.getRole_id());
            cs.setString(2, role.getRole_name());
            cs.setString(3, role.getRole_des());

            check = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return check;
        }
    }

}
