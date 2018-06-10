/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAODichVu;
import common.Helper;
import common.MyStrings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.DichVu;

/**
 *
 * @author Thoai
 */
public class BDichVu extends Business {
    String sql;
    ResultSet rs;
    DAODichVu DDichVu = new DAODichVu();

    public BDichVu() {
        super();
    }
    
    public ArrayList<DichVu> layThongTinTatCaDichVu() throws SQLException {
        return DDichVu.layThongTinTatCaDichVu();
    }
    
    public ArrayList<DichVu> layThongTinDichVuTheoDonGia(int donGia) throws SQLException {
        return DDichVu.layThongTinDichVuTheoDonGia(donGia);
    }
    
    public ArrayList<DichVu> layThongTinDichVuTheoTen(String tenDV) throws SQLException {
        return DDichVu.layThongTinDichVuTheoTen(tenDV);
    }
    
    public DichVu layThongTinDichVuTheoMa(int maDV) throws SQLException {
        return DDichVu.layThongTinDichVuTheoMa(maDV);
    }
    
    public boolean themDichVu(String tenLoaiDichVu, int donGia, String tenDichVu) throws SQLException {
        if(donGia < 1000){
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Service_Price);
            return false;
        }
        return DDichVu.themDichVu(tenLoaiDichVu, donGia, tenDichVu);
    }
    
    public boolean capNhatDichVu(int maDichVu, String tenLoaiDichVu, int donGia, String tenDichVu) throws SQLException {
        if(donGia < 1000){
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Service_Price);
            return false;
        }
        return DDichVu.capNhatDichVu(maDichVu, tenLoaiDichVu, donGia, tenDichVu);
    }
    
    public boolean xoaDichVu(int maDichVu) throws SQLException {
        return DDichVu.xoaDichVu(maDichVu);
    }   
}
