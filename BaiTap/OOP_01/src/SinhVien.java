import java.util.Scanner;


public class SinhVien {
    private String hoTen, diaChi, gioiTinh;
    private double diem;

    public SinhVien(){};
    public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVien(String hoTen, String diaChi, String gioiTinh, double diem){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen =  sc.nextLine();
        while (!hoTen.matches("[A-Za-z ]+")){
            System.out.print("Nhap lai ho ten: ");
            hoTen = sc.nextLine();
        }

        System.out.print("Dia chi: ");
        diaChi = sc.nextLine();
        while (!diaChi.matches("^[A-Za-z0-9 ,./-]+$")){
            System.out.print("Nhap lai dia chi: ");
            diaChi = sc.nextLine();
        }

        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        while (!gioiTinh.equals("Nam") && !gioiTinh.equals("Nu") && !gioiTinh.equals("Khac")){
            System.out.print("Nhap lai gioi tinh: ");
            gioiTinh = sc.nextLine();
        }

        System.out.print("Diem: ");
        diem = sc.nextDouble();
        while (diem < 0 || diem > 10){
            System.out.print("Nhap lai diem: ");
            diem = sc.nextDouble();
        }

    }

    public String xepLoai(){
        if(diem < 5){
            return "Trung binh";
        }
        else if(diem >=5 && diem < 8){
            return "Kha";

        }
        else{
            return "Gioi";
        }
    }

    public void xuat(){
        System.out.printf("\t%s|\t%s|\t%s|\t%.2f|\t%s\n",hoTen,diaChi,gioiTinh,diem,xepLoai());

    }
}
