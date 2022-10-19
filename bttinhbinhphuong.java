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
public class bttinhbinhphuong {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Num");
        num = sc.nextInt();
        int square = (int) Math.pow(num, 2.0);
        System.out.println("Square of num is: " + square );
    }
    
}
