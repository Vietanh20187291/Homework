/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1plus;

import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class Gop2Mang {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang A : ");
            a = sc.nextInt();
        } while (a < 0);
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arrA[i] = sc.nextInt();
        }

        do {
            System.out.print("Nhap so phan tu mang B: ");
            b = sc.nextInt();
        } while (b < 0);
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arrB[i] = sc.nextInt();
        }

        int[] arrC = new int[a + b];
        for (int i = 0; i < a; i++) {
            arrC[i] = arrA[i];
        }
        for (int i = a; i < a+b; i++) {
            arrC[i] = arrB[i-a];
        }
        System.out.print("Mang C la : ");
                for (int i = 0; i < a+b; i++) {
            System.out.print(arrC[i] + " ");
        }
    }
}
