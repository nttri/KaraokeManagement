/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOLoaiDichVu;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoaiDichVu;

/**
 *
 * @author Thoai
 */
public class BLoaiDichVu extends Business {

    String sql;
    ResultSet rs;
    DAOLoaiDichVu DLoaiDichVu = new DAOLoaiDichVu();

    public BLoaiDichVu() {
        super();
    }

    public ArrayList<LoaiDichVu> layThongTinTatCaLoaiDichVu() throws SQLException {
        return DLoaiDichVu.layThongTinTatCaLoaiDichVu();
    }

    public LoaiDichVu layThongTinLoaiDichVuTheoMa(int maLoaiDV) throws SQLException {
        return DLoaiDichVu.layThongTinLoaiDichVuTheoMa(maLoaiDV);
    }

    public LoaiDichVu layThongTinLoaiDichVuTheoTen(String tenLoaiDV) throws SQLException {
        return DLoaiDichVu.layThongTinLoaiDichVuTheoTen(tenLoaiDV);
    }

    public boolean themLoaiDichVu(String tenLoai) throws SQLException {
        BLoaiDichVu bLoaiDV = new BLoaiDichVu();
        LoaiDichVu loaiDV = new LoaiDichVu();
        try {
            loaiDV = bLoaiDV.layThongTinLoaiDichVuTheoTen(tenLoai);
        } catch (SQLException ex) {
            Logger.getLogger(BLoaiDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (loaiDV.getMaLoaiDichVu() > 300) {   // đã tồn tại
            return false;
        }
        return DLoaiDichVu.themLoaiDichVu(tenLoai);
    }

    public boolean capNhatLoaiDichVu(String maLoai, String tenLoai) throws SQLException {
        return DLoaiDichVu.capNhatLoaiDichVu(maLoai, tenLoai);
    }

    public boolean xoaLoaiDichVu(String maLoai) throws SQLException {
        return DLoaiDichVu.xoaLoaiDichVu(maLoai);
    }
}
