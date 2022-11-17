/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1_inheritance;

/**
 *
 * @author Azzahra Putri
 */
public class JavaInheritance {
    public static void main(String[] args) {
        // Membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        // Membuat objek kendaraan roda empat
        RodaEmpat Mobil = new RodaEmpat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        Mobil.tampilkanHarga();
        Mobil.hargaAkhir();
        
    }

}
