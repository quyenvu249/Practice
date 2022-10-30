package _081022;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi: ");
        String str1 = sc.nextLine();
        System.out.println("Nhap 1 ki tu: ");
        String str2 = sc.nextLine();
        if (str1.contains(str2)) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
        }
    }
}

