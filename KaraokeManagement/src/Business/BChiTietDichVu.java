/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOChiTietDichVu;
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
    DAOChiTietDichVu DChiTietDichVu = new DAOChiTietDichVu();
    
    public BChiTietDichVu() {
        super();
    }
    
    public ArrayList<ChiTietDichVu> layThongTinTatCaChiTietDichVu() throws SQLException {
        return DChiTietDichVu.layThongTinTatCaChiTietDichVu();
    }
    
    public ChiTietDichVu layThongTinChiTietDichVuTheoMaDonVaSTT(int maDon, int STT) throws SQLException {
        if (maDon < 1 || STT < 0){
            return null;
        }
        return DChiTietDichVu.layThongTinChiTietDichVuTheoMaDonVaSTT(maDon, STT);
    }
    
    public ArrayList<ChiTietDichVu> layThongTinChiTietDichVuTheoMaDon(int maDon) throws SQLException {
        if (maDon < 1){
            return null;
        }
        return DChiTietDichVu.layThongTinChiTietDichVuTheoMaDon(maDon);
    }
    
    public boolean themChiTietDichVu(int maDon, int stt, int maDV, int donGia, int soLuong) throws SQLException {
        if(maDon < 1 || stt < 0 || maDV < 3000 || donGia < 1000 || soLuong < 1){
            return false;
        }
        return DChiTietDichVu.themChiTietDichVu(maDon, stt, maDV, donGia, soLuong);
    }
    
     public boolean capNhatChiTietDichVu(int maDon, int stt, int maDV, int donGia, int soLuong) throws SQLException {
        if(maDon < 1 || stt < 0 || maDV < 3000 || donGia < 1000 || soLuong < 1){
            return false;
        }
        return DChiTietDichVu.capNhatChiTietDichVu(maDon, stt, maDV, donGia, soLuong);
    }
     
    public boolean xoaChiTietDichVu(int maDon, int stt) throws SQLException {
        if (maDon < 1 || stt < 0){
            return false;
        }
        return DChiTietDichVu.xoaChiTietDichVu(maDon, stt);
    }
}
