/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOLoaiPhongHat;
import common.Helper;
import common.MyStrings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.LoaiPhongHat;

/**
 *
 * @author Thoai
 */
public class BLoaiPhongHat extends Business {

    String sql;
    ResultSet rs;
    DAOLoaiPhongHat DLoaiPhongHat = new DAOLoaiPhongHat();

    public BLoaiPhongHat() {
        super();
    }

    public ArrayList<LoaiPhongHat> layThongTinTatCaLoaiPhongHat() throws SQLException {
        return DLoaiPhongHat.layThongTinTatCaLoaiPhongHat();
    }

    public ArrayList<LoaiPhongHat> layThongTinLoaiPhongHatTheoSucChua(int sucChua) throws SQLException {
        return DLoaiPhongHat.layThongTinLoaiPhongHatTheoSucChua(sucChua);
    }

    public ArrayList<LoaiPhongHat> layThongTinLoaiPhongHatTheoGiaPhong(int giaPhong) throws SQLException {
        return DLoaiPhongHat.layThongTinLoaiPhongHatTheoGiaPhong(giaPhong);
    }

    public LoaiPhongHat layThongTinLoaiPhongHatTheoTen(String tenLoai) throws SQLException {
        return DLoaiPhongHat.layThongTinLoaiPhongHatTheoTen(tenLoai);
    }

    public LoaiPhongHat layThongTinLoaiPhongHatTheoMa(int maLoaiPhong) throws SQLException {
        return DLoaiPhongHat.layThongTinLoaiPhongHatTheoMa(maLoaiPhong);
    }

    public boolean themLoaiPhong(String tenLoai, int giaPhong, int sucChua, String moTa) throws SQLException {
        if (giaPhong < 50000) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Room_Price);
            return false;
        }
        if (sucChua > 200) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Room_Volume);
            return false;
        }
        return DLoaiPhongHat.themLoaiPhong(tenLoai, giaPhong, sucChua, moTa);
    }

    public boolean capNhatLoaiPhong(String maLoai, String tenLoai, int giaPhong, int sucChua, String moTa) throws SQLException {
        if (giaPhong < 50000) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Room_Price);
            return false;
        }
        if (sucChua > 200) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Room_Volume);
            return false;
        }
        return DLoaiPhongHat.capNhatLoaiPhong(maLoai, tenLoai, giaPhong, sucChua, moTa);
    }

    public boolean xoaLoaiPhong(String maLoai) throws SQLException {
        return DLoaiPhongHat.xoaLoaiPhong(maLoai);
    }
}
