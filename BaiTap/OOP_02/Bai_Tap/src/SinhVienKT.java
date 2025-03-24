import java.util.Scanner;

public class SinhVienKT extends SinhVien{
    private double Kinhte_vimo, KinhteVixmo, LuatKT;

    // Constructor mặc định
    public SinhVienKT() {
        super();
    }

    // Constructor đầy đủ
    public SinhVienKT(int maSV, String hoTen, String gioiTinh, double tinDaiCuong, double chinhTri, double phapLuat,
                      double Kinhte_vimo, double KinhteVixmo, double LuatKT) {
        super(maSV, hoTen, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.Kinhte_vimo = Kinhte_vimo;
        this.KinhteVixmo = KinhteVixmo;
        this.LuatKT = LuatKT;
    }

    public double getKinhte_vimo() {
        return Kinhte_vimo;
    }

    public void setKinhte_vimo(double Kinhte_vimo) {
        this.Kinhte_vimo = Kinhte_vimo;
    }

    public double getKinhteVixmo() {
        return KinhteVixmo;
    }

    public void setKinhteVixmo(double KinhteVixmo) {
        this.KinhteVixmo = KinhteVixmo;
    }

    public double getLuatKT() {
        return LuatKT;
    }

    public void setLuatKT(double LuatKT) {
        this.LuatKT = LuatKT;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); // Gọi phương thức nhập của lớp cha
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem Kinh te vi mo: ");
        this.Kinhte_vimo = sc.nextDouble();

        System.out.print("Nhap diem Kinh te VM: ");
        this.KinhteVixmo = sc.nextDouble();

        System.out.print("Nhap diem Luat kinh te: ");
        this.LuatKT = sc.nextDouble();


    }

    // Xuất thông tin sinh viên Kinh te
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf(" - Diem Kinh te vi mo: %.2f - Diem Kinh te vix mo: %.2f - Diem Luat kinh te: %.2f\n",
                Kinhte_vimo,KinhteVixmo,LuatKT);
    }

    // Phương thức tính điểm trung bình của các môn chuyên ngành
    public double tinhDiemTrungBinhCNTT() {
        return (Kinhte_vimo + KinhteVixmo + LuatKT) / 3;
    }


}
