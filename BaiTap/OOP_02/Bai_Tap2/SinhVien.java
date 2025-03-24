package Bai_Tap2;

import java.util.Scanner;

public abstract class SinhVien {
    private int maSV;
    private String hoTen;
    private String gioiTinh;
    private double tinDaiCuong, chinhTri, phapLuat;

    // Constructor
    public SinhVien() {}

    public SinhVien(int maSV, String hoTen, String gioiTinh, double tinDaiCuong, double chinhTri, double phapLuat) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tinDaiCuong = tinDaiCuong;
        this.chinhTri = chinhTri;
        this.phapLuat = phapLuat;
    }

    // Getter và Setter
    public int getMaSV() { return maSV; }
    public void setMaSV(int maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public double getTinDaiCuong() { return tinDaiCuong; }
    public void setTinDaiCuong(double tinDaiCuong) { this.tinDaiCuong = tinDaiCuong; }

    public double getChinhTri() { return chinhTri; }
    public void setChinhTri(double chinhTri) { this.chinhTri = chinhTri; }

    public double getPhapLuat() { return phapLuat; }
    public void setPhapLuat(double phapLuat) { this.phapLuat = phapLuat; }

    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        this.maSV = sc.nextInt();
        sc.nextLine(); // Loại bỏ dòng thừa

        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();

        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();

        System.out.print("Nhap diem Tin Dai Cuong: ");
        this.tinDaiCuong = sc.nextDouble();

        System.out.print("Nhap diem Chinh Tri: ");
        this.chinhTri = sc.nextDouble();

        System.out.print("Nhap diem Phap Luat: ");
        this.phapLuat = sc.nextDouble();
    }

//    public abstract double getDiem();

    // Phương thức xuất thông tin sinh viên
    public void xuatThongTin() {
        System.out.printf("MaSV: %d - Ho ten: %s - Gioi tinh: %s - Diem TDC: %.2f - Diem CT: %.2f - Diem PL: %.2f\n",
                maSV, hoTen, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
    }

    // Phương thức tính điểm trung bình
    public double tinhDiemTrungBinh() {
        return (tinDaiCuong + chinhTri + phapLuat) / 3;
    }
}
