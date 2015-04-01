/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.CategoryModel;

import entities.category;
import java.sql.CallableStatement;
import java.sql.Connection;
import model.ConnectionManager;
import model.I.IInsert;

/**
 *
 * @author Truong Van Dung
 */
public class InsertCategory implements IInsert {

    private ConnectionManager connectManager;
    private Connection con;

    public InsertCategory() {
        connectManager = ConnectionManager.newInstance();
    }

    @Override
    public int insert(Object ob) {
        int check = 0;
        category cate = (category) ob;
        connectManager.openConnection();
        con = connectManager.getConnection();
        try {
            CallableStatement cs = con.prepareCall("{call sp_insertCate(?,?,?,?)}");
            cs.setInt(1, cate.getCate_id());
            cs.setString(2, cate.getCate_alias());
            cs.setString(3, cate.getCate_name());
            cs.setInt(4, cate.getCate_order());
            check = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return check;
        }
    }
}