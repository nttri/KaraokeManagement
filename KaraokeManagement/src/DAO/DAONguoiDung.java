/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NguoiDung;

/**
 *
 * @author thanhtri
 */
public class DAONguoiDung extends DAO{
    String sql;
    ResultSet rs;
    
    public DAONguoiDung(){
        super();
    }    
    
    public NguoiDung timTaiKhoan(String tenDangNhap, String matKhau) throws SQLException {
        sql = "timTaiKhoan " + tenDangNhap + ", " + matKhau;
        NguoiDung nguoiDung = new NguoiDung();
        rs = data.fetchData(sql);
        if (rs.next()){
            Helper.setNguoiDung(nguoiDung, rs);
        }
        return nguoiDung;
    }
    
    public boolean capNhatTaiKhoan(String tenDangNhap, String matKhau) throws SQLException {
        sql = "capNhatTaiKhoan ('" + tenDangNhap + "', '" + matKhau + "')";
        return data.Execute(sql);
    }
}
