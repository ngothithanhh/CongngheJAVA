package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai7 {
    public void run(){
        System.out.println("***CAC HAM LUONG GIAC***");
        System.out.print("Nhap vao 1 goc: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float a = (float) ((float) x * Math.PI/180);
        System.out.printf("Sin(%.1f)=%f\n",x,Math.sin(a));
        System.out.printf("Cos(%.1f)=%f\n",x,Math.cos(a));

        System.out.printf("Tan(%.1f)=%f\n",x,Math.tan(a));
        System.out.printf("CogTan(%.1f)=%f\n",x,Math.cos(a)/Math.sin(a));


    }
}
