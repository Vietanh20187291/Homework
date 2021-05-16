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
public class TongHieu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong : ");
        float tong = sc.nextFloat();
        System.out.print("Nhap hieu : ");
        float hieu= sc.nextFloat();
        
        float st1 = TinhSoThu1(tong, hieu);
        System.out.println(st1);
        float st2 =TinhSoThu2(tong, hieu);
        System.out.println(st2);
    }
public static float TinhSoThu1(float tong, float hieu){
    return (tong + hieu)/2;
}
public static float TinhSoThu2(float tong, float hieu){
    return (tong - hieu)/2;
}
}