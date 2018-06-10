/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOKhuyenMai;
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
    DAOKhuyenMai DKhuyenMai = new DAOKhuyenMai();
    
    public BKhuyenMai(){
        super();
    }
    
    public ArrayList<KhuyenMai> layTatCaKhuyenMai() throws SQLException {
        return DKhuyenMai.layTatCaKhuyenMai();
    }
    
    public KhuyenMai layKhuyenMaiTheoMa(String maKM) throws SQLException {
        return DKhuyenMai.layKhuyenMaiTheoMa(maKM);
    }
    
    public boolean themKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        if(giaTriKM < 1000){
            return false;
        }
        return DKhuyenMai.themKhuyenMai(maKM, tenKM, giaTriKM, thoiGianBD, thoiGianKT);
    }
    
    public boolean capNhatKhuyenMai(String maKM, String tenKM, int giaTriKM, String thoiGianBD, String thoiGianKT) throws SQLException {
        if(giaTriKM < 1000){
            return false;
        }
        return DKhuyenMai.capNhatKhuyenMai(maKM, tenKM, giaTriKM, thoiGianBD, thoiGianKT);
    }
    
    public boolean xoaKhuyenMai(String maKM) throws SQLException {
        return DKhuyenMai.xoaKhuyenMai(maKM);
    }
}
