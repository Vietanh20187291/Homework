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
public class A extends Abstract{
    int a;
    public A(){
        System.out.println("constructor A");
    }
    public void hamA(){
        System.out.println("hamA");
    }

    @Override
    public void An() {
        System.out.println("Dang An");
    }

    @Override
    public String Uong() {
        return "Dang Uong";
    }
}

