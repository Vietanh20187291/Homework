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
public class IndexCua0 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 9, 8, 0, 2, 1, 3, 0, 5, 1, 0, 2};
        int[] index = index(arr);
        System.out.println(index[0]);
        System.out.println(index[1]);

    }

    public static int[] index(int[] arr) {
        int first = 0, last=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==0){
                first = i;
                break;
            }
        }
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] ==0){
            last = i;
            break;
            }
        }
        int[] result = {first,last};
        return result;
        }
    }
