/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author Vanh
 */
public class TinhGiaiThua {

    public static void main(String[] args) {
        tinh(5, 1, 1);

    }

    public static void tinh(int n, int result, int index) {

        if (index > n) {
            System.out.println(result);
            return;
        }
        result = result * index;
        index++;
        tinh(n, result, index);
    }
}
