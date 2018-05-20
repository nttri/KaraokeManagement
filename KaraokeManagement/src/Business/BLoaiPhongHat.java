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
import model.LoaiPhongHat;

/**
 *
 * @author Thoai
 */
public class BLoaiPhongHat extends Business {
    String sql;
    ResultSet rs;

    public BLoaiPhongHat() {
        super();
    }
    
    public ArrayList<LoaiPhongHat> layThongTinTatCaLoaiPhongHat() throws SQLException {
        ArrayList<LoaiPhongHat> arrLoaiPhongHat = new ArrayList();
        sql = "layThongTinTatCaLoaiPhongHat";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            LoaiPhongHat loaiPhongHat = new LoaiPhongHat();
            Helper.setLoaiPhongHat(loaiPhongHat, rs);
            arrLoaiPhongHat.add(loaiPhongHat);
        }
        return arrLoaiPhongHat;
    }
    
    public ArrayList<LoaiPhongHat> layThongTinLoaiPhongHatTheoSucChua(int sucChua) throws SQLException {
        ArrayList<LoaiPhongHat> arrLoaiPhongHat = new ArrayList();
        sql = "layThongTinLoaiPhongHatTheoSucChua " + sucChua;
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            LoaiPhongHat loaiPhongHat = new LoaiPhongHat();
            Helper.setLoaiPhongHat(loaiPhongHat, rs);
            arrLoaiPhongHat.add(loaiPhongHat);
        }
        return arrLoaiPhongHat;
    }
    
    public ArrayList<LoaiPhongHat> layThongTinLoaiPhongHatTheoGiaPhong(int giaPhong) throws SQLException {
        ArrayList<LoaiPhongHat> arrLoaiPhongHat = new ArrayList();
        sql = "layThongTinLoaiPhongHatTheoGiaPhong " + giaPhong;
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            LoaiPhongHat loaiPhongHat = new LoaiPhongHat();
            Helper.setLoaiPhongHat(loaiPhongHat, rs);
            arrLoaiPhongHat.add(loaiPhongHat);
        }
        return arrLoaiPhongHat;
    }
    
    public LoaiPhongHat layThongTinLoaiPhongHatTheoMa(int maLoaiPhong) throws SQLException {
        LoaiPhongHat loaiPhongHat = new LoaiPhongHat();
        sql = "layThongTinLoaiPhongHatTheoMa " + maLoaiPhong;
        rs = data.fetchData(sql);
        if (rs.next())
            Helper.setLoaiPhongHat(loaiPhongHat, rs);
        return loaiPhongHat;
    }
    
    public boolean themLoaiPhong(String tenLoai, int giaPhong, int sucChua, String moTa) throws SQLException {
        sql = "themLoaiPhong " + tenLoai + ", " + giaPhong + ", " + sucChua + ", " + moTa;
        return data.Execute(sql);
    }
    
    public boolean capNhatLoaiPhong(String maLoai, String tenLoai, int giaPhong, int sucChua, String moTa) throws SQLException {
        sql = "capNhatLoaiPhong " + maLoai + ", " + tenLoai + ", " + giaPhong + ", " + sucChua + ", " + moTa;
        return data.Execute(sql);
    }
    
    public boolean xoaLoaiPhong(String maLoai) throws SQLException {
        sql = "xoaLoaiPhong " + maLoai;
        return data.Execute(sql);
    }
}
