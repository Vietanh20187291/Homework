/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

/**
 *
 * @author Vanh
 */
public class CheckDuong {

    public static void main(String[] args) {
        int[] arr= {1,2,5,-1,-3,9,8,-4};
        int[] re = result(arr);
        for(int i = 0; i<re.length;i++){
        System.out.print( re[i]+" ");
        }
    }

    public static int[] result(int[] arr) {
        int j = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
