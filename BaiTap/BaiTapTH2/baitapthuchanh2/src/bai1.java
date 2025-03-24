import java.util.Scanner;

public class bai1 {
    public void run(){
        double a[] =  new double[5];
        System.out.println("Nhap mang so thuc gom 5 phan tu: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextDouble();

        }
        output(a);
        sort(a);
        System.out.print("Mang sau khi sap xep theo thu tu tang dan: ");
        output(a);
        System.out.printf("Phan tu lon nhat cua mang: %.2f\n",a[4]);
        System.out.printf("Phan tu nho nhat cua mang: %.2f\n", a[0]);

    }

    public void output(double[] a){
        System.out.print("Mang gom 5 phan tu: ");
        for(double x: a){
            System.out.printf("%.2f ",x);
        }
        System.out.println();
    }

    public void sort(double[] a){
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                if(a[i] > a[j]){
                    double x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }


}
