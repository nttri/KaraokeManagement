/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.DAOKhachHang;
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
import model.KhachHang;

/**
 *
 * @author Thoai
 */
public class BKhachHang extends Business {

    String sql;
    ResultSet rs;
    DAOKhachHang DKhachHang = new DAOKhachHang();

    public BKhachHang() {
        super();
    }

    public ArrayList<KhachHang> layTatCaKhachHang() throws SQLException {
        return DKhachHang.layTatCaKhachHang();
    }

    public KhachHang layKhachHangTheoMa(int maKH) throws SQLException {
        return DKhachHang.layKhachHangTheoMa(maKH);
    }

    Boolean isOldEnough(String input) {
        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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

        if (_namHienTai - _namSinh < 16) {
            return false;
        }
        return true;
    }

    public boolean themKhachHang(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        if (cmnd.length() != 9) {
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
        return DKhachHang.themKhachHang(hoTen, gioiTinh, ngaySinh, diaChi, cmnd, sdt);
    }

    public boolean capNhatKhachHang(int ma, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String cmnd, String sdt) throws SQLException {
        if (cmnd.length() != 9) {
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
        return DKhachHang.capNhatKhachHang(ma, hoTen, gioiTinh, ngaySinh, diaChi, cmnd, sdt);
    }

    public boolean xoaKhachHang(int ma) throws SQLException {
        return DKhachHang.xoaKhachHang(ma);
    }
}
