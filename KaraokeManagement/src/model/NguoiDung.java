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
public class NguoiDung {
    protected String tenDangNhap;
    protected String matKhau;
    
    public NguoiDung(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + '}';
    }
    
    public void dangNhap(){
        
    }
    
    public void dangXuat(){
        
    }
    
    public void suaThongTinCaNhan() {
        
    }
    
    public void xemThongTinKhachHang() {
        
    }
    
    
}
