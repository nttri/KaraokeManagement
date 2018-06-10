/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.LoaiDichVu;

/**
 *
 * @author thanhtri
 */
public class DAOLoaiDichVu extends DAO{
    String sql;
    ResultSet rs;
    
    public DAOLoaiDichVu() {
        super();
    }
    
    public ArrayList<LoaiDichVu> layThongTinTatCaLoaiDichVu() throws SQLException {
        ArrayList<LoaiDichVu> arrLoaiDichVu = new ArrayList<>();
        sql = "layThongTinTatCaLoaiDichVu";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            LoaiDichVu loaiDichVu = new LoaiDichVu();
            Helper.setLoaiDichVu(loaiDichVu, rs);
            arrLoaiDichVu.add(loaiDichVu);
        }
        return arrLoaiDichVu;
    }
    
    public LoaiDichVu layThongTinLoaiDichVuTheoMa(int maLoaiDV) throws SQLException {
        LoaiDichVu loaiDichVu = new LoaiDichVu();
        sql = "layThongTinLoaiDichVuTheoMa (" + maLoaiDV + ")";
        rs = data.fetchData(sql);
        
        if (rs.next()) {
            Helper.setLoaiDichVu(loaiDichVu, rs);
        }
        return loaiDichVu;
    }
    
    public LoaiDichVu layThongTinLoaiDichVuTheoTen(String tenLoaiDV) throws SQLException {
        LoaiDichVu loaiDichVu = new LoaiDichVu();
        sql = "layThongTinLoaiDichVuTheoTen (N'" + tenLoaiDV + "')";
        rs = data.fetchData(sql);
        
        if (rs.next()) {
            Helper.setLoaiDichVu(loaiDichVu, rs);
        }
        return loaiDichVu;
    }
    
    public boolean themLoaiDichVu(String tenLoai) throws SQLException {
        sql = "themLoaiDichVu (N'" + tenLoai + "')";
        return data.Execute(sql);
    }
    
    public boolean capNhatLoaiDichVu(String maLoai, String tenLoai) throws SQLException {
        sql = "capNhatDichVu (" + maLoai + ", N'" + tenLoai + "')";
        return data.Execute(sql);
    }
    
    public boolean xoaLoaiDichVu(String maLoai) throws SQLException {
        sql = "xoaLoaiDichVu (" + maLoai + ")";
        return data.Execute(sql);
    }
}
