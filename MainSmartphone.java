/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO;

import UAS_PBO.InterfacePajak;

/**
 *
 * 
 * @author Arvilanti Devani 22104410075
 * @author Nur Cindy Intan Fanderella 22104410098
 * @author Hanik Hatul Halimah 22104410101
 * @author Eka Fardinal Hergitarestu 22104410119
 * @author Wasi'atul Jannah 22104410121
 */
public class MainSmartphone implements InterfacePajak {
    private String vendor, tipe;
    private double harga;

    // Constructor dengan tiga parameter (vendor, tipe, harga)
    public MainSmartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Implementasikan method hitungHargaSetelahPPN() dari interface Pajakable
    @Override
    public double hitungHargaSetelahPPN() {
        double ppn = 0;
        if (harga > 4000000 && harga < 4200000) {
            ppn = 0.01; // PPN 1% jika harga > Rp 4.000.000,00 sampai Rp 4.200.000,00
        } else if (harga > 4200000 && harga <= 4500000) {
            ppn = 0.05; // PPN 2% jika harga > Rp 4.200.000,00 sampai Rp 4.500.000,00
        } else if (harga > 4500000) {
            ppn = 0.05; // PPN 5% jika harga > Rp 4.500.000,00
        }
        return harga + (harga * ppn);
    }

    // Method untuk menampilkan informasi smartphone
    public void ListSmartphone() {
        System.out.println("Vendor: " + vendor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga: Rp" + String.format("%.2f", harga));
        System.out.println("Harga Setelah Ditambah PPN: Rp" + String.format("%.2f", hitungHargaSetelahPPN()));
    }
    public static void main(String[] args) {
        // Membuat objek smartphone dengan parameter (vendor, tipe, harga)
        MainSmartphone samsungA51 = new MainSmartphone("Samsung", "A 51", 5000000.00);
        MainSmartphone oppoReno5 = new MainSmartphone("Oppo", "Reno 5", 4400000.00);
        MainSmartphone xiaomiA1 = new MainSmartphone("Xiaomi", "A1", 4100000.00);

        // Menampilkan informasi smartphone
        samsungA51.ListSmartphone();
        oppoReno5.ListSmartphone();
        xiaomiA1.ListSmartphone();
    }
}