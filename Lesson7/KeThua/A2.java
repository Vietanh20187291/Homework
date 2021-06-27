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
public class A2 extends A1 {

    int a2;

    public A2() {
        System.out.println("constructor A2");
    }

    @Override
    public void hamA1() {
        System.out.println("hamA1 ghi de");
    }

    public void hamA2(int a, int a1, int a2) {
//        hamA1();
//        hamA();
        super.hamA();
//        super.hamA1();
//        this.a = a;
//        this.a1= a1;
//        this.a2= a2;
//        System.out.println("hamA2");
        String x = super.Uong();
        System.out.println(x);
    }
}
