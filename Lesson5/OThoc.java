/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author Vanh
 */
public class OThoc {

    public static void main(String[] args) {
        int o = 15;
        int thoc = TinhThoc(o);
        System.out.println("Thoc :" + thoc);
    }

    public static int TinhThoc(int o) {
        if (o == 1) {
            return 1;
        }
        return (2 * TinhThoc(o - 1));

    }
}
