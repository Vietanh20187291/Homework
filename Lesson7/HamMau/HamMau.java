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
public class HamMau {

    public int ttPublic;
    private int ttPrivate;
    protected int ttProtected;
    int ttDefault;

    public void phuongThucPublic() {
    }

    protected void phuongThucProtected() {
    }

    private void phuongThucPrivate() {
    }

    void phuongThucDefault() {
        HamMau h = new HamMau();
    }
    
    public static void show(HamMau h){
    
    }
}
