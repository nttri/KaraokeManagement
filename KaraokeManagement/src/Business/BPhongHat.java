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
import model.PhongHat;

/**
 *
 * @author Thoai
 */
public class BPhongHat extends Business{
    String sql;
    ResultSet rs;
    
    public ArrayList<PhongHat> layThongTinTatCaPhongHat() throws SQLException {
        ArrayList<PhongHat> arrPhongHat = new ArrayList();
        sql = "layThongTinTatCaPhongHat";
        rs = data.fetchData(sql);
        
        PhongHat phongHat = new PhongHat();
        while(rs.next()) {
            Helper.setPhongHat(phongHat, rs);
            arrPhongHat.add(phongHat);
        }
        return arrPhongHat;
    }

    public ArrayList<PhongHat> layThongTinPhongHatTheoTinhTrang(String tinhTrang) throws SQLException {
        ArrayList<PhongHat> arrPhongHat = new ArrayList();
        PhongHat phongHat = new PhongHat();
        sql = "layThongTinPhongHatTheoTinhTrang " + tinhTrang;
        rs = data.fetchData(sql);
        while (rs.next()) {
            Helper.setPhongHat(phongHat, rs);
            arrPhongHat.add(phongHat);
        }
        return arrPhongHat;
    }
    
    public PhongHat layThongTinPhongHatTheoMa(int maPhong) throws SQLException {
        PhongHat phongHat = new PhongHat();
        sql = "layThongTinPhongHatTheoMa " + maPhong;
        rs = data.fetchData(sql);
        if (rs.next())
            Helper.setPhongHat(phongHat, rs);
        return phongHat;
    }
    
    public boolean themPhongHat(int maLoaiPhong, String tinhTrang) throws SQLException {
        sql = "themPhongHat " + maLoaiPhong + ", " + tinhTrang;
        return data.Execute(sql);
    }
    
    public boolean capNhatPhongHat(int maPhong, int maLoaiPhong, String tinhTrang) throws SQLException {
        sql = "capNhatPhongHat " + maPhong + ", " + maLoaiPhong + ", " + tinhTrang;
        return data.Execute(sql);
    }
    
    public boolean xoaPhongHat(int maPhong) throws SQLException {
        sql = "xoaPhongHat " + maPhong;
        return data.Execute(sql);
    }
}