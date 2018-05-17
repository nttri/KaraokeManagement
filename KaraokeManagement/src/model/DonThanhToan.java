/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Thoai
 */
public class DonThanhToan {
    private String maDon;
    private String maNhanVien;
    private String tenNhanVien;
    private String maKhachHang;
    private String maPhong;
    private TimeUnit thoiGianBatDau;
    private TimeUnit thoiGianKetThuc;
    private String maKhuyenMai;

    public DonThanhToan(String maDon, String maNhanVien, String tenNhanVien, String maKhachHang, String maPhong, TimeUnit thoiGianBatDau, TimeUnit thoiGianKetThuc, String maKhuyenMai) {
        this.maDon = maDon;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.maKhachHang = maKhachHang;
        this.maPhong = maPhong;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getMaDon() {
        return maDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public TimeUnit getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(TimeUnit thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public TimeUnit getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(TimeUnit thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    @Override
    public String toString() {
        return "DonThanhToan{" + "maDon=" + maDon + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", maKhachHang=" + maKhachHang + ", maPhong=" + maPhong + ", thoiGianBatDau=" + thoiGianBatDau + ", thoiGianKetThuc=" + thoiGianKetThuc + ", maKhuyenMai=" + maKhuyenMai + '}';
    }
    
    public int tinhTongTien() {
        return 0;
    }
}
