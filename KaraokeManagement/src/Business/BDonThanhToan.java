/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DatabaseConnection.DataProcess;
import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DonThanhToan;

/**
 *
 * @author Thoai
 */
public class BDonThanhToan {
    DataProcess data;
    Helper helper = new Helper();
    public BDonThanhToan() {
        
    }
    public ArrayList<DonThanhToan> layTatCaDonThanhToan() throws SQLException {
        ArrayList<DonThanhToan> arrDonThanhToan = new ArrayList();
        String sql = "";
        ResultSet rs = data.fetchData(sql);
        
        DonThanhToan donThanhToan = new DonThanhToan();
        while (rs.next()) {
            helper.setDonThanhToan(donThanhToan, rs);
            arrDonThanhToan.add(donThanhToan);
        }
        return arrDonThanhToan;
    }
    
    public DonThanhToan layDonThanhToanTheoID(int id) throws SQLException {
        DonThanhToan donThanhToan = new DonThanhToan();
        String sql = "";
        ResultSet rs = data.fetchData(sql);
        helper.setDonThanhToan(donThanhToan, rs);
        return donThanhToan;
    }
    
    public boolean themDonThanhToan(int maDon, int maNV, int maKH, int maPhong, int giaPhong, String thoiGianBD, String thoiGianKT, String maKM, boolean tinhTrang) throws SQLException{
        String sql = "";
        return data.Execute(sql);
    }
    
    public boolean capNhatDonThanhToan(int maDon, int maNV, int maKH, int maPhong, int giaPhong, String thoiGianBD, String thoiGianKT, String maKM, boolean tinhTrang) throws SQLException {
        String sql = "";
        return data.Execute(sql);
    }
    
    public boolean xoaDonThanhToan(int maDon) throws SQLException{
        String sql = "";
        return data.Execute(sql);
    }
}
