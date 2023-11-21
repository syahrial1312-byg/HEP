package model;

public class BarangElektronik {
    private String nama;
    private float daya;
    private float durasi;
    private float kWh;
    private float biaya;
    private User pengguna;

    public BarangElektronik(String nama, float daya, float durasi, User pengguna) {
        this.nama = nama;
        this.daya = daya;
        this.durasi = durasi;
        this.setKwhBarang(daya, durasi); 
        this.pengguna = pengguna;
    }
    
    public void setKwhBarang(float daya, float durasi){
        kWh = ((daya * durasi) / 1000)*30;
    }
    
    public void setBiaya(){
        biaya = this.getKwHPerBarang() * this.pengguna.getTarifDayaPerKwh();
    }

    public void setPengguna(User pengguna) {
        this.pengguna = pengguna;
    }

    public float getBiaya() {
        return biaya;
    }
    
    public String getNama() {
        return nama;
    }

    public float getDaya() {
        return daya;
    }

    public float getDurasi() {
        return durasi;
    }
    
    public float getKwHPerBarang() {
        return kWh;
    }
    
    
//    public String toString(){
//        return "\nNama Barang\t\t: " + this.nama + "\n" +
//                "Daya Barang\t\t: " + this.daya + " Watt\n" +
//                "Lama Pemakaian\t\t: " + this.durasi  + " Jam\n" +
//                "kwh Barang\t\t: " + this.KwHPerBarang + " KwH";
//    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void setDurasi(float durasi) {
        this.durasi = durasi;
    }
   
}
