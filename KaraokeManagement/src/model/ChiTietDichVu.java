/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thoai
 */
public class ChiTietDichVu {
    private String maDonThanhToan;
    private int soThuTu;
    private String tenDichVu;
    private int donGia;
    private int soLuong;

    public ChiTietDichVu(String maDonThanhToan, int soThuTu, String tenDichVu, int donGia, int soLuong) {
        this.maDonThanhToan = maDonThanhToan;
        this.soThuTu = soThuTu;
        this.tenDichVu = tenDichVu;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaDonThanhToan() {
        return maDonThanhToan;
    }

    public void setMaDonThanhToan(String maDonThanhToan) {
        this.maDonThanhToan = maDonThanhToan;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietDichVu{" + "maDonThanhToan=" + maDonThanhToan + ", soThuTu=" + soThuTu + ", tenDichVu=" + tenDichVu + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }
    
    
}
