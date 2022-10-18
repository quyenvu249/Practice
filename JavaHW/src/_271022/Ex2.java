package _271022;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung trong thang: ");
        int numberElectricity = sc.nextInt();
        if (numberElectricity <= 50) {
            System.out.println("So tien phai tra: " + numberElectricity * 1000);
        } else if (numberElectricity > 50) {
            System.out.println("So tien phai tra: " + (50 * 1000 + (numberElectricity - 50) * 1200));
        }
    }
}
