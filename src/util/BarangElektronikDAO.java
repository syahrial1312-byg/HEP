package util;

import model.BarangElektronik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BarangElektronikDAO {
    private static Connection con;
    private static PreparedStatement st;

    public void tambahBarang(BarangElektronik barangElektronik){
        try {
            con = BaseDAO.getCon();
            String query = "INSERT INTO barangelektronik values ('%s','%f','%f')";
            query = String.format(query,
                    barangElektronik.getNama(),
                    barangElektronik.getDaya(),
                    barangElektronik.getDurasi());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data berhasil ditambahkan");
        }catch (SQLException e) {
            System.err.println("Error saving the data:"+e.getMessage());
            System.exit(1);
        }
    }
    public  void updateBarang(BarangElektronik barangElektronik){
        try {
            con =BaseDAO.getCon();
            String query = "UPDATE barangelektronik SET namabarang = '%s', dayabarang = %f,durasibarang = %f WHERE namabarang = '%s';";
            query = String.format(query,
                    barangElektronik.getNama(),
                    barangElektronik.getDaya(),
                    barangElektronik.getDurasi(),
                    barangElektronik.getNama());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data Berasil di Update");
        }catch (SQLException e){
            System.err.println("Error updating the data:"+e.getMessage());
            System.exit(1);
        }
    }
    public void hapusBarang(BarangElektronik barangElektronik){
        try {
            con =BaseDAO.getCon();
            String query = "DELETE from barangelektronik Where namabarang = '%s'";
            query = String.format(query,
                    barangElektronik.getNama());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Barang Berhasil di hapus");
        }catch (SQLException e){
            System.err.println("Error updating the data:"+e.getMessage());
            System.exit(1);
        }
    }
    public void getBarang(BarangElektronik barangElektronik){
        try {
            con =BaseDAO.getCon();
            String query = "SELECT * from barangelektronik;";
            query = String.format(query);
            st = con.prepareStatement(query);
            st.executeQuery();
            System.out.println("Data Berasil di Update");
        }catch (SQLException e){
            System.err.println("Error updating the data:"+e.getMessage());
            System.exit(1);
        }
    }
}
