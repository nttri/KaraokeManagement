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
import model.NguoiDung;
import model.NhanVien;
import model.PhongHat;
import model.KhachHang;

/**
 *
 * @author Thoai
 */
public class Helper {
    public Helper() {
        
    }
    
    public static void setDonThanhToan(DonThanhToan donThanhToan, ResultSet rs) throws SQLException {
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
    
    public static void setKhuyenMai(KhuyenMai khuyenMai, ResultSet rs) throws SQLException {
        khuyenMai.setMaKM(rs.getString("MAKM"));
        khuyenMai.setTenKM(rs.getNString("TENKM"));
        khuyenMai.setGiaTriKM(rs.getInt("GIATRIKM"));
        khuyenMai.setThoiGianBD(rs.getDate("THOIGIANBD"));
        khuyenMai.setThoiGianKT(rs.getDate("THOIGIANKT"));
    }
    
    public static void setKhachHang(KhachHang khachHang, ResultSet rs) throws SQLException {
        khachHang.setMaKH(rs.getInt("MAKH"));
        khachHang.setHoTen(rs.getNString("HOTEN"));
        khachHang.setGioiTinh(rs.getNString("GIOITINH"));
        khachHang.setNgaySinh(rs.getDate("NGAYSINH"));
        khachHang.setDiaChi(rs.getNString("DIACHI"));
        khachHang.setCmnd(rs.getString("CMND"));
        khachHang.setSdt(rs.getString("SDT"));
    }
    
    public static void setNguoiDung(NguoiDung nguoiDung, ResultSet rs) throws SQLException {
        nguoiDung.setTenDangNhap(rs.getString("TENTK"));
        nguoiDung.setMatKhau(rs.getString("MATKHAU"));
        nguoiDung.setMaNhanVien(rs.getInt("MANV"));
        nguoiDung.setChucVu(rs.getString("CHUCVU"));
    }
    
    public static void setNhanVien(NhanVien nhanVien, ResultSet rs) throws SQLException {
        nhanVien.setMaNhanVien(rs.getInt("MANV"));
        nhanVien.setHoten(rs.getString("HOTEN"));
        nhanVien.setGioiTinh(rs.getString("GIOITINH"));
        nhanVien.setDiaChi(rs.getString("DIACHI"));
        nhanVien.setCmnd(rs.getString("CMND"));
        nhanVien.setSdt(rs.getString("SDT"));
        nhanVien.setNgaySinh(rs.getDate("NGAYSINH"));
        nhanVien.setLuong(rs.getInt("LUONG"));
    }
    
    public static void setPhongHat(PhongHat phongHat, ResultSet rs) throws SQLException {
        phongHat.setMaPhong(rs.getInt("MAPHONG"));
        phongHat.setMaLoaiPhong(rs.getInt("MALOAIPHONG"));
        phongHat.setTinhTrang(rs.getString("TINHTRANG"));
    }
}