package util;

import model.User;
import java.sql.SQLException;
import java.sql.*;

public class UserDAO {
    private static Connection con;
    private static PreparedStatement st;
    public void saveUser(User user){
        try {
            con = BaseDAO.getCon();

            String query = "INSERT INTO user values ('%d','%s','%s','%d','%f')";
            query = String.format(query,
                    user.getId(),
                    user.getNama(),
                    user.getPassword(),
                    user.getDayaMeteran(),
                    user.getLuasTanahBangunan());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data berhasil ditambahkan");
        }catch (SQLException ex){
            System.err.print("Error saving the data:"+ex.getMessage());
            System.exit(1);
        }
    }

    public void deleteUser(User user){
        try {
            con = BaseDAO.getCon();

            String query = "DELETE FROM user Where iduser = %d";
            query=String.format(query,user.getId());
            st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Data telah dihapus");
        } catch (SQLException ex) {
            System.err.print("Error saving the data:"+ex.getMessage());
            System.exit(1);
        }
    }
}
