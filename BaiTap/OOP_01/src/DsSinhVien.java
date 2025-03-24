import java.util.Scanner;

public class DsSinhVien {
    public static void inDSSinhVien(SinhVien[] sv, int n){
        System.out.println("-----THONG TIN SINH VIEN-----");
        for(int i = 0; i < n; i++){
            sv[i].xuat();
        }
    }

    public static void nhapDSSinhVien(SinhVien[] sv, int n){
        System.out.println("NHAP THONG TIN SINH VIEN");
        for(int i = 0; i < n; i++){
            sv[i] = new SinhVien();
            sv[i].nhap();
        }
    }

    public static void sapXep(SinhVien[] sv, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n; j++){
                if(sv[i].getDiem() > sv[j].getDiem()){
                    SinhVien tmp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = tmp;
                }
            }
        }
    }
}
