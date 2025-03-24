public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");

        Circle c1 = new Circle(3,5,6);
        c1.show();
        Circle c2 = new Circle(4,5,8);
        c2.show();

        System.out.printf("Chu vi c1 = %.3f\n",c1.chuVi());
        System.out.printf("Dien tich c1 = %.3f\n",c1.dienTich());

        System.out.printf("Chu vi c2 = %.3f\n",c2.chuVi());
        System.out.printf("Dien tich c2 = %.3f\n",c2.dienTich());
    }
}