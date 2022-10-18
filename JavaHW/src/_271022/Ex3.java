package _271022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        System.out.println("Enter number of student: ");
        int numberOfStudent = sc.nextInt();
        for (int i = 0; i < numberOfStudent; i++) {
            Student std = new Student();
            std.inputStudentInfo();
            studentArrayList.add(std);
        }

        //In danh sach sinh vien
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getMark() < 5) {
                studentArrayList.get(i).showStudentInfo();
                System.out.println("Hoc luc yeu.");
            } else if (studentArrayList.get(i).getMark() > 5 && studentArrayList.get(i).getMark() < 6.5) {
                studentArrayList.get(i).showStudentInfo();
                System.out.println("Hoc luc trung binh.");
            } else if (studentArrayList.get(i).getMark() >= 6.5 && studentArrayList.get(i).getMark() < 7.5) {
                studentArrayList.get(i).showStudentInfo();
                System.out.println("Hoc luc kha.");
            } else if (studentArrayList.get(i).getMark() >= 7.5 && studentArrayList.get(i).getMark() < 9) {
                studentArrayList.get(i).showStudentInfo();
                System.out.println("Hoc luc gioi.");
            } else if (studentArrayList.get(i).getMark() > 9) {
                studentArrayList.get(i).showStudentInfo();
                System.out.println("Hoc luc xuat sac.");
            }
        }

        //Sap xep diem tang dan
        Comparator<Student> comparator = Comparator.comparing(Student::getMark);
        Collections.sort(studentArrayList, comparator);
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i).getName() + " " + studentArrayList.get(i).getMark());
        }
    }
}
