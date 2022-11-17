/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismDynamic;

/**
 *
 * @author Azzahra Putri
 */
class BNI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 10.6f;
    }
}

class Mandiri extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 9.4f;
    }
}
