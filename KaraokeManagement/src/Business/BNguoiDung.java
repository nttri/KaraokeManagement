/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAONguoiDung;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NguoiDung;

/**
 *
 * @author Thoai
 */
public class BNguoiDung extends Business{
    String sql;
    ResultSet rs;
    DAONguoiDung DNguoiDung = new DAONguoiDung();
    
    public BNguoiDung(){
        super();
    }    
    
    public NguoiDung timTaiKhoan(String tenDangNhap, String matKhau) throws SQLException {
        return DNguoiDung.timTaiKhoan(tenDangNhap, matKhau);
    }
    
    public boolean capNhatTaiKhoan(String tenDangNhap, String matKhau) throws SQLException {
        return DNguoiDung.capNhatTaiKhoan(tenDangNhap, matKhau);
    }
}
