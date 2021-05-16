/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Vanh
 */
public class HienThiGio {

    public static void main(String[] args) {
        String a = ngaygio();
        System.out.println(a);
    }

    public static String ngaygio() {
        Calendar cal = Calendar.getInstance();
        String time = "Thời gian hiện tại của là " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
        return time;
    }
}
