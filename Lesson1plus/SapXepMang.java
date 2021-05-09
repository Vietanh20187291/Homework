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
public class SapXepMang {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang : ");
            a = sc.nextInt();
        } while (a < 0);
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i] < arr[j]) {
                    int b = arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;
                }
            }

        }
        System.out.print("Day so sap xep giam dan : ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.print("Day so sap xep tang dan : ");
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
