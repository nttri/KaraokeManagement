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
    private int maDonThanhToan;
    private int soThuTu;
    private int maDichVu;
    private int donGia;
    private int soLuong;

    public int getMaDonThanhToan() {
        return maDonThanhToan;
    }

    public void setMaDonThanhToan(int maDonThanhToan) {
        this.maDonThanhToan = maDonThanhToan;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
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

    public ChiTietDichVu(int maDonThanhToan, int soThuTu, int maDichVu, int donGia, int soLuong) {
        this.maDonThanhToan = maDonThanhToan;
        this.soThuTu = soThuTu;
        this.maDichVu = maDichVu;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietDichVu{" + "maDonThanhToan=" + maDonThanhToan + ", soThuTu=" + soThuTu + ", maDichVu=" + maDichVu + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }

    
}
