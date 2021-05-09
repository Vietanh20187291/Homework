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
public class DemSoChiaHet3 {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu can xet:");
        int num = sc.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            System.out.print("So thu " + (i + 1) + " : ");
            list[i] = sc.nextInt();
            //lay phan tu nhap vao
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 3 == 0) {
                result++;
            }
        }
        System.out.println("So chu so chia het cho 3 la : " + result);
    }
}
