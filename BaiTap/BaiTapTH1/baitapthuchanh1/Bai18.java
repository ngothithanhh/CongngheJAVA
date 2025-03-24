package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai18 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap day de kiem tra: ");
        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        int check = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i]+arr[i+1]==x){
                System.out.printf("%.3f - %.3f\n",arr[i],arr[i+1]);
                check++;
            }
        }
        if(check==0){
            System.out.println("Khong co");
        }
    }
}
