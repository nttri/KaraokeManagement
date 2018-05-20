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
import model.NhanVien;

/**
 *
 * @author Thoai
 */
public class BNhanVien extends Business{

    public BNhanVien(){
        super();
    }

    public NhanVien layThongTinNhanVien(int maNV) throws SQLException {
        String sql = "layThongTinNhanVien " + maNV;
        NhanVien nhanVien = new NhanVien();
        ResultSet rs = data.fetchData(sql);
        if (rs.next()){        
            Helper.setNhanVien(nhanVien, rs);
        }
        return nhanVien;
    }
}
