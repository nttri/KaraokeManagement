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
import model.DonThanhToan;

/**
 *
 * @author Thoai
 */
public class BDonThanhToan extends Business{
    String sql;
    ResultSet rs;
    
    public BDonThanhToan(){
        super();
    }
    
    public ArrayList<DonThanhToan> layTatCaDonThanhToan() throws SQLException {
        ArrayList<DonThanhToan> arrDonThanhToan = new ArrayList();
        sql = "layTatCaDonThanhToan ";
        rs = data.fetchData(sql);
        
        while (rs.next()) {
            DonThanhToan donThanhToan = new DonThanhToan();
            Helper.setDonThanhToan(donThanhToan, rs);
            arrDonThanhToan.add(donThanhToan);
        }
        return arrDonThanhToan;
    }
    
    public DonThanhToan layDonThanhToanTheoMaDon(int maDon) throws SQLException {
        DonThanhToan donThanhToan = new DonThanhToan();
        sql = "layDonThanhToanTheoMaDon " + maDon;
        rs = data.fetchData(sql);
        if (rs.next()){
            Helper.setDonThanhToan(donThanhToan, rs);
        }         
        return donThanhToan;
    }
    
    public boolean themDonThanhToan(int maNV, int maKH, int maPhong, int giaPhong, String thoiGianBD, String thoiGianKT, String maKM, String tinhTrang) throws SQLException{
        sql = "themDonThanhToan " + maNV + ", " + maKH + ", " + maPhong + ", " + giaPhong + ", " +thoiGianBD + ", " +thoiGianKT + ", " +maKM + ", N'" + tinhTrang + "'";
        return data.Execute(sql);
    }
    
    public boolean themDonDatPhong( int maKH, int maPhong, int giaPhong, String thoiGianBD, String tinhTrang) throws SQLException{
        sql = "themDonDatPhong " + maKH + ", " + maPhong + ", " + giaPhong + ", " +thoiGianBD + ", N'" + tinhTrang + "'";
        return data.Execute(sql);
    }
    
    public boolean capNhatDonThanhToan(int maDon, int maNV, int maKH, int maPhong, int giaPhong, String thoiGianBD, String thoiGianKT, String maKM, String tinhTrang) throws SQLException {
        sql = "capNhatDonThanhToan " + maDon + ", " + maNV + ", " + maKH + ", " + maPhong + ", " + giaPhong + ", " +thoiGianBD + ", " +thoiGianKT + ", " +maKM + ", N'" + tinhTrang + "'";
        return data.Execute(sql);
    }
    
    public boolean capNhatDonDatPhong(int maDon, int maKH, int maPhong, int giaPhong, String thoiGianBD, String tinhTrang) throws SQLException {
        sql = "capNhatDonDatPhong " + maDon + ", " + maKH + ", " + maPhong + ", " + giaPhong + ", " +thoiGianBD + ", N'" + tinhTrang + "'";
        return data.Execute(sql);
    }
    
    public boolean xoaDonThanhToan(int maDon) throws SQLException{
        sql = "xoaDonThanhToan " + maDon;
        return data.Execute(sql);
    }
    
    public boolean xoaDonDatPhong(int maDon) throws SQLException{
        sql = "xoaDonDatPhong " + maDon;
        return data.Execute(sql);
    }
}
