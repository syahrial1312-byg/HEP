package model;

public class Admin extends Person {
    private String edukasiArtikel;

    public Admin (String username,String password,String edukasiArtikel){
        super(username, password);
        this.setEdukasiArtikel(edukasiArtikel);
    }
    public String getEdukasiArtikel() {
        return edukasiArtikel;
    }

    public void setEdukasiArtikel(String edukasiArtikel) {
        this.edukasiArtikel = edukasiArtikel;
    }
}
