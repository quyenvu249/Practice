package _271022;

import java.util.Scanner;

public class Student {
    private String name;
    private double mark;

    public Student() {

    }

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public boolean setMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.out.println("Enter again student's mark: ");
            return false;
        }
    }

    public void inputStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        name = sc.nextLine();
        System.out.println("Enter student's mark: ");
        while (true) {
            float markInput = sc.nextFloat();
            boolean check = setMark(markInput);
            if (check) {
                break;
            }
        }
    }

    public void showStudentInfo() {
        System.out.println("Student's name: " + name + "\nStudent's mark: " + mark);
    }

}
