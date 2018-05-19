/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.DonThanhToan;
import model.KhuyenMai;
import model.ThanhVien;

/**
 *
 * @author Thoai
 */
public class Helper {
    public Helper() {
        
    }
    
    public void setDonThanhToan(DonThanhToan donThanhToan, ResultSet rs) throws SQLException {
        donThanhToan.setMaDon(rs.getInt("MADON"));
        donThanhToan.setMaNhanVien(rs.getInt("MANV"));
        donThanhToan.setMaKhachHang(rs.getInt("MAKH"));
        donThanhToan.setMaPhong(rs.getInt("MAPHONG"));
        donThanhToan.setGiaPhong(rs.getInt("GIAPHONG"));
        donThanhToan.setThoiGianBatDau(rs.getDate("THOIGIANBD"));
        donThanhToan.setThoiGianKetThuc(rs.getDate("THOIGIANKT"));
        donThanhToan.setMaKhuyenMai(rs.getString("MAKM"));
        donThanhToan.setTinhTrang(rs.getBoolean("TINHTRANG"));
    }
    
    public void setKhuyenMai(KhuyenMai khuyenMai, ResultSet rs) throws SQLException {
        khuyenMai.setMaKM(rs.getString("MAKM"));
        khuyenMai.setTenKM(rs.getNString("TENKM"));
        khuyenMai.setGiaTriKM(rs.getInt("GIATRIKM"));
        khuyenMai.setThoiGianBD(rs.getDate("THOIGIANBD"));
        khuyenMai.setThoiGianKT(rs.getDate("THOIGIANKT"));
    }
    
    public void setThanhVien(ThanhVien thanhVien, ResultSet rs) throws SQLException {
        thanhVien.setMaThanhVien(rs.getInt("MAKH"));
        thanhVien.setHoTen(rs.getNString("HOTEN"));
        thanhVien.setGioiTinh(rs.getNString("GIOITINH"));
        thanhVien.setNgaySinh(rs.getDate("NGAYSINH"));
        thanhVien.setDiaChi(rs.getNString("DIACHI"));
        thanhVien.setCmnd(rs.getString("CMND"));
        thanhVien.setSdt(rs.getString("SDT"));
    }
}
