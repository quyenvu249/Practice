/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student1 {

    private String studentID;
    private String studentName;
    private String department;

    public Student1() {

    }

    public Student1(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter student ID");
        studentID = sc.nextLine();
        System.out.println("please enter student name");
        studentName = sc.nextLine();
        System.out.println("Please enter departement");
        department = sc.nextLine();
    }

    public String getStudentInfo() {

        return "Student [Student ID=" + studentID + ", Student name=" + studentName + ", Department" + department + "]";
    }
}
