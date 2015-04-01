/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.CategoryModel;

import entities.category;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ConnectionManager;
import model.I.ISelect;

/**
 *
 * @author Truong Van Dung
 */
public class SelectCategoryAll implements ISelect<category> {

    private ConnectionManager connectManager;
    private Connection con;

    public SelectCategoryAll() {
        connectManager = ConnectionManager.newInstance();
    }

    @Override
    public List<category> select(category t) {
        List<category> list = null;
        connectManager.openConnection();
        con = connectManager.getConnection();
        try {
            list = new ArrayList<category>();
            CallableStatement cs = con.prepareCall("{call sp_selectCategoryAll}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                category n = new category();
                n.setCate_id(rs.getInt(1));
                n.setCate_alias(rs.getString(2));
                n.setCate_name(rs.getString(3));
                n.setCate_order(rs.getInt(4));
                list.add(n);
            }
        } catch (Exception e) {
        } finally {
            connectManager.closeConnection();
            return list;
        }
    }
}
