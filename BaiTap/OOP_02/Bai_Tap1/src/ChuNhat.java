public class ChuNhat extends Hinh{
    private double a, b;

    public ChuNhat(double a, double b){
        this.a  = a;
        this.b = b;
    }
    @Override
    public double perimeter(){
        return (a+b)*2;
    }
    @Override
    public double area(){
        return a*b;
    }

    @Override
    public String type(){
        return "Chu nhat";
    }
}
