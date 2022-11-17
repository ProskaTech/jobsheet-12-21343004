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
class Bank {
    float sukuBunga() {
        return 0;
    }
}

class BRI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 5.5f;
    }
}