package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai5 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so phuong trinh ax + b = 0: ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.printf("x = %.3f\n", (-b) / a);
        }

        sc.close();
    }
}

