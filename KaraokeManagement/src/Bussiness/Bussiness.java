/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import DatabaseConnection.DataProcess;
import java.sql.ResultSet;

/**
 *
 * @author Thoai
 */
public class Bussiness {
    private DataProcess dataBase;
    private String table;
    private String id;

    public Bussiness(DataProcess dataBase, String table, String id) {
        this.dataBase = dataBase;
        this.table = table;
        this.id = id;
    }
    
    public ResultSet getAll() {
        String SQL = "Select  * From "+this.table;
        return this.dataBase.fetchData(SQL);
    }
    
    public ResultSet getByID(String id) {
        String SQL = "Select * From " + this.table + " where " + this.id + " = N'" + id +"'";
        return this.dataBase.fetchData(SQL);
    }
    
    public ResultSet searchByID(String id) {
        String SQL = "Select * From " + this.table + " Where " + this.id + " Like '%" + id + "%'";
        return this.dataBase.fetchData(SQL);
    }
    
}
