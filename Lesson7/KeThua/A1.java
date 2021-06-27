/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.KeThua;

/**
 *
 * @author Vanh
 */
public class A1 extends A implements Interface {

    int a1;

    public A1() {
        System.out.println("constructor A1");
    }

    public void hamA1() {
        super.hamA();
        System.out.println("hamA1");
    }

    public int ngu() {
        return 0;
    }

    public void chay() {
    }

    public int add(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suyNghi() {
        System.out.println("Suy Nghi");
    }

}
