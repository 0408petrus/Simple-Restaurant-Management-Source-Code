import java.util.Scanner;
public class Checkout {
    static float totalOmset = Appetizer.harga;
    static float totalBiayaProduksi = 0.25f * Appetizer.harga;
    static float gajiKaryawan = 0.5f * totalBiayaProduksi;
    static float pajak = 0.1f * totalOmset;
    static float totalKeuntungan = (totalOmset - totalBiayaProduksi) - pajak;
public Checkout(){
    System.out.println("Total Omset Penjualan: " + totalOmset);
    System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
    System.out.println("Biaya Produksi: " + totalBiayaProduksi);
    System.out.println("Biaya Pajak: " + pajak);
    System.out.println("Hasil Laba/Keuntungan Bersih : (totalOmset - BiayaProduksi) -  Pajak = " + totalKeuntungan);
    Main.Menu();
}
}
