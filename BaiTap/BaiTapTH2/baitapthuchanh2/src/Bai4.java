import java.util.Scanner;

public class Bai4 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.print("Nhap tu can tim: ");
        String x = sc.nextLine();
        if(str.contains(x)){
            System.out.println("Tu \"" + x + "\" co trong chuoi.");
        }
        else {
            System.out.println("Tu \"" + x + "\" khong co trong chuoi.");
        }
    }
}
