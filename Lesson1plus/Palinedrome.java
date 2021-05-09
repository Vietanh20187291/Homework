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
public class Palinedrome {

    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao xau ki tu : ");
        String a = sc.next();
        int l = a.length();
        char[] arr = new char[l];
        for (int i = 0; i < l; i++) {
            arr[i] = a.charAt(i);
            if (l % 2 == 0) {
                for (int j = 0; j < l / 2; j++) {
                    if (arr[i] == arr[l - j]) {
                    } else {
                        check = false;
                    }
                }
            }

            if (l % 2 == 1) {
                for (int j = 0; j < l / 2 - 1; j++) {
                    if (arr[i] == arr[l - j]) {
                    } else {
                        check = false;
                    }
                }

            }
        }
        if (check == false) {
            System.out.println("Day khong la chuoi Palinedrome");
        }
        if (check == true) {
            System.out.println("Day la chuoi Palinedrome");
        }
    }
}
