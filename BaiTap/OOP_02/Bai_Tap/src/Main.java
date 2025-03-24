import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello, World!");

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