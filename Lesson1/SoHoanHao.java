/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

/**
 *
 * @author Vanh
 */
public class SoHoanHao {

    public static void main(String[] args) {
        int k = 0;
        System.out.print("Cac so hoan hao: ");
        for (int i = 1; i < 1000000000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    k += j;
                }

            }
            if (i == k) {
                System.out.print(k +" ");
                k = 0;
            } else {
                k = 0;
            }

        }

    }

}
