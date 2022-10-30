package _271022;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        int inputMonth = sc.nextInt();
        switch (inputMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Please enter the year: ");
                int inputYear1 = sc.nextInt();
                System.out.println("Thang " + inputMonth + " nam " + inputYear1 + " co 31 ngay.");
                break;
            case 4, 6, 9, 11:
                System.out.println("Please enter the year: ");
                int inputYear2 = sc.nextInt();
                System.out.println("Thang " + inputMonth + " nam " + inputYear2 + " co 30 ngay.");
                break;
            case 2:
                System.out.println("Please enter the year: ");
                int inputYear3 = sc.nextInt();
                if (inputYear3 % 4 == 0 && inputYear3 % 100 != 0 || inputYear3 % 400 == 0) {
                    System.out.println("Thang " + inputMonth + " nam " + inputYear3 + " co 28 ngay.");
                } else {
                    System.out.println("Thang " + inputMonth + " nam " + inputYear3 + " co 29 ngay.");
                }
                break;
            default:
                System.out.println("Wrong!!");
        }
    }
}
