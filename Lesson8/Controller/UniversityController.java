/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Controller;
import Lesson8.Model.UniversityStudent;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class UniversityController implements InterfaceStudent {

    Scanner sc = new Scanner(System.in);

    ArrayList<UniversityStudent> Uni = new ArrayList<>();

    @Override
    public void show() {
        for (int i = 0; i < Uni.size(); i++) {
            System.out.println(Uni.get(i).toString());
        }
    }

    @Override
    public void add() {
        UniversityStudent h = new UniversityStudent();
        System.out.println("ID :");
        h.setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Name :");
        h.setName(sc.nextLine());
        System.out.println("Address :");
        h.setAddress(sc.nextLine());
        System.out.println("Major :");
        h.setMajor(sc.nextLine());
        System.out.println("CPA :");
        h.setCPA(sc.nextFloat());
        sc.nextLine();
        try {
            Uni.add(h);
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
        for (int i = 0; i < Uni.size(); i++) {
            if (Uni.get(i).getName().equals(input)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Cannot find");
        } else {
            Uni.remove(index);
            System.out.println("Delete Sucessful");
        }
    }

    @Override
    public void findByID() {
        boolean isExist = false;
        System.out.println("Id : ");
        int Id = sc.nextInt();
        for (int i = 0; i < Uni.size(); i++) {
            if (Uni.get(i).getID() == Id) {
            System.out.println(Uni.get(i).toString());
            isExist = true;
            } 
        }
if(isExist= false){
    System.out.println("Cannot find");}
    }

}
