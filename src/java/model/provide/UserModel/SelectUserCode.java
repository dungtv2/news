/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.provide.UserModel;

import entities.user;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Truong Van Dung
 */
public class SelectUserCode {

    public static List<user> select(ResultSet rs) {
        List<user> list = null;
        try {
            list = new ArrayList<user>();
            while (rs.next()) {
                user n = new user();
                n.setId(rs.getInt(1));
                n.setName(rs.getString(2));
                n.setUsername(rs.getString(3));
                n.setPassword(rs.getString(4));
                n.setImg(rs.getString(5));
                n.setEmail(rs.getString(6));
                SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
                if (rs.getDate(7) != null) {
                    Date birthday = new Date(rs.getDate(7).getTime());
                    n.setBirthday(sim.format(birthday));
                }
                if (rs.getDate(9) != null) {
                    Date regis = new Date(rs.getDate(9).getTime());
                    n.setDate_regis(sim.format(regis));
                }
                n.setSex(rs.getString(8));
                n.setStatus(rs.getBoolean(10));
                n.setRoleid(rs.getInt(11));
                n.setRole_name(rs.getString(13));
                list.add(n);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
