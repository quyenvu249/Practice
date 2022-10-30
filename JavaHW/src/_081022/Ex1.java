package _081022;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tong cac so chan la: " + total);
    }
}

