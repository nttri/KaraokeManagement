/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DatabaseConnection.DataProcess;
import java.sql.ResultSet;

/**
 *
 * @author Thoai
 */
public class Business {
    protected DataProcess data;
    protected String table;
    protected String id;

    public Business(){
        this.data = new DataProcess();
        this.table = "";
        this.id = "";
    }

    
    public ResultSet getAll() {
        String SQL = "Select  * From "+this.table;
        return this.data.fetchData(SQL);
    }
    
    public ResultSet getByID(String id) {
        String SQL = "Select * From " + this.table + " where " + this.id + " = N'" + id +"'";
        return this.data.fetchData(SQL);
    }
    
    public ResultSet searchByID(String id) {
        String SQL = "Select * From " + this.table + " Where " + this.id + " Like '%" + id + "%'";
        return this.data.fetchData(SQL);
    }
    
}
