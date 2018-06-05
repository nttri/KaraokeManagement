/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import common.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author Thoai
 */
public class BNhanVien extends Business{
    String sql;
    ResultSet rs;
    
    public BNhanVien(){
        super();
    }
    
    public ArrayList<NhanVien> layThongTinTatCaNhanVien() throws SQLException {
        ArrayList<NhanVien> arrNhanVien = new ArrayList();
        sql = "layThongTinTatCaNhanVien";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            NhanVien nhanVien = new NhanVien();
            Helper.setNhanVien(nhanVien, rs);
            arrNhanVien.add(nhanVien);
        }
        return arrNhanVien;
    }

    public NhanVien layThongTinNhanVienTheoMaNV(int maNV) throws SQLException {
        sql = "layThongTinNhanVienTheoMaNV (" + maNV + ")";
        NhanVien nhanVien = new NhanVien();
        rs = data.fetchData(sql);
        if (rs.next()){        
            Helper.setNhanVien(nhanVien, rs);
        }
        return nhanVien;
    }
    
    public NhanVien layThongTinNhanVienTheoMaNV_TaiKhoan(int maNV) throws SQLException{
        sql = "layThongTinNhanVienTheoMaNV_TaiKhoan (" + maNV + ")";
        NhanVien nhanVien = new NhanVien();
        rs = data.fetchData(sql);
        if (rs.next()){        
            Helper.setNhanVien_TaiKhoan(nhanVien, rs);
        }
        return nhanVien;
    }
    
    public ArrayList<NhanVien> layThongTinNhanVienTheoTen(String hoTen) throws SQLException {
        ArrayList<NhanVien> arrNhanVien = new ArrayList();
        sql = "layThongTinNhanVienTheoTen (N'" + hoTen + "')";
        rs = data.fetchData(sql);
        
        while(rs.next()) {
            NhanVien nhanVien = new NhanVien();
            Helper.setNhanVien(nhanVien, rs);
            arrNhanVien.add(nhanVien);
        }
        return arrNhanVien;
    }
    
    public boolean themNhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt, int luong, String tenDangNhap, String matKhau) throws SQLException {
        sql = "themNhanVien (N'" + hoTen + "', N'" + gioiTinh + "', '" + ngaySinh + "', N'" + diaChi + "', '" + cmnd + "', '" + sdt + "', " + luong + ", '" + tenDangNhap + "', '" + matKhau + "')";
        return data.Execute(sql);
    }
    
    public boolean capNhatNhanVien(int maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt, int luong) throws SQLException {
        sql = "capNhatNhanVien (" + maNV + ", N'" + hoTen + "', N'" + gioiTinh + "', '" + ngaySinh + "', N'" + diaChi + "', '" + cmnd + "', '" + sdt + "', " + luong + ")";
        return data.Execute(sql);
    }
    
    public boolean xoaNhanVien(int maNV) throws SQLException {
        sql = "xoaNhanVien (" + maNV + ")";
        return data.Execute(sql);
    }
}
