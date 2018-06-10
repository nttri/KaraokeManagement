/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.ChiTietDichVu;

/**
 *
 * @author thanhtri
 */
public class DAOChiTietDichVu extends DAO{
    String sql;
    ResultSet rs;
    
    public DAOChiTietDichVu() {
        super();
    }
    
    public ArrayList<ChiTietDichVu> layThongTinTatCaChiTietDichVu() throws SQLException {
        ArrayList<ChiTietDichVu> arrChiTietDichVu = new ArrayList<>();
        sql = "layThongTinTatCaChiTietDichVu";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
            Helper.setChiTietDichVu(chiTietDichVu, rs);
            arrChiTietDichVu.add(chiTietDichVu);
        }
        return arrChiTietDichVu;
    }
    
    public ChiTietDichVu layThongTinChiTietDichVuTheoMaDonVaSTT(int maDon, int STT) throws SQLException {
        ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
        sql = "layThongTinChiTietDichVuTheoMaDonVaSTT (" + maDon + ", " + STT + ")";
        rs = data.fetchData(sql);
        if (rs.next()) {
            Helper.setChiTietDichVu(chiTietDichVu, rs);
        }
        return chiTietDichVu;
    }
    
    public ArrayList<ChiTietDichVu> layThongTinChiTietDichVuTheoMaDon(int maDon) throws SQLException {
        ArrayList<ChiTietDichVu> arrChiTietDichVu = new ArrayList<>();
        sql = "layThongTinChiTietDichVuTheoMaDon (" + maDon + ")";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
            Helper.setChiTietDichVu(chiTietDichVu, rs);
            arrChiTietDichVu.add(chiTietDichVu);
        }
        return arrChiTietDichVu;
    }
    
    public boolean themChiTietDichVu(int maDon, int stt, int maDV, int donGia, int soLuong) throws SQLException {
        sql = "themChiTietDichVu (" + maDon + ", " + stt + ", " + maDV + ", " + donGia + ", " + soLuong + ")";
        return data.Execute(sql);
    }
    
     public boolean capNhatChiTietDichVu(int maDon, int stt, int maDV, int donGia, int soLuong) throws SQLException {
        sql = "capNhatChiTietDichVu (" + maDon + ", " + stt + ", " + maDV + ", " + donGia + ", " + soLuong + ")";
        return data.Execute(sql);
    }
     
    public boolean xoaChiTietDichVu(int maDon, int stt) throws SQLException {
        sql = "xoaChiTietDichVu (" + maDon + ", " + stt + ")";
        return data.Execute(sql);
    }
}
