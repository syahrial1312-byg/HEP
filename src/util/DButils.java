package util;

import model.User;

public class DButils {
    public static void main(String[] args) {
        User u1 = new User(1,"anita", "1234",900 , 36);
        User u2 = new User(2,"Syahrial", "1a2b",900 , 60);

        UserDAO dao = new UserDAO();

        //dao.saveUser(u1);
        //dao.saveUser(u2);
        dao.deleteUser(u1);
    }
}
