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
public class category {

    private int cate_id;
    private String cate_alias;
    private String cate_name;
    private int cate_order;
    private int parent_id;

    public category() {
    }

    public category(int cate_id, String cate_alias, String cate_name, int cate_order, int parent_id) {
        this.cate_id = cate_id;
        this.cate_alias = cate_alias;
        this.cate_name = cate_name;
        this.cate_order = cate_order;
        this.parent_id = parent_id;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getCate_alias() {
        return cate_alias;
    }

    public void setCate_alias(String cate_alias) {
        this.cate_alias = cate_alias;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public int getCate_order() {
        return cate_order;
    }

    public void setCate_order(int cate_order) {
        this.cate_order = cate_order;
    }
    public int getParent_id() {
        return this.parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }
}
