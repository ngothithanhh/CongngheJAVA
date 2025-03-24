package Bai_Tap2;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    private double CTDL_GT, TRR, CSDL, LaptrinhOOP;

    // Constructor mặc định
    public SinhVienCNTT() {
        super();
    }

    // Constructor đầy đủ
    public SinhVienCNTT(int maSV, String hoTen, String gioiTinh, double tinDaiCuong, double chinhTri, double phapLuat,
                        double CTDL_GT, double TRR, double CSDL, double LaptrinhOOP) {
        super(maSV, hoTen, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.CTDL_GT = CTDL_GT;
        this.TRR = TRR;
        this.CSDL = CSDL;
        this.LaptrinhOOP = LaptrinhOOP;
    }

    // Getter và Setter
    public double getCTDL_GT() { return CTDL_GT; }
    public void setCTDL_GT(double CTDL_GT) { this.CTDL_GT = CTDL_GT; }

    public double getTRR() { return TRR; }
    public void setTRR(double TRR) { this.TRR = TRR; }

    public double getCSDL() { return CSDL; }
    public void setCSDL(double CSDL) { this.CSDL = CSDL; }

    public double getLaptrinhOOP() { return LaptrinhOOP; }
    public void setLaptrinhOOP(double LaptrinhOOP) { this.LaptrinhOOP = LaptrinhOOP; }

    // Nhập thông tin sinh viên CNTT
    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); // Gọi phương thức nhập của lớp cha
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem CTDL & GT: ");
        this.CTDL_GT = sc.nextDouble();

        System.out.print("Nhap diem TRR: ");
        this.TRR = sc.nextDouble();

        System.out.print("Nhap diem CSDL: ");
        this.CSDL = sc.nextDouble();

        System.out.print("Nhap diem Lap trinh OOP: ");
        this.LaptrinhOOP = sc.nextDouble();
    }

    // Xuất thông tin sinh viên CNTT
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf(" - Diem CTDL_GT: %.2f - Diem TRR: %.2f - Diem CSDL: %.2f - Diem OOP: %.2f\n",
                CTDL_GT, TRR, CSDL, LaptrinhOOP);
    }

    // Phương thức tính điểm trung bình của các môn chuyên ngành
    public double tinhDiemTrungBinhCNTT() {
        return (CTDL_GT + TRR + CSDL + LaptrinhOOP) / 4;
    }
}
