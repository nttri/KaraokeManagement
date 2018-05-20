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
    private int maLoaiPhong;
    private String tinhTrang;

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(int maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public PhongHat() {
        
    }
    
    public PhongHat(int maPhong, int maLoaiPhong, String tinhTrang) {
        this.maPhong = maPhong;
        this.maLoaiPhong = maLoaiPhong;
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "PhongHat{" + "maPhong=" + maPhong + ", maLoaiPhong=" + maLoaiPhong + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
}
