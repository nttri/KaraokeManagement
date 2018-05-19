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
public class DichVu {
    private int maDichVu;
    private int maLoaiDichVu;
    private String tenDichVu;
    private int donGia;

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public int getMaLoaiDichVu() {
        return maLoaiDichVu;
    }

    public void setMaLoaiDichVu(int maLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
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

    public DichVu(int maDichVu, int maLoaiDichVu, String tenDichVu, int donGia) {
        this.maDichVu = maDichVu;
        this.maLoaiDichVu = maLoaiDichVu;
        this.tenDichVu = tenDichVu;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "DichVu{" + "maDichVu=" + maDichVu + ", maLoaiDichVu=" + maLoaiDichVu + ", tenDichVu=" + tenDichVu + ", donGia=" + donGia + '}';
    }

    
}
