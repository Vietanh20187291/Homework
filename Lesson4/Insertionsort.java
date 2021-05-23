/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import static java.lang.Double.max;

/**
 *
 * @author Vanh
 */
public class Insertionsort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 8, 7, 4, 0, 1, 2, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >arr[i]) {
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
        System.out.print("Day so duoc sap xep : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
