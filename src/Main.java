import model.BarangElektronik;
import model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean login = false;
        String kembali;

        User u1 = new User(1,"anita", "1234",900 , 36);

        
        while (true) {
            if (!login) {
                System.out.println("\n================================= Tampilan Login ================================");
                System.out.println("\n\t\t\t\t 1. Login");
                System.out.println("\t\t\t\t 2. Register");
                System.out.print("\n\t\t\t\tPilih : ");
                int pilihanLogin  = scanner.nextInt();
                scanner.nextLine();

                switch (pilihanLogin) {
                    case 1:
                        System.out.println("\n=================================== Login akun ================================== \n");
                        System.out.print("\t\t\tUsername\t: ");
                        String username = scanner.nextLine();
                        System.out.print("\t\t\tPassword\t: ");
                        String password = scanner.nextLine();
                        
                        login =u1.login(username, password);
                        break;
                        
                    case 2:
                        System.out.println("\t\t\tMaaf Fitur Belum Terdesia :(");
                        break;
                        
                    default:
                        System.out.println("\t\t\tPilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }

            while (login) {
                System.out.println("\n================================= SELAMAT DATANG ================================");
                System.out.println("================================= Energy Planner ================================");
                System.out.println("\nSilahkan Pilih Menu");
                System.out.println("1. Tampilkan Data model.User");
                System.out.println("2. Tampilkan Data Barang Elektronik");
                System.out.println("3. Input Barang Elektronik");
                System.out.println("4. Delete Barang Elektronik");
                System.out.println("5. Update Barang Elektronik");
                System.out.println("6. Kalkulator Barang Elektronik");
                System.out.println("7. Analisis Keseluruhan");
                System.out.println("8. Logout");
                System.out.println("Pilih : ");
                int pilihMenu = scanner.nextInt();
                scanner.nextLine();

                switch (pilihMenu) {
                    case 1:
                        u1.tampilanDataUser();
                        break;
                        
                    case 2:
                        u1.tampilanBarang();
                        break;
                        
                    case 3:
                        System.out.print("Masukkan jumlah barang elektronik: ");
                        int jumlahBarang = scanner.nextInt();
                        scanner.nextLine(); 

                        for (int i = 0; i < jumlahBarang; i++) {
                            System.out.println("\nMasukkan informasi barang elektronik ke-" + (i + 1) + ":");
                            System.out.print("Nama Barang: ");
                            String namaBarang = scanner.nextLine();
                            System.out.print("Daya Barang (dalam watt): ");
                            int dayaBarang = scanner.nextInt();
                            System.out.print("Lama Pemakaian (dalam jam): ");
                            float durasiPemakaian = scanner.nextFloat();
                            scanner.nextLine(); 

                            BarangElektronik barang = new BarangElektronik(namaBarang, dayaBarang, durasiPemakaian, u1);

                            u1.tambahBarang(barang);
                            
//                            barang.setPengguna(u1);
                        }
                        break;
                            
                    case 4:
                        System.out.println("Barang elektronik indeks ke-berapa yang mau di hapus? ");
                        int hapus = scanner.nextInt();
                        u1.deleteBarang(hapus);
                        break;
                        
                    case 5:
                        System.out.println("Barang elektronik indeks ke-berapa yang mau di update? ");
                        int update = scanner.nextInt();
                        System.out.println("Update nama\t: ");
                        String updateNama = scanner.next();
                        System.out.println("Update daya\t: ");
                        int updateDaya = scanner.nextInt();
                        System.out.println("Update durasi\t: ");
                        float updateDurasi = scanner.nextFloat();
                        u1.updateBarang(update, updateNama, updateDaya, updateDurasi);
                        break;
                        
                    case 6:
                        u1.kalkulatorEnergy();
                        break;
                        
                    case 7:
                        u1.analisisKeseluruhan();
                        break;
                        
                    case 8:
                        System.out.println("Anda telah logout.");
                        login = false; 
                        break;
                }
            }
        }
    }
}