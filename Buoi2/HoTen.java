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
public class HoTen {

    public static void main(String[] args) {
        String[] arr = new String[3];
        arr = tach("Nguyen Viet Viet Anh");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    public static String[] tach(String hoten) {
        int firstIndex = 0, lastIndex = 0;
        char ch = ' ';
        String ho = "", ten = "", tendem = "";
        for (int i = 0; i < hoten.length(); i++) {
            if (hoten.charAt(i) == ch) {
                for (int j = 0; j < i; j++) {
                    ho = ho + hoten.charAt(j);
                }
                firstIndex = i;
                break;
            }

        }
        for (int i = hoten.length() - 1; i > 0; i--) {

            if (hoten.charAt(i) == ch) {
                for (int j = i+1; j < hoten.length(); j++) {
                    ten = ten + hoten.charAt(j);
                }
                lastIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < lastIndex; i++) {
            tendem = tendem + hoten.charAt(i);
        }
        String[] arr = new String[3];
        arr[0] = ho;
        arr[1] = tendem;
        arr[2] = ten;
        return arr;

    }

}
