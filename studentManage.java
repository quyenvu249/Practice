/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class studentManage {

    private ArrayList<Student1> list ;

    public studentManage() {
        this.list = new ArrayList<Student1>();
    }

    public void add(Student1 std) {
        this.list.add(std);
    }

    public void outputStudentList() {
        for (Student1 student : list) {
            System.out.println(student.getStudentID());
            System.out.println(student.getStudentName());
            System.out.println(student.getDepartment());

        }
    }

    public void findStudent(String studentID) {
        for (Student1 student : list) {
            if (student.getStudentID().contains(studentID)) {
                 System.out.println(student.getStudentName());
            } else{
                System.out.println("don't have that student");
            }
               
            
        }
    }
    
            public void sortByDepartment() {
        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int compare = o1.getDepartment().compareTo(o2.getDepartment());
                if (compare >= 0) {
                    return 1;
                }
                return -1;
            }
        });
        outputStudentList();

    }

   
         
                 
   
}
//    public ArrayList<Student1> getStudentList() {
//        return list;
//    }
//
//    public void setStudentList(ArrayList<Student1> list) {
//        this.list = list;
//    }
