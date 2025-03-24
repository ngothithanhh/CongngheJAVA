package baitap;

import java.util.Scanner;
import baitap.baitapthuchanh1.*;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int running = 1;

        while (running==1) {

                System.out.println("===== Menu =====");
                System.out.println("1. Bai 1");
                System.out.println("2. Bai 2");
                System.out.println("...");
                System.out.println("19. Bai 19");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon cua ban: ");

                int x = sc.nextInt();

                switch (x) {
                    case 0:
                        System.out.println("Thoat chuong trinh.");
                        running = 0;
                        break;
                    case 1:
                        new Bai1().run();
                        break;
                    case 2:
                        new Bai2().run();
                        break;
                    case 3:
                        new Bai3().run();
                        break;

                    case 4:
                        new Bai4();
                        break;

                    case 5:
                        new Bai5().run();
                        break;

                    case 6:
                        new Bai6().run();
                        break;

                    case 7:
                        new Bai7().run();
                        break;

                    case 8:
                        new Bai8().run();
                        break;

                    case 9:
                        new Bai9().run();
                        break;

                    case 10:
                        new Bai10().run();
                        break;

                    case 11:
                        new Bai11().run();
                        break;

                    case 12:
                        new Bai12().run();
                        break;

                    case 13:
                        new Bai13().run();
                        break;

                    case 14:
                        new Bai14().run();
                        break;

                    case 15:
                        new Bai15().run();
                        break;

                    case 16:
                        new Bai16().run();
                        break;

                    case 17:
                        new Bai17().run();
                        break;

                    case 18:
                        new Bai18().run();
                        break;


                    case 19:
                        new Bai19().run();
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long thu lai.");
                }
                System.out.print("\nCo chay tiep?(1-co/0-khong): ");
                running = sc.nextInt();

        }

        sc.close();
    }
}
