/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismStatic;

/**
 *
 * @author Azzahra Putri
 */
public class polymorphismStatic {
  
    public static void main(String[] args) {
        // memanggil metode perimeter dengan satu argumen
        System.out.println(
                "Sisi Persegi adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");
        // memanggil metode perimeter dengan dua argumen
        System.out.println(
                "Sisi Persegi Panjang adalah : 10,13 \nKeliling Persegi Panjang adalah : "
                        + CompileTime.keliling(10, 13));
    }
} 

