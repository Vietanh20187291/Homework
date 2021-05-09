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
public class KiTuGiongCanhNhau {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap xau ki tu: ");
        String a = sc.next();
        int num = a.length();
        char[] arr = new char[a.length()];
        for (int i = 0; i < num; i++) {
            arr[i] = a.charAt(i);
        }  
        for (int i = 0; i < num; i++) {
            if( arr[i].toString().equals(arr[i+1].toString())){
                System.out.println(arr[i]);
                check = false;
            }
            
        }
        if(check = true){
         for (int i = 0; i < num; i++) {
            System.out.print(arr[i]);
        }       
        }
        }        


    }
    
