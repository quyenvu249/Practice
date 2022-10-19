/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class mainPractice1 {

    public static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student list.");
        System.out.println("2. Show student list.");
        System.out.println("3. Find student by id.");
//        System.out.println("4. Sort student by department.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {
        String choose = null;
        List<Student1> list = new ArrayList<Student1>();
        studentManage sv1 = new studentManage();
        boolean exit = false;
        int StudentID;

        showMenu();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Enter the number of students to add: ");
                    int numberOfStudent = sc.nextInt();
                    for (int i = 0; i < numberOfStudent; i++) {
                        Student1 std = new Student1();
                        std.inputStudentInfo();
                        sv1.add(std);
                    }

                    break;
                case "2":
                    sv1.outputStudentList();
                    break;
                case "3":
                    System.out.println("Enter ID: ");
                    String studentID = sc.nextLine();
                    System.out.println("Result: ");
                    sv1.findStudent(studentID);
                    break;
                case "4":
                    sv1.sortByDepartment();
                    break;
                case "0":
                    System.out.println("exited");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! pls chooes action");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
}
