package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai3 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap So thu hai: ");
        int b = sc.nextInt();
        int t = a + b;
        System.out.printf("Tong cua %d Va %d La %d\n",a,b,t);
    }
}
