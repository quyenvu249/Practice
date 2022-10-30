package _271022;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1: Giai phuong trinh bac nhat\n" +
                    "2: Giai phuong trinh bac 2\n" +
                    "3: Tinh tien dine\n" +
                    "4: Thoat");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    giaiPhuongTrinhBac1();
                    break;
                case 2:
                    System.out.println("Nhap he so 2, a= ");
                    float a = sc.nextFloat();
                    System.out.println("Nhap he so 1, b= ");
                    float b = sc.nextFloat();
                    System.out.println("Nhap he so 2, c= ");
                    float c = sc.nextFloat();
                    giaiPhuongTrinhBac2(a,b,c);
                    break;
                case 3:
                    System.out.println("Nhap so dien thang vua roi: ");
                    float numberElectricity = sc.nextFloat();
                    tinhTienDien(numberElectricity);
                    break;
            }
        } while (choice > 0 && choice < 4);
    }

    static void giaiPhuongTrinhBac1(){
        Scanner sc = new Scanner(System.in);
        double aNumber, bNumber, result;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Nhap vao so a: ");
        aNumber = sc.nextInt();
        System.out.println("Nhap vao so b: ");
        bNumber = sc.nextInt();
        System.out.println("Phuong trinh vua nhap: " + aNumber + "x + " + bNumber + " = 0");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            result =-bNumber / aNumber;
            System.out.println("Phuong trinh co nghiem x = " + decimalFormat.format(result) + ".");
        }
    }

    static void giaiPhuongTrinhBac2(float a, float b, float c){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co mot nghiem la: " + "x = " + (-c / b));
            }
        }

        float delta = b*b - 4*a*c, x1, x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Hai nghiem cua phuong trinh la: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Vo nghiem");
        }
    }

    static void tinhTienDien(float numberElectricity){
        if (numberElectricity <= 50) {
            System.out.println("So tien phai tra: " + numberElectricity * 1000);
        } else if (numberElectricity > 50) {
            System.out.println("So tien phai tra: " + (50 * 1000 + (numberElectricity - 50) * 1200));
        }
    }
}
