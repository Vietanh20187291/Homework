/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.Extends_Abstract_Interface;

/**
 *
 * @author Vanh
 */
public interface Interface extends NewInterface{
    int ngu();
    void chay();
    int add(int a, int b);
    default void showAdd(int a, int b){
        System.out.println("Ket qua la "+add(a,b));
    }
}
