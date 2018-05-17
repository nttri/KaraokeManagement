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
public class PhongHat {
    private String maPhong;
    private int loaiPhong;
    private int sucChua;
    private String moTa;
    private int giaPhong;
    private boolean tinhTrang;

    public PhongHat(String maPhong, int loaiPhong, int sucChua, String moTa, int giaPhong, boolean tinhTrang) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.sucChua = sucChua;
        this.moTa = moTa;
        this.giaPhong = giaPhong;
        this.tinhTrang = tinhTrang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "PhongHat{" + "maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", sucChua=" + sucChua + ", moTa=" + moTa + ", giaPhong=" + giaPhong + ", tinhTrang=" + tinhTrang + '}';
    }
    
}
