package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai12 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap r: ");
        double r = sc.nextDouble();
        while (r<0){
            System.out.print("Nhap lai r: ");
            r = sc.nextDouble();
        }

        double cv = 2*Math.PI*r;
        double dt = Math.PI*r*r;

        System.out.printf("Chu vi hinh tron co ban kinh r: %.3f\n",cv);
        System.out.printf("Dien tich hinh tron co ban kinh r: %.3f\n",dt);

    }
}
