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
import model.NguoiDung;

/**
 *
 * @author Thoai
 */
public class BNguoiDung {
    DataProcess data;
    Helper helper;
    
    public NguoiDung timTaiKhoanLenServer(String tenDangNhap, String matKhau) throws SQLException {
        String sql = "";
        NguoiDung nguoiDung = new NguoiDung();
        ResultSet rs = data.fetchData(sql);
        helper.setNguoiDung(nguoiDung, rs);
        return nguoiDung;
    }
}
