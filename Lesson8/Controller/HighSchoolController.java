/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Controller;

import Lesson8.Model.HighSchoolStudent;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class HighSchoolController implements InterfaceStudent {

    Scanner sc = new Scanner(System.in);

    ArrayList<HighSchoolStudent> High = new ArrayList<>();

    @Override
    public void show() {
        for (int i = 0; i < High.size(); i++) {
            System.out.println(High.get(i).toString());
        }
    }

    @Override
    public void add() {
        HighSchoolStudent h = new HighSchoolStudent();
        System.out.println("ID :");
        h.setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Name :");
        h.setName(sc.nextLine());
        System.out.println("Address :");
        h.setAddress(sc.nextLine());
        System.out.println("Chemical :");
        h.setChemical(sc.nextInt());
        sc.nextLine();
        System.out.println("Math :");
        h.setMath(sc.nextInt());
        sc.nextLine();
        System.out.println("Physic:");
        h.setPhysic(sc.nextInt());
        sc.nextLine();
        try {
            High.add(h);
            System.out.println("Add successful");

        } catch (Exception e) {
            System.out.println("Fail");
        }
        show();
    }

    @Override
    public void delete() {
        System.out.println("Name student want to delete :");
        String input = sc.nextLine();
        int index = -1;
        for (int i = 0; i < High.size(); i++) {
            if (High.get(i).getName().equals(input)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Cannot find");
        } else {
            High.remove(index);
            System.out.println("Delete Sucessful");
        }
    }

    @Override
    public void findByID() {
        boolean isExist = false;
        System.out.println("Id : ");
        int Id = sc.nextInt();
        for (int i = 0; i < High.size(); i++) {
            if (High.get(i).getID() == Id) {
            System.out.println(High.get(i).toString());
            isExist = true;
            } 
        }
if(isExist= false){
    System.out.println("Cannot find");}
    }

}
