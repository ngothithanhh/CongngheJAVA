package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai9 {
    public static int giaithua(int n){
        int gt = 1;
        for(int i = 1; i <= n; i++){
            gt *= i;
        }
        return gt;
    }
    public void run(){
        System.out.println("***TINH TONG CHUOI SO***");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double s = x;

        for(int i = 2; i <= n; i++){
            s += ((double) Math.pow(x,i)/giaithua(i));
        }
        System.out.printf("(%d,%d) = %.4f\n",x,n,s);
    }
}
