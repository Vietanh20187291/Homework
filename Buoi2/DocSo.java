/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class DocSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int x = sc.nextInt();
        String r =DocSo(x);
        System.out.println(r);
        
    }

    

    public static String DocSo(int a) {
        String ten = "" ;
        int st2 = a % 10;
        int st1 = (a - st2)/10;
        if (a < 10) {
            switch (a) {
           
                case 1:
                    ten = "Mot";
                    break;
                case 2:
                    ten = "Hai";
                    break;
                case 3:
                    ten = "Ba"; 
                    break;
                case 4:
                    ten = "Bon";
                    break;
                case 5:
                    ten = "Nam";
                    break;
                case 6:
                    ten = "Sau";
                    break;
                case 7:
                    ten = "Bay";
                    break;
                case 8:
                    ten = "Tam";
                    break;
                case 9:
                    ten = "Chin";
                    break;

            }
        }
        else {
            switch (st1) {
                case 1:
                    ten = "Muoi";
                    break;
                case 2:
                    ten = "Hai";
                    break;
                case 3:
                    ten = "Ba";
                    break;
                case 4:
                    ten = "Bon";
                    break;
                case 5:
                    ten = "Nam";
                    break;
                case 6:
                    ten = "Sau";
                    break;
                case 7:
                    ten = "Bay";
                    break;
                case 8:
                    ten = "Tam";
                    break;
                case 9:
                    ten = "Chin";
                    break;
            }
            switch (st2) {
                case 0:
                    ten = ten + "Muoi";
                    break;
                case 1:
                    ten = ten + " Muoi Mot";
                    break;
                case 2:
                    ten = ten + " Muoi Hai";
                    break;
                case 3:
                    ten = ten + " Muoi Ba";
                    break;
                case 4:
                    ten = ten + " Muoi Bon";
                    break;
                case 5:
                    ten = ten + " Muoi Nam";
                    break;
                case 6:
                    ten = ten + " Muoi Sau";
                    break;
                case 7:
                    ten = ten + " Muoi Bay";
                    break;
                case 8:
                    ten = ten + " Muoi Tam";
                    break;
                case 9:
                    ten = ten + " Muoi Chin";
                    break;
            }
        }
        return ten;

    }
}
