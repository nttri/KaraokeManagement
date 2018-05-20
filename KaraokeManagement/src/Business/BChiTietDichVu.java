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
import model.ChiTietDichVu;

/**
 *
 * @author Thoai
 */
public class BChiTietDichVu extends Business{
    String sql;
    ResultSet rs;
    
    public BChiTietDichVu() {
        super();
    }
    
    public ArrayList<ChiTietDichVu> layThongTinTatCaChiTietDichVu() throws SQLException {
        ArrayList<ChiTietDichVu> arrChiTietDichVu = new ArrayList<>();
        sql = "layThongTinTatCaChiTietDichVu";
        rs = data.fetchData(sql);
        
        ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
        while(rs.next()) {
            Helper.setChiTietDichVu(chiTietDichVu, rs);
            arrChiTietDichVu.add(chiTietDichVu);
        }
        return arrChiTietDichVu;
    }
    
    public ChiTietDichVu layThongTinChiTietDichVuTheoMaDonVaSTT(String maDon, int STT) throws SQLException {
        ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
        sql = "layThongTinChiTietDichVuTheoMaDonVaSTT " + maDon + ", " + STT;
        rs = data.fetchData(sql);
        if (rs.next()) {
            Helper.setChiTietDichVu(chiTietDichVu, rs);
        }
        return chiTietDichVu;
    }
    
    public boolean themChiTietDichVu(int maDV, int donGia, int soLuong) throws SQLException {
        sql = "themChiTietDichVu " + maDV + ", " + donGia + ", " + soLuong;
        return data.Execute(sql);
    }
    
     public boolean capNhatChiTietDichVu(int maDon, int stt, int maDV, int donGia, int soLuong) throws SQLException {
        sql = "capNhatChiTietDichVu " + maDon + ", " + stt + ", " + maDV + ", " + donGia + ", " + soLuong;
        return data.Execute(sql);
    }
     
    public boolean xoaChiTietDichVu(int maDon, int stt) {
        sql = "xoaChiTietDichVu " + maDon + ", " + stt;
        return data.Execute(sql);
    }
}
