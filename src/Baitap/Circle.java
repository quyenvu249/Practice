package Baitap;

import java.util.Scanner;

public class Circle {
    static final float PI = 3.14f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ban kinh: ");
        double bankinh = sc.nextDouble();
        double chuVi = bankinh*2*PI;
        double dienTich = bankinh*bankinh*PI;
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);

    }
}
