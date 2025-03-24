public class HinhTron extends Hinh{
    private Point2D O;
    private double r;

    public HinhTron(Point2D O, double r){
        this.O = O;
        this.r = r;
    }
    @Override
    public double perimeter(){
        return r*2*Math.PI;
    }
    @Override
    public double area(){
        return r*r*Math.PI;
    }

    @Override
    public String type(){
        return "Hinh tron";
    }
}
