/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KhuyenMai;

/**
 *
 * @author Thoai
 */
public class BKhuyenMai extends Business{
    String sql;
    ResultSet rs;
    
    public BKhuyenMai(){
        super();
    }
    
    public ArrayList<KhuyenMai> layTatCaKhuyenMai() throws SQLException {
        ArrayList<KhuyenMai> arrKhuyenMai = new ArrayList();
        sql = "layTatCaKhuyenMai";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            KhuyenMai khuyenMai = new KhuyenMai();
            Helper.setKhuyenMai(khuyenMai, rs);
            arrKhuyenMai.add(khuyenMai);
        }
        return arrKhuyenMai;
    }
    
    public KhuyenMai layKhuyenMaiTheoMa(String maKM) throws SQLException {
        KhuyenMai khuyenMai = new KhuyenMai();
        sql = "layKhuyenMaiTheoMa " + maKM;
        rs = data.fetchData(sql);
        if (rs.next()){
            Helper.setKhuyenMai(khuyenMai, rs);
        }      
        return khuyenMai;
    }
    
    public boolean themKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        sql = "themKhuyenMai " + maKM + ", " + tenKM + ", " + giaTriKM + ", " + thoiGianBD + ", " + thoiGianKT;
        return data.Execute(sql);
    }
    
    public boolean capNhatKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        sql = "capNhatKhuyenMai " + maKM + ", " + tenKM + ", " + giaTriKM + ", " + thoiGianBD + ", " + thoiGianKT;
        return data.Execute(sql);
    }
    
    public boolean xoaKhuyenMai(String maKM) throws SQLException {
        sql = "xoaKhuyenMai " + maKM;
        return data.Execute(sql);
    }
}
