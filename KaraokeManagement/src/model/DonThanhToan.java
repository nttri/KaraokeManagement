/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author Thoai
 */
public class DonThanhToan {
    private int maDon;
    private int maNhanVien;
    private int maKhachHang;
    private int maPhong;
    private int giaPhong;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private String maKhuyenMai;
    private boolean tinhTrang;

    public int getMaDon() {
        return maDon;
    }

    public void setMaDon(int maDon) {
        this.maDon = maDon;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public DonThanhToan() {
        
    }

    public DonThanhToan(int maDon, int maNhanVien, int maKhachHang, int maPhong, int giaPhong, Date thoiGianBatDau, Date thoiGianKetThuc, String maKhuyenMai, boolean tinhTrang) {
        this.maDon = maDon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maPhong = maPhong;
        this.giaPhong = giaPhong;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.maKhuyenMai = maKhuyenMai;
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "DonThanhToan{" + "maDon=" + maDon + ", maNhanVien=" + maNhanVien + ", maKhachHang=" + maKhachHang + ", maPhong=" + maPhong + ", giaPhong=" + giaPhong + ", thoiGianBatDau=" + thoiGianBatDau + ", thoiGianKetThuc=" + thoiGianKetThuc + ", maKhuyenMai=" + maKhuyenMai + ", tinhTrang=" + tinhTrang + '}';
    }
    

}
