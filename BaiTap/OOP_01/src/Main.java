
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");
//
//        Diem d1 = new Diem(1,2);
//        Diem d2 = new Diem(5, 5);
//
//        DuongThang dt = new DuongThang(d1, d2);
//
//        System.out.printf("Do dai thuong thang: %.3f\n", dt.doDaiDuongThang());

//        SinhVien sv1 = new SinhVien("Ngo Thi Thanh", "Ha Noi", "Nu", 8);
//        sv1.xepLoai();
//        sv1.xuat();
//
//        SinhVien sv2 =  new SinhVien();
//        sv2.nhap();
//        sv2.xuat();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        SinhVien sv[] = new SinhVien[n];

        DsSinhVien.nhapDSSinhVien(sv,n);
        DsSinhVien.inDSSinhVien(sv,n);
        DsSinhVien.sapXep(sv,n);
        DsSinhVien.inDSSinhVien(sv,n);

    }
}