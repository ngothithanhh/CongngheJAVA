package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai13 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so giay t: ");
        int t = sc.nextInt();
        int h = t/3600;
        int p = (t%3600)/60;
        t = (t%3600)%60;

        if(h<10){
            System.out.printf("0%d:",h);
        }
        else{
            System.out.printf("%d:",h);
        }
        if(p<10){
            System.out.printf("0%d:",p);
        }
        else{
            System.out.printf("%d:",p);
        }
        if(t<10){
            System.out.printf("0%d\n",t);
        }
        else{
            System.out.printf("%d\n",t);
        }
    }
}
