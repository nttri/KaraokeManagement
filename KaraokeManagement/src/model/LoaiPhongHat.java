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
public class LoaiPhongHat {
    private int maLoaiPhong;
    private String moTa;
    private int sucChua;
    private int giaPhong;
    private String tenLoai;

    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(int maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiPhongHat(int maLoaiPhong, String moTa, int sucChua, int giaPhong, String tenLoai) {
        this.maLoaiPhong = maLoaiPhong;
        this.moTa = moTa;
        this.sucChua = sucChua;
        this.giaPhong = giaPhong;
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiPhongHat{" + "maLoaiPhong=" + maLoaiPhong + ", moTa=" + moTa + ", sucChua=" + sucChua + ", giaPhong=" + giaPhong + ", tenLoai=" + tenLoai + '}';
    }
    
    
}
