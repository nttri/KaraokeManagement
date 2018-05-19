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
public class NhanVien extends NguoiDung {
    private String hoten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String cmnd;
    private String sdt;
    private int luong;

    public NhanVien(int maNhanVien, String hoten, String gioiTinh, Date ngaySinh, String diaChi, String cmnd, String sdt, int luong, String tenDangNhap, String matKhau) {
        super(maNhanVien, tenDangNhap, matKhau);
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.luong = luong;
    }
    
    @Override
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    @Override
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    @Override
    public String getMatKhau() {
        return matKhau;
    }

    @Override
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", hoten=" + hoten + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", cmnd=" + cmnd + ", sdt=" + sdt + ", luong=" + luong + '}';
    }
}
