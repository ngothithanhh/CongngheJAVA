import java.util.Scanner;
import java.util.regex.Pattern;

class Bai5 {
    private String maNhanVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String ngaySinh;
    private String email;
    private String soCMND;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma nhan vien (gom 3 chu cai va 3 so) : ");
        maNhanVien = sc.nextLine();
        while (!Pattern.matches("[a-zA-Z]{3}\\d{3}", maNhanVien)) {
            System.out.print("Ma nhan vien khong hop le. Vui long nhap lai: ");
            maNhanVien = sc.nextLine();
        }

        System.out.print("Nhap ho va ten (toi thieu 5 ky tu): ");
        hoTen = sc.nextLine();
        while (hoTen.length() < 5) {
            System.out.print("Ho va ten khong hop le. Vui long nhap lai: ");
            hoTen = sc.nextLine();
        }


        System.out.print("Nhap dia chi (toi da 30 ky tu): ");
        diaChi = sc.nextLine();
        while (diaChi.length() > 30) {
            System.out.print("Dia chi khong hop le. Vui long nhap lai: ");
            diaChi = sc.nextLine();
        }


        System.out.print("Nhap so dien thoai (10 chu so): ");
        soDienThoai = sc.nextLine();
        while (!Pattern.matches("\\d{10}", soDienThoai)) {
            System.out.print("So dien thoai khong hop le. Vui long nhap lai: ");
            soDienThoai = sc.nextLine();
        }


        System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
        ngaySinh = sc.nextLine();
        while (!Pattern.matches("\\d{2}-\\d{2}-\\d{4}", ngaySinh) || !kiemTraThangHopLe(ngaySinh)) {
            System.out.print("Ngay sinh khong hop le. Vui long nhap lai: ");
            ngaySinh = sc.nextLine();
        }


        System.out.print("Nhap email: ");
        email = sc.nextLine();
        while (!Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)) {
            System.out.print("Email khong hop le. Vui long nhap lai: ");
            email = sc.nextLine();
        }


        System.out.print("Nhap so CMND (9 chu so): ");
        soCMND = sc.nextLine();
        while (!Pattern.matches("\\d{9}", soCMND)) {
            System.out.print("So CMND khong hop le. Vui long nhap lai: ");
            soCMND = sc.nextLine();
        }

        System.out.println("Thong tin hop le!!!!");
        System.out.printf("Ho va ten: %s\nMa nhan vien: %s\nDia chi: %s\nSo dien thoai: %s\nNgay sinh: %s\nEmail: %s\nCMND: %s\n",hoTen,maNhanVien,diaChi,soDienThoai,ngaySinh,email,soCMND);
    }

    private boolean kiemTraThangHopLe(String ngaySinh) {
        String[] parts = ngaySinh.split("-");
        int month = Integer.parseInt(parts[1]);
        return month >= 1 && month <= 12;
    }

    public void run() {
        Bai5 nv = new Bai5();
        nv.nhapThongTin();
    }
}



