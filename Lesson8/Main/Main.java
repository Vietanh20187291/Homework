/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Main;
import Lesson8.Controller.UniversityController;
import Lesson8.Controller.HighSchoolController;
import Lesson8.Model.HighSchoolStudent;
import Lesson8.Model.UniversityStudent;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanh
 */
public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("1: HighSchool Student");
        System.out.println("2: University Student");
        System.out.println("Type of Student:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "1":
                HighSchoolController highschool = new HighSchoolController();
                do {
                    System.out.println("Chon Thao Tac ");
                    System.out.println("1: Add Student");
                    System.out.println("2: Delete Student");
                    System.out.println("3: Find By Id");
                    System.out.println("4: Print Info");
                    System.out.println("5: Exit");
                    String input = sc.nextLine();
                    switch (input) {

                        case "1":
                            highschool.add();
                            break;
                        case "2":
                            highschool.delete();
                            break;
                        case "3":
                            highschool.findByID();
                            break;
                        case "4":
                            highschool.show();
                            break;
                        case "5":
                            exit = true;
                            break;
                        default:
                            System.out.println("Nhap sai");
                            break;
                    }
                } while (exit == false);

                break;
            case "2":
                UniversityController uni = new UniversityController();
                do {
                    System.out.println("Chon Thao Tac ");
                    System.out.println("1: Add Student");
                    System.out.println("2: Delete Student");
                    System.out.println("3: Find By Id");
                    System.out.println("4: Print Info");
                    System.out.println("5: Exit");
                    String input = sc.nextLine();
                    switch (input) {

                        case "1":
                            uni.add();
                            break;
                        case "2":
                            uni.delete();
                            break;
                        case "3":
                            uni.findByID();
                            break;
                        case "4":
                            uni.show();
                            break;
                        case "5":
                            exit = true;
                            break;
                        default:
                            System.out.println("Nhap sai");
                            break;
                    }
                } while (exit == false);
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }
    }
}
