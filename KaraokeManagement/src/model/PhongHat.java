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
    private int maPhong;
    private String loaiPhong;
    private int sucChua;
    private String moTa;
    private int giaPhong;
    private String tinhTrang;

    public PhongHat(int maPhong, String loaiPhong, int sucChua, String moTa, int giaPhong, String tinhTrang) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.sucChua = sucChua;
        this.moTa = moTa;
        this.giaPhong = giaPhong;
        this.tinhTrang = tinhTrang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
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

    public String isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "PhongHat{" + "maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", sucChua=" + sucChua + ", moTa=" + moTa + ", giaPhong=" + giaPhong + ", tinhTrang=" + tinhTrang + '}';
    }
    
}
