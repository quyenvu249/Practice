package _271022;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int numberOfArray = sc.nextInt();
        int[] arr = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Phan tu thu " + i + " cua mang: ");
            arr[i] = sc.nextInt();
        }

        //Sap xep va xuat mang
        Arrays.sort(arr);
        System.out.println("Phan tu cua mang: ");
        for (int i = 0; i < numberOfArray; i++) {
            System.out.print(arr[i]+" ");
        }

        //Xuat phan tu be nhat
        int min = arr[0];
        for (int i = 0; i < numberOfArray; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("\nPhan tu be nhat: "+min);

        //Tinh va xuat ra trung binh cong cac phan tu chia het cho 3
        int sum = 0;
        for (int i = 0; i < numberOfArray; i++) {
            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }
        System.out.println("\nTong la: "+sum);
    }
}
