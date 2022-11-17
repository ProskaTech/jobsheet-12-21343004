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
class CompileTime {
    // method keliling dengan single argumen
    static int keliling(int a) {
        return 4 * a;
    }

    // method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b) {
        return 2 * (l + b);
    }
}
