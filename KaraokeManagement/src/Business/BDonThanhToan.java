/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAODonThanhToan;
import common.Helper;
import common.MyStrings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.DonThanhToan;

/**
 *
 * @author Thoai
 */
public class BDonThanhToan extends Business{
    String sql;
    ResultSet rs;
    DAODonThanhToan DDonThanhToan = new DAODonThanhToan();
    
    public BDonThanhToan(){
        super();
    }
    
    public ArrayList<DonThanhToan> layTatCaDonThanhToan() throws SQLException {
        return DDonThanhToan.layTatCaDonThanhToan();
    }
    
    public ArrayList<DonThanhToan> layDonThanhToanTheoTinhTrang(String tinhTrang) throws SQLException {
        return DDonThanhToan.layDonThanhToanTheoTinhTrang(tinhTrang);
    }
    
    public ArrayList<DonThanhToan> layDonThanhToanTheoMaKHVaTinhTrang(int maKH, String tinhTrang) throws SQLException {
        return DDonThanhToan.layDonThanhToanTheoMaKHVaTinhTrang(maKH, tinhTrang);
    }
    
    public DonThanhToan layDonThanhToanTheoMaDon(int maDon) throws SQLException {
        return DDonThanhToan.layDonThanhToanTheoMaDon(maDon);
    }
    
    public ArrayList<DonThanhToan> layDonThanhToanTheoNgay(String ngayBD, String ngayKT) throws SQLException{
        return DDonThanhToan.layDonThanhToanTheoThoiGian(ngayBD, ngayKT);
    }
    
    public boolean themDonDatPhong( int maKH, int maPhong, int giaPhong, String thoiGianBD, String tinhTrang) throws SQLException{
        LocalDateTime datetime = LocalDateTime.now();
        String sDay = datetime.toString().substring(0, 10);
        String sTime = datetime.toString().substring(11, 21);
        String sToday = sDay + " " + sTime;

        if (thoiGianBD.compareTo(sToday) <= 0) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Start_Time);
            return false;
        }
        return DDonThanhToan.themDonDatPhong(maKH, maPhong, giaPhong, thoiGianBD, tinhTrang);
    }
    
    public boolean capNhatDonThanhToan(int maDon, int maNV, int maKH, int maPhong, int giaPhong, String thoiGianBD, String thoiGianKT, String maKM, String tinhTrang) throws SQLException {
        return DDonThanhToan.capNhatDonThanhToan(maDon, maNV, maKH, maPhong, giaPhong, thoiGianBD, thoiGianKT, maKM, tinhTrang);
    }
    
    public boolean capNhatTinhTrangDonThanhToan(int maDon, int maNV, String tinhTrang) throws SQLException {
        return DDonThanhToan.capNhatTinhTrangDonThanhToan(maDon, maNV, tinhTrang);
    }
    
    public boolean capNhatDonDatPhong(int maDon, int maKH, int maPhong, int giaPhong, String thoiGianBD, String tinhTrang) throws SQLException {
        LocalDateTime datetime = LocalDateTime.now();
        String sDay = datetime.toString().substring(0, 10);
        String sTime = datetime.toString().substring(11, 21);
        String sToday = sDay + " " + sTime;

        if (thoiGianBD.compareTo(sToday) <= 0) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Start_Time);
            return false;
        }
        return DDonThanhToan.capNhatDonDatPhong(maDon, maKH, maPhong, giaPhong, thoiGianBD, tinhTrang);
    }
    
    public boolean xoaDonDatPhong(int maDon) throws SQLException{
        return DDonThanhToan.xoaDonDatPhong(maDon);
    }
}
