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
    private String maNhanVien;
    private String hoten;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String cmnd;
    private String sdt;
    private int luong;

    public NhanVien(String maNhanVien, String hoten, boolean gioiTinh, Date ngaySinh, String diaChi, String cmnd, String sdt, int luong, String tenDangNhap, String matKhau) {
        super(tenDangNhap, matKhau);
        this.maNhanVien = maNhanVien;
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

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
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
    
    public void themDichVu() {
        
    }
    
    public void xoaDichVu() {
        
    }
    
    public void suaDichVu() {
        
    }
    
    public void timKiemDichVu() {
        
    }
    
    public void themKhachHangThanhVien() {
        
    }
    
    public void xoaKhachHangThanhVien() {
        
    }
    
    public void suaThongTinKhachHangThanhVien() {
        
    }
    
    public void timKiemKhachHangThanhVien() {
        
    }
    
    public void themDonDatPhong() {
        
    }
    
    public void xoaDonDatPhong() {
        
    }
    
    public void suaDonDatPhong() {
        
    }
    
    public void timKiemDonDatPhong() {
        
    }
    
    public void themPhongHatMoi() {
        
    }
    
    public void xoaPhongHat() {
        
    }
    
    public void suaThongTinPhonghat() {
        
    }
    
    public void timKiemPhongHat() {
        
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", hoten=" + hoten + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", cmnd=" + cmnd + ", sdt=" + sdt + ", luong=" + luong + '}';
    }
}
