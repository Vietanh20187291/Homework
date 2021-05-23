/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author Vanh
 */
public class Them1s {

    public static void main(String[] args) {

        int gio = 21;
        int phut = 59;
        int giay = 59;
        while (giay == 59) {
            phut += 1;
            giay = 0;
        }
        while (phut > 59) {
            phut = 0;
            gio += 1;
        }
        while (gio > 23) {
            gio = 0;
        }
        System.out.println(gio + ":" + phut + ":" + giay);
    }
}
