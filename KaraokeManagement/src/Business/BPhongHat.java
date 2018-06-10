/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOPhongHat;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhongHat;

/**
 *
 * @author Thoai
 */
public class BPhongHat extends Business{
    String sql;
    ResultSet rs;
    DAOPhongHat DPhongHat = new DAOPhongHat();
    
    public ArrayList<PhongHat> layThongTinTatCaPhongHat() throws SQLException {
        return DPhongHat.layThongTinTatCaPhongHat();
    }

    public ArrayList<PhongHat> layThongTinPhongHatTheoTinhTrang(String tinhTrang) throws SQLException {
        return DPhongHat.layThongTinPhongHatTheoTinhTrang(tinhTrang);
    }
    
    public PhongHat layThongTinPhongHatTheoMa(int maPhong) throws SQLException {
        return DPhongHat.layThongTinPhongHatTheoMa(maPhong);
    }
    
    public boolean themPhongHat(int maLoaiPhong, String tinhTrang) throws SQLException {
        return DPhongHat.themPhongHat(maLoaiPhong, tinhTrang);
    }
    
    public boolean themPhongHatTheoTenLoaiPhong(String tenLoaiPhong, String tinhTrang) throws SQLException {
        return DPhongHat.themPhongHatTheoTenLoaiPhong(tenLoaiPhong, tinhTrang);
    }
    
    public boolean capNhatPhongHat(int maPhong, int maLoaiPhong, String tinhTrang) throws SQLException {
        return DPhongHat.capNhatPhongHat(maPhong, maLoaiPhong, tinhTrang);
    }
    
    public boolean xoaPhongHat(int maPhong) throws SQLException {
        return DPhongHat.xoaPhongHat(maPhong);                
    }
}