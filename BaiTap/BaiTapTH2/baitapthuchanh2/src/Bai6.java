import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Bai6 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int x = rand.nextInt(81)+10;
            arr.add(x);
            if(x % 10 == 2 || x % 10 == 4 || x % 10 == 6){
                arr2.add(x);
            }
        }
        System.out.print("Mang vua them vao: ");
        for(int X:arr){
            System.out.printf("%d ",X);
        }
        System.out.println();
        System.out.print("Mang vua them vao: ");
        for(int N:arr2){
            System.out.printf("%d ",N);
        }
        System.out.println();
    }
}
