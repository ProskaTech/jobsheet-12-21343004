/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author Azzahra Putri
 */
class manusia {
    public static void main(String[] args) {
        // object induk tidak bisa di buat disini

        // buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();

        // panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}

