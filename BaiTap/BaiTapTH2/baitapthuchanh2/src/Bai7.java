import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai7 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();


        String[] str = input.split(" ");
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();


        for (String x : str) {
            int num = Integer.parseInt(x);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }


        Collections.sort(evenNumbers);


        Collections.sort(oddNumbers, Collections.reverseOrder());


        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(evenNumbers);
        arr.addAll(oddNumbers);


        System.out.println("Day so da sap xep: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
