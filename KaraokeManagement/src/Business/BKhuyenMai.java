/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DatabaseConnection.DataProcess;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.KhuyenMai;

/**
 *
 * @author Thoai
 */
public class BKhuyenMai {
    DataProcess data;
    Helper helper;
    public BKhuyenMai() {
        
    }
    
    public KhuyenMai layKhuyenMaiTheoMa(String maKM) throws SQLException {
        KhuyenMai khuyenMai = new KhuyenMai();
        String sql = "";
        ResultSet rs = data.fetchData(sql);
        helper.setKhuyenMai(khuyenMai, rs);
        return khuyenMai;
    }
    
    public boolean themKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        String sql = "";
        return data.Execute(sql);
    }
    
    public boolean capNhatKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        String sql = "";
        return data.Execute(sql);
    }
    
    public boolean xoaKhuyenMai(String maKM) throws SQLException {
        String sql = "";
        return data.Execute(sql);
    }
}
