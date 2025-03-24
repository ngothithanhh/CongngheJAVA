package baitap.baitapthuchanh1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai16 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap day de kiem tra: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int check, check1 = 0;
        if(arr[0]<arr[1]) check = 1;
        else check = 0;
        for(int i = 1; i < n-1; i++){
            if(arr[i] < arr[i+1]) check1 = 1;
            else check1 = 0;
            if(check!=check1) break;
        }
        if(check==check1){
            if(check==0) System.out.println("Day so giam dan");
            else System.out.println("Day so tang dan");
        }
        else System.out.println("Day so khong tang, khong giam");

    }
}
