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
public class GopKiTuVaChuSo {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang A : ");
            a = sc.nextInt();
        } while (a < 0);
        char[] arrA = new char[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap ki tu thu " + (i + 1) + " : ");
            arrA[i] = sc.next().charAt(0);
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
        for(int i = 0;i<a;i++){
        for(int j = 0; j<b;j++){
            System.out.println(arrA[i] +","+arrB[j]);
        }
        }
    }
}
