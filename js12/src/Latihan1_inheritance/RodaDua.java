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
class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20; // 0.2 kali

    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp. " + hargaDasar);
    }

    
}
