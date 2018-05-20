/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ChiTietDichVu;
import model.DichVu;
import model.DonThanhToan;
import model.KhuyenMai;
import model.NguoiDung;
import model.NhanVien;
import model.PhongHat;
import model.KhachHang;
import model.LoaiDichVu;
import model.LoaiPhongHat;

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
    
    public static void setLoaiPhongHat(LoaiPhongHat loaiPhongHat, ResultSet rs) throws SQLException {
        loaiPhongHat.setMaLoaiPhong(rs.getInt("MALOAIPHONG"));
        loaiPhongHat.setTenLoai(rs.getString("TENLOAI"));
        loaiPhongHat.setMoTa(rs.getString("MOTA"));
        loaiPhongHat.setSucChua(rs.getInt("SUCCHUA"));
        loaiPhongHat.setGiaPhong(rs.getInt("GIAPHONG"));
    }
    
    public static void setDichVu(DichVu dichVu, ResultSet rs) throws SQLException {
        dichVu.setMaDichVu(rs.getInt("MADV"));
        dichVu.setMaLoaiDichVu(rs.getInt("MALOAIDV"));
        dichVu.setTenDichVu(rs.getString("TENDV"));
        dichVu.setDonGia(rs.getInt("DONGIA"));
    }
    
    public static void setLoaiDichVu(LoaiDichVu loaiDichVu, ResultSet rs) throws SQLException {
        loaiDichVu.setMaLoaiDichVu(rs.getInt("MALOAIDV"));
        loaiDichVu.setTenLoaiDichVu(rs.getString("TENLOAIDV"));
    }
    
    public static void setChiTietDichVu(ChiTietDichVu chiTietDichVu, ResultSet rs) throws SQLException {
        chiTietDichVu.setMaDonThanhToan(rs.getInt("MADON"));
        chiTietDichVu.setSoThuTu(rs.getInt("STT"));
        chiTietDichVu.setMaDichVu(rs.getInt("MADV"));
        chiTietDichVu.setDonGia(rs.getInt("DONGIA"));
        chiTietDichVu.setSoLuong(rs.getInt("SOLUONG"));
    }
}
