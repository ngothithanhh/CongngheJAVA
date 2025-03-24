package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai8 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c (a>0, b>0, c>0): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a+b>c && a+c>b && b+c>a){
            double cv = a+b+c;
            double p = cv/2;
            double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Chu vi tam giac: %.3f",cv);
            System.out.printf("\nDien tich tam giac: %.3f\n",dt);
        }
        else{
            System.out.println("Khong tao thanh tam giac");
        }

    }
}
