package baitap.baitapthuchanh1;

import java.util.Scanner;

public class Bai15 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double d = sc.nextDouble();
        while (d<0 && d>10){
            System.out.print("Nhap lai diem: ");
            d = sc.nextDouble();
        }

        if(d<5){
            System.out.println("hoc luc Yeu");
        }
        else if(d>=5 && d<6){
            System.out.println("hoc luc Trung Binh");
        }
        else if(d>=6 && d<7){
            System.out.println("hoc luc Trung binh Kha");
        }
        else if(d>=7 && d<8){
            System.out.println("hoc luc Kha");
        }
        else if(d>=8 && d<9){
            System.out.println("hoc luc Gioi");
        }
        else{
            System.out.println("hoc luc Xuat sac");
        }
    }
}
