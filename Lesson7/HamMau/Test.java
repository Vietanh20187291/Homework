/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.HamMau;

/**
 *
 * @author Vanh
 */
public class Test {
    public static void main(String[] args) {
        HamMau h = new HamMau();
        h.ttDefault = 1;
        h.ttProtected = 2;
        h.ttPublic = 3;
        
        h.phuongThucPublic();
        h.phuongThucProtected();
        h.phuongThucDefault();
        
    }
    
}
