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
public class btdt {

    public static void main(String[] args) {
        double radius;
        double PI = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius");
        radius = sc.nextDouble();

        double area = Math.pow(radius, 2.0) * 3.14;
        System.out.println("Area of this circle is " + area);

        double perimeter = 2 * radius * 3.14;
        System.out.println("Parameter of this circle is " + perimeter);

    }

}
