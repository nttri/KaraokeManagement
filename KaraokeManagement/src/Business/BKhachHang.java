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
import model.ThanhVien;

/**
 *
 * @author Thoai
 */
public class BKhachHang {
    DataProcess data;
    Helper helper;
    
    public ArrayList<ThanhVien> layTatCaThanhVien() throws SQLException {
        ArrayList<ThanhVien> arrThanhVien = new ArrayList();
        String sql = "layTatCaThanhVien";
        ResultSet rs = data.fetchData(sql);
        
        ThanhVien thanhVien = new ThanhVien();
        while (rs.next()) {
            helper.setThanhVien(thanhVien, rs);
            arrThanhVien.add(thanhVien);
        }
        return arrThanhVien;
    }
    
    public ThanhVien layThanhVienTheoMa(int maThanhVien) throws SQLException {
        ThanhVien thanhVien = new ThanhVien();
        String sql = "layThanhVienTheoMa " + maThanhVien;
        ResultSet rs = data.fetchData(sql);
        helper.setThanhVien(thanhVien, rs);
        return thanhVien;
    }
    
    public boolean themThanhVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        String sql = "themThanhVien " + hoTen + ", " + gioiTinh + ", " + ngaySinh + ", " + diaChi + ", " + cmnd + ", " + sdt;
        return data.Execute(sql);
    }
    
    public boolean capNhatThanhVien(int ma, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        String sql = "capNhatThanhVien " + ma + ", "+ hoTen + ", " + gioiTinh + ", " + ngaySinh + ", " + diaChi + ", " + cmnd + ", " + sdt;
        return data.Execute(sql);
    }
    
    public boolean xoaThanhVien(int ma) {
        String sql = "xoaThanhVien " + ma;
        return data.Execute(sql);
    }
}
