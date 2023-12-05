package util;

import model.Admin;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDAO {
    private static Connection con;
    private static PreparedStatement st;
    public void saveAdmin(Admin admin){
        try {
            con = BaseDAO.getCon();

            String query = "INSERT INTO user values ('%d','%s','%s','%d','%f')";
            query = String.format(query);

            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data berhasil ditambahkan");
        }catch (SQLException ex){
            System.err.print("Error saving the data:"+ex.getMessage());
            System.exit(1);
        }
    }

    public void deleteAdmin(User user){
        try {
            con = BaseDAO.getCon();

            String query = "DELETE FROM users Where id_user = %d";
            query=String.format(query,user.getIdPerson());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data telah dihapus");
        } catch (SQLException ex) {
            System.err.print("Error saving the data:"+ex.getMessage());
            System.exit(1);
        }
    }

    public void menambahkanArtikelEdukasi(Admin admin){
        try{
            con=BaseDAO.getCon();

            String query = "INSERT INTO admin(idadmin,username,password,edukasi_artikel) values (%d,'%s','%s','%s')";
            query=String.format(query,admin.getEdukasiArtikel());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Edukasi Telah Ditambahkan");
        }catch (SQLException ex){
            System.err.println("Error saving the data:"+ex.getMessage());
            System.exit(1);
        }
    }
    public void updateArtikelEdukasi(Admin admin){
        try{
            con = BaseDAO.getCon();

            String query = "";
            query = String.format(query,
                    admin.getIdPerson(),admin.getEdukasiArtikel());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Edukasi Telah di Update");
        }catch (SQLException ex){
            System.err.println("Error Update the data :"+ex.getMessage());
            System.exit(1);
        }
    }
}
