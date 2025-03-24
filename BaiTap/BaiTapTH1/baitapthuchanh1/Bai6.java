package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai6 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***GIAI VA BIEN LUAN PHUONG TRINH BAC 2***");
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();

        System.out.print("Nhap b: ");
        float b = sc.nextFloat();

        System.out.print("Nhap c: ");
        float c = sc.nextFloat();

        float delta = b*b - 4*a*c;

        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(delta == 0){
            System.out.printf("Phuong trinh co 1 nghiem kep: x1 = X2 = %.3f",(-b)/(2*a));
        }
        else{
            float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));

            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.printf("x1 = %.3f\n",x1);
            System.out.printf("x2 = %.3f\n",x2);
        }
    }
}
