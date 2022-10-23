package Baitap;

import java.util.Scanner;

public class BinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = sc.nextDouble();
        double square = number * number;
        System.out.println("Square result: " + square);

    }
}
