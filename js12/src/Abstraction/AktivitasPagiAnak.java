/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author AzzahraPutri
 */
class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari() {
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
