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
public class KhuyenMai {
    private String maKM;
    private String tenKM;
    private int giaTriKM;
    private Date thoiGianBD;
    private Date thoiGianKT;

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public int getGiaTriKM() {
        return giaTriKM;
    }

    public void setGiaTriKM(int giaTriKM) {
        this.giaTriKM = giaTriKM;
    }

    public Date getThoiGianBD() {
        return thoiGianBD;
    }

    public void setThoiGianBD(Date thoiGianBD) {
        this.thoiGianBD = thoiGianBD;
    }

    public Date getThoiGianKT() {
        return thoiGianKT;
    }

    public void setThoiGianKT(Date thoiGianKT) {
        this.thoiGianKT = thoiGianKT;
    }

    public KhuyenMai() {
        
    }
    
    public KhuyenMai(String maKM, String tenKM, int giaTriKM, Date thoiGianBD, Date thoiGianKT) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.giaTriKM = giaTriKM;
        this.thoiGianBD = thoiGianBD;
        this.thoiGianKT = thoiGianKT;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "maKM=" + maKM + ", tenKM=" + tenKM + ", giaTriKM=" + giaTriKM + ", thoiGianBD=" + thoiGianBD + ", thoiGianKT=" + thoiGianKT + '}';
    }
    
    
    
}
