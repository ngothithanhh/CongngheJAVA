package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai17 {
    public static void cuuChuong(int n){
        for(int i = 1; i<=10; i++){
            System.out.printf("%d*%d = %d\n",n,i,n*i);
        }
    }

    public void run(){
        System.out.println("***BANG CUU CHUONG TU 2 DEN 9***");
        for(int i = 2; i <= 9; i++){
            cuuChuong(i);
            System.out.print("\n");
        }
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.printf("Bang cuu chuong %d\n",n);
        cuuChuong(n);
    }
}
