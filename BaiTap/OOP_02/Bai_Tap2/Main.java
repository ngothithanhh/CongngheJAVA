package Bai_Tap2;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ngoth
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int n;
       System.out.print("Nhap so sinh vien:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       SinhVien[] sv = new SinhVien[n];
       
       for(int i = 0; i < n; i++){
           
           System.out.println("Nhap sinh vien khoa nao? (1.CNTT) (2.KT)\n");
           int option = sc.nextInt();
           
           if(option==1){
               System.out.println("Nhap thong tin sinh vien khoa CNTT");
               sv[i] = new SinhVienCNTT();
               sv[i].nhapThongTin();
           }
           else if(option==2){
               System.out.println("Nhap thong tin sinh vien khoa KT");
               sv[i] = new SinhVienKT();
               sv[i].nhapThongTin();
           }
           else{
               System.out.println("Error!!!");
           }
       }
       
       for(SinhVien sinhvien : sv){
           sinhvien.xuatThongTin();
           System.out.println("");
       }
    }
}
