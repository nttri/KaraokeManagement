/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAONhanVien;
import common.Helper;
import common.MyStrings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import DTO.NhanVien;

/**
 *
 * @author Thoai
 */
public class BNhanVien extends Business {

    String sql;
    ResultSet rs;
    DAONhanVien DNhanVien = new DAONhanVien();

    public BNhanVien() {
        super();
    }

    public ArrayList<NhanVien> layThongTinTatCaNhanVien() throws SQLException {
        return DNhanVien.layThongTinTatCaNhanVien();
    }

    public NhanVien layThongTinNhanVienTheoMaNV(int maNV) throws SQLException {
        return DNhanVien.layThongTinNhanVienTheoMaNV(maNV);
    }

    public NhanVien layThongTinNhanVienTheoMaNV_TaiKhoan(int maNV) throws SQLException {
        return DNhanVien.layThongTinNhanVienTheoMaNV_TaiKhoan(maNV);
    }

    public ArrayList<NhanVien> layThongTinNhanVienTheoTen(String hoTen) throws SQLException {
        return DNhanVien.layThongTinNhanVienTheoTen(hoTen);
    }

    Boolean isOldEnough(String input) {
        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(_today);
        int _namHienTai = cal.get(Calendar.YEAR);

        Date _ngaySinh = new Date();
        try {
            _ngaySinh = sdf.parse(input);
        } catch (ParseException ex) {
            //
        }
        cal.setTime(_ngaySinh);
        int _namSinh = cal.get(Calendar.YEAR);

        if (_namHienTai - _namSinh < 18) {
            return false;
        }
        return true;
    }

    public boolean themNhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt, int luong, String tenDangNhap, String matKhau) throws SQLException {
        if (cmnd.length() != 9 && cmnd.length() != 12) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_CMND);
            return false;
        }
        if (sdt.length() < 10) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (sdt.length() == 10 && !sdt.startsWith("09")) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (sdt.length() == 11 && !sdt.startsWith("01")) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (!isOldEnough(ngaySinh)) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Birthday);
            return false;
        }
        if(luong < 100000){
            JOptionPane.showMessageDialog(null, MyStrings.Salary_Must_Higher);
            return false;
        }
        return DNhanVien.themNhanVien(hoTen, gioiTinh, ngaySinh, diaChi, cmnd, sdt, luong, tenDangNhap, matKhau);
    }

    public boolean capNhatNhanVien(int maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt, int luong) throws SQLException {
        if (cmnd.length() != 9 && cmnd.length() != 12) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_CMND);
            return false;
        }
        if (sdt.length() < 10) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (sdt.length() == 10 && !sdt.startsWith("09")) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (sdt.length() == 11 && !sdt.startsWith("01")) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Phone);
            return false;
        }
        if (!isOldEnough(ngaySinh)) {
            JOptionPane.showMessageDialog(null, MyStrings.Invalid_Birthday);
            return false;
        }
        if(luong < 100000){
            JOptionPane.showMessageDialog(null, MyStrings.Salary_Must_Higher);
            return false;
        }
        return DNhanVien.capNhatNhanVien(maNV, hoTen, gioiTinh, ngaySinh, diaChi, cmnd, sdt, luong);
    }

    public boolean xoaNhanVien(int maNV) throws SQLException {
        return DNhanVien.xoaNhanVien(maNV);
    }
}
