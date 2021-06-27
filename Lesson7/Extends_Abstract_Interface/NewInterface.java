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
public interface NewInterface {

    void suyNghi();

    default void Noi() {
        System.out.println("sn");
    }
}
