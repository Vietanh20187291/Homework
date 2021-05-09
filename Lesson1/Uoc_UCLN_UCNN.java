/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class Uoc_UCLN_UCNN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So thu 1: ");
        int st1 = sc.nextInt();
        System.out.print("So thu 2: ");
        int st2 = sc.nextInt();
        int[] list = null;
        int i, k = 0;
        int Min = st1;

        if (st1 > st2) {
            Min = st2;
        }
        System.out.print("Cac uoc chung cua 2 so la: ");
        for (int j = 1; j <= Min; j++) {
            if (st1 % j == 0 && st2 % j == 0) {
                System.out.print(j+ " ");
            }
        }

        int uocMax = 1;
        for (int j = 1; j <= Min; j++) {
            if (st1 % j == 0 && st2 % j == 0 && j > uocMax) {
                uocMax = j;
            }
        }
        int uocMin = uocMax;
        for (int j = 1; j <= Min; j++) {
            if (st1 % j == 0 && st2 % j == 0 && j < uocMin) {
                uocMin = j;
            }
        }
        System.out.println("");
        System.out.println("Uoc chung be nhat la: " + uocMin);
        System.out.println("Uoc chung lon nhat la:" + uocMax);

    }
}

