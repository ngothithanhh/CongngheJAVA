package baitap.baitapthuchanh1;
import java.util.Scanner;

/**
 *
 * @author ngoth
 */
public class Bai2 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = Math.pow(2, x);

        System.out.printf("%.1f", y);
    }
}
