/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import DatabaseConnection.DataProcess;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.NhanVien;

/**
 *
 * @author Thoai
 */
public class BNhanVien {
    DataProcess data;
    Helper helper;
    
    public NhanVien layThongTinNhanVien(int maNV) throws SQLException {
        String sql = "";
        NhanVien nhanVien = new NhanVien();
        ResultSet rs = data.fetchData(sql);
        helper.setNhanVien(nhanVien, rs);
        return nhanVien;
    }
}
