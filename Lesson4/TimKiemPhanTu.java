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
public class TimKiemPhanTu {

    // * Bài 3: Viết hàm tìm kiếm 1 số nguyên trong một mảng, in ra -1 
    //nếu không tìm thấy. tìm thấy thì in ra chỉ số của phần tử đó.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim: ");
        int num = sc.nextInt();
        int res = check(num);
        System.out.println(res);
    }

    public static int check(int num) {
        int check = -1;
        int[] arr = {9, 44, 85, 28, 7, 5, 0, 1, 2, 22};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                check = i + 1;
            }
        }
        return check;
    }
}
