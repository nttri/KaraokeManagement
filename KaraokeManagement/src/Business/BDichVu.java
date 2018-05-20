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
import model.DichVu;

/**
 *
 * @author Thoai
 */
public class BDichVu extends Business {
    String sql;
    ResultSet rs;

    public BDichVu() {
        super();
    }
    
    public ArrayList<DichVu> layThongTinTatCaDichVu() throws SQLException {
        ArrayList<DichVu> arrDichVu = new ArrayList<>();
        sql = "layThongTinTatCaDichVu";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            DichVu dichVu = new DichVu();
            Helper.setDichVu(dichVu, rs);
            arrDichVu.add(dichVu);
        }
        return arrDichVu;
    }
    
    public ArrayList<DichVu> layThongTinDichVuTheoDonGia(int donGia) throws SQLException {
        ArrayList<DichVu> arrDichVu = new ArrayList<>();
        sql = "layThongTinDichVuTheoDonGia " + donGia;
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            DichVu dichVu = new DichVu();
            Helper.setDichVu(dichVu, rs);
            arrDichVu.add(dichVu);
        }
        return arrDichVu;
    }
    
    public ArrayList<DichVu> layThongTinDichVuTheoTen(String tenDV) throws SQLException {
        ArrayList<DichVu> arrDichVu = new ArrayList<>();
        sql = "layThongTinDichVuTheoTen N'" + tenDV + "'";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            DichVu dichVu = new DichVu();
            Helper.setDichVu(dichVu, rs);
            arrDichVu.add(dichVu);
        }
        return arrDichVu;
    }
    
    public DichVu layThongTinDichVuTheoMa(int maDV) throws SQLException {
        DichVu dichVu = new DichVu();
        sql = "layThongTinDichVuTheoMa " + maDV;
        rs = data.fetchData(sql);
        if (rs.next()) {
            Helper.setDichVu(dichVu, rs);
        }
        return dichVu;
    }
    
    public boolean themDichVu(String tenLoaiDichVu, int donGia, String tenDichVu) throws SQLException {
        sql = "themDichVu N'" + tenLoaiDichVu + "', " + donGia + ", N'" + tenDichVu + "'";
        return data.Execute(sql);
    }
    
    public boolean capNhatDichVu(int maDichVu, String tenLoaiDichVu, int donGia, String tenDichVu) throws SQLException {
        sql = "capNhatDichVu " +maDichVu + ", N'" + tenLoaiDichVu + "', " + donGia + ", N'" + tenDichVu + "'";
        return data.Execute(sql);
    }
    
    public boolean xoaDichVu(int maDichVu) throws SQLException {
        sql = "xoaDichVu " + maDichVu;
        return data.Execute(sql);
    }   
}
