/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class TinhSoLanXuatHien {
  // Bài 5: Viết hàm in ra số lần xuất hiện của 1 phần tử trong một mảng.
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim: ");
        int num = sc.nextInt();
        int res = check(num);
        System.out.println("So lan xuat hien : "+res);
    }

    public static int check(int num) {
        int check = 0;
        int[] arr = {9, 44, 85, 28, 7, 5, 0, 1, 2, 22};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                check++;
            }
        }
        return check;
    
    }
}
