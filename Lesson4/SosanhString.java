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
public class SosanhString {

    public static void main(String[] args) {
        String[] arr = {"a", "abcd", "zxyk", "d", "f", "y", "a"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int kc = arr[i].compareTo(arr[j]);
                if (kc < 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Ket qua : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
