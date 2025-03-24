import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        List<Point2D> listPoint2D=new ArrayList<Point2D>();
        Point2D p1_2D = new Point2D(1.0,4.0);
        Point2D p2_2D = new Point2D(3.0,6.0);
        Point2D p3_2D = new Point2D(4.0,7.0);
        //add elements to the list
        listPoint2D.add(p1_2D);
        listPoint2D.add(p2_2D);
        listPoint2D.add(p3_2D);
        for(Point2D point:listPoint2D){
            System.out.println(point.show());
        }
        //distance calculation
        double sum2D=0.0;
        for(Point2D point:listPoint2D){
            sum2D +=point.distance();
        }
        System.out.println("Distance of Point2D: " +sum2D);

        List<Point3D> listPoint3D=new ArrayList<Point3D >();
        Point3D p1_3D = new Point3D(1.0,4.0,7.0);
        Point3D p2_3D = new Point3D(3.0,6.0,9.0);
        Point3D p3_3D = new Point3D(5.0,7.0,3.0);
//add elements to the list
        listPoint3D.add(p1_3D);
        listPoint3D.add(p2_3D);
        listPoint3D.add(p3_3D);
        for(Point3D point:listPoint3D){
            System.out.println(point.show());
        }
        //distance calculation
        double sum3D=0.0;
        for(Point3D point:listPoint3D){
            sum3D +=point.distance();
        }
        System.out.println("Distance of Point3D: " + sum3D);

        System.out.println("-----------------------------------------------");

        Point2D p4_2D = new Point2D(2.0,-4.0);
        Point2D p5_2D = new Point2D(3.0,7.0);
        Point2D p6_2D = new Point2D(-6.0,7.0);
        Hinh tg1 = new TamGiac(p1_2D,p2_2D,p3_2D);
        Hinh tg2 = new TamGiac(p4_2D,p5_2D,p6_2D);
        System.out.printf("Chu vi 2 tam giac: %.2f - %.2f\n",tg1.perimeter(),tg2.perimeter());
        System.out.printf("Dien tich 2 tam giac: %.2f - %.2f\n",tg1.area(), tg2.area());

        System.out.println("-----------------------------------------------");

        Hinh ch1 = new ChuNhat(5,2);
        Hinh ch2 = new ChuNhat(3 ,7);
        System.out.printf("Chu vi 2 chu nhat: %.2f - %.2f\n",ch1.perimeter(),ch2.perimeter());
        System.out.printf("Dien tich 2 chu nhat: %.2f - %.2f\n",ch1.area(), ch2.area());

        System.out.println("-----------------------------------------------");

        Hinh ht1 = new HinhTron(p1_2D, 3);
        Hinh ht2 = new HinhTron(p2_2D, 8);

        System.out.printf("Chu vi 2 hinh tron: %.2f - %.2f\n",ht1.perimeter(),ht2.perimeter());
        System.out.printf("Dien tich 2 hinh tron: %.2f - %.2f\n",ht1.area(), ht2.area());

        System.out.println("-----------------------------------------------");

        int n;
        System.out.print("Nhap so hinh can nhap: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Hinh[] hinh = new Hinh[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap hinh: (1.Tam giac) (2.Chu nhat) (3.Hinh tron)");
            int option = sc.nextInt();
            switch (option){
                case 1:

                    System.out.print("Nhap 3 diem tam giac: ");
                    Point2D A = new Point2D();
                    Point2D B = new Point2D();
                    Point2D C = new Point2D();
                    A.input(); B.input(); C.input();
                    hinh[i] = new TamGiac(A,B,C);
                    break;

                case 2:

                    System.out.print("Nhap do dai 2 canh: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    hinh[i] = new ChuNhat(a,b);
                    break;

                case 3:

                    System.out.print("Nhap tam va ban kinh: ");
                    Point2D O = new Point2D();
                    O.input();
                    double r = sc.nextDouble();
                    hinh[i] = new HinhTron(O,r);
                    break;

                default:
                    System.out.println("Erorr!!!!!");
            }


        }

        System.out.println("Loai hinh \t| Chu vi \t| Dien tich");
        for(int i = 0; i < n; i++){
            System.out.printf("%s \t| %.2f \t| %.2f\n",hinh[i].type(),hinh[i].perimeter(),hinh[i].area());
        }

    }
}