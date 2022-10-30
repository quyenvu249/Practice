package _151022;

import java.util.Scanner;

public class Ex1 {
    static final double PI = 3.14;

    public static double areaOfCircle(double r) {
        return r * r * PI;
    }

    public static double perimeterOfCircle(double r) {
        return 2 * r * PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of cirlce: " + areaOfCircle(radius));
        System.out.println("Perimeter of circle: " + perimeterOfCircle(radius));
    }
}

