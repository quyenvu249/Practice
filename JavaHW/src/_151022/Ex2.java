package _151022;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number: ");
        double number = sc.nextDouble();
        System.out.println("The square of this number: " + Math.pow(number, 2));
    }
}

