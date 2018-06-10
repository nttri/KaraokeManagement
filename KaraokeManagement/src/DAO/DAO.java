/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DatabaseConnection.DataProcess;

/**
 *
 * @author thanhtri
 */
public class DAO {
    protected DataProcess data;

    public DAO(){
        this.data = new DataProcess();
    }
}
