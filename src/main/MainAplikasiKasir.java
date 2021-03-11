package main;
import classes.*;

import java.util.Scanner;

public class MainAplikasiKasir {

    public DaftarMenu daftarMenu;
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String noTransaksi, namaPemesan, tanggal, noMeja = "";
        String transaksiLagi = "", pesanLagi = "", keterangan = "", makanDitempat;
        int jumlahPesanan, noMenu;

        MainAplikasiKasir application = new MainAplikasiKasir();
        application.generateDaftarMenu();

//        Mulai Transaksi
        System.out.println("============ TRANSAKSI ============");

//        Ambil data Transaksi
        System.out.print("No Transaksi : ");
        noTransaksi = input.next();

        System.out.print("Pemesan : ");
        namaPemesan = input.next();

        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();

        System.out.print("Makan ditempat? [Y/N]");
        makanDitempat = input.next();
        if(makanDitempat.equalsIgnoreCase("Y")){
            System.out.print("Nomor Meja : ");
            noMeja = input.next();
        }
    }

    public void generateDaftarMenu(){
        daftarMenu = new DaftarMenu();

//        Membuat Menu Ramen
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));

//        Membuat Menu Kuah
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));

//        Membuat Menu Toping
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));

//        Membuat Menu Minuman
        daftarMenu.tambahMenu(new Minuman("Jus Aplukat SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Cappucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));

        daftarMenu.tampilDaftarMenu();
    }



}
