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
public class Inrasolanlaplaikitu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap xau ki tu: ");
        String a = sc.next();
        int num = a.length();
        char[] arr = new char[a.length()];
        for (int i = 0; i < num; i++) {
            arr[i] = a.charAt(i);
        }
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("" + arr[i] + ": " + count);
        }
    }

}
