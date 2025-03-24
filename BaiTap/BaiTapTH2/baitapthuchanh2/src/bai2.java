import java.util.Scanner;

public class bai2 {
    Scanner sc = new Scanner(System.in);
    public void run(){
        System.out.print("Nhap mang so nguyen co n phan tu\n");

        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap mang so nguyen: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(tbCong(a)==0){
            System.out.println("Mang khong co phan tu >=0");
        }
        else{
            System.out.printf("Trung binh cong cac phan tu trong mang khong am: %.2f\n",tbCong(a));
        }
        System.out.println("Ds cac phan tu chia het cho 3 nhung khong chia het cho 6");
        inDs1(a);
        System.out.println("Ds cac phan tu la so chinh phuong");
        inDSSoCP(a);
        System.out.println("Cac phan tu trong mang co gia tri bang x");
        inDS3(a);
    }

    public double tbCong(int[] a){
        double s = 0;
        int d = 0;
        for(int x:a){
            if(x >= 0){
                d++;
                s+=(double) x;
            }
        }
        if(d!=0){
            return s/(double) d;
        }
        else {
            return 0;
        }
    }

    public void inDs1(int[] a){
        int d = 0;
        for(int n: a){
            if(n%3 == 0 && n%6!=0){
                d++;
                System.out.printf("%d ",n);
            }
        }
        if(d==0){
            System.out.println("Mang khong co phan tu nao chia het cho 3 ma khong chia het cho 6");
        }
        System.out.println();
    }

    public int ktraSoCP(int a){
        double x = Math.sqrt(a);
        if(x*x == a){
            return 1;
        }
        return 0;
    }

    public void inDSSoCP(int[] a){
        int d = 0;
        for(int x:a){
            if(ktraSoCP(x) == 1){
                d++;
                System.out.printf("%d ",x);
            }
        }
        if(d==0){
            System.out.println("Mang khong co so chinh phuong");
        }
        System.out.println();
    }

    public void inDS3(int[] a){
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();
        int d = 0;
        for(int n:a){
            if(n == x*x){
                d++;
                System.out.printf("%d ",n);
            }
        }
        if(d==0){
            System.out.println("Khong co phan tu nao trong mang bang binh phuong cua x");
        }
        System.out.println();
    }
}
