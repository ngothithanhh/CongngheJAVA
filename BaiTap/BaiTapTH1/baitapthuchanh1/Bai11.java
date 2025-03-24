package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai11 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap day lon: ");
        double a = sc.nextDouble();
        System.out.print("Nhap day nho: ");
        double b = sc.nextDouble();
        System.out.print("Nhap chieu cao: ");
        double h = sc.nextDouble();

        double s = ((double) 1/2)*(a+b)*h;
        System.out.printf("Dien tich hinh thang s = %.3f\n",s);
    }
}
