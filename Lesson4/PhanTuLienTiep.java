/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author Vanh
 */
public class PhanTuLienTiep {

    // * Bài 4: Viết hàm tìm kiếm 3 phần từ liên tiếp trong 1 mảng. 
    //        Nếu có in ra chỉ số của 3 phần tử đấy, nếu không in ra -1.
    public static void main(String[] args) {
        boolean check = false;
        int[] arr = {4, 5, 6};
        
        int[] arrMau = {1, 2, 3, 4, 5, 6, 6, 7};
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[1] == arrMau[i] && arr[2] == arrMau[i + 1] && arr[3] == arrMau[i+2]) {
                System.out.println("Vi tri la :"+(i+1)+","+(i+2)+","+(i+3));
                check = true;
            }            
        }
        if(check = false){
            System.out.println("-1");
        }

    }
}

