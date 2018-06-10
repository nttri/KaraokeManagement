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
import DTO.KhachHang;

/**
 *
 * @author thanhtri
 */
public class DAOKhachHang extends DAO{
    String sql;
    ResultSet rs;
    
    public DAOKhachHang(){
        super();
    }
       
    public ArrayList<KhachHang> layTatCaKhachHang() throws SQLException {
        ArrayList<KhachHang> arrKhachHang= new ArrayList();
        sql = "layTatCaKhachHang";
        rs = data.fetchData(sql);
        
        while (rs.next()) {
            KhachHang khachHang = new KhachHang();
            Helper.setKhachHang(khachHang, rs);
            arrKhachHang.add(khachHang);
        }
        return arrKhachHang;
    }
    
    public KhachHang layKhachHangTheoMa(int maKH) throws SQLException {
        KhachHang khachHang = new KhachHang();
        sql = "layKhachHangTheoMa (" + maKH + ")";
        rs = data.fetchData(sql);
        if (rs.next()){
            Helper.setKhachHang(khachHang, rs);
        }         
        return khachHang;
    }
    
    public boolean themKhachHang(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        sql = "themKhachHang (N'" + hoTen + "', N'" + gioiTinh + "', '" + ngaySinh + "', N'" + diaChi + "', '" + cmnd + "', '" + sdt + "')";
        return data.Execute(sql);
    }
    
    public boolean capNhatKhachHang(int ma, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        sql = "capNhatKhachHang (" + ma + ", N'"+ hoTen + "', N'" + gioiTinh + "', '" + ngaySinh + "', N'" + diaChi + "', '" + cmnd + "', '" + sdt + "')";
        return data.Execute(sql);
    }
    
    public boolean xoaKhachHang(int ma) throws SQLException {
        sql = "xoaKhachHang (" + ma + "')";
        return data.Execute(sql);
    }
}
