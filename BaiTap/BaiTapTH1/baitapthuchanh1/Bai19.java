package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai19 {

    public static int soHoanHao(int n){

        int s = 0;
        for(int i = 1; i < n; i++){
            if(n%i==0) s+=i;
        }
        if(s == n) return 1;
        return 0;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap day: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int dem = 0;
        for(int i = 0; i < n; i++){

            if(soHoanHao(arr[i])==1) {
                System.out.printf("%d\t",arr[i]);
                dem++;
            }
        }
        System.out.println();
        if(dem==0) System.out.print("Day khong co so hoan hao\n");
    }
}
