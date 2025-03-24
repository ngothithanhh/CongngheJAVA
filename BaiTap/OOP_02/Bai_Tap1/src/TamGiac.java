public class TamGiac extends Hinh {
    private Point2D A,B,C;

    public TamGiac(Point2D A, Point2D B, Point2D C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    @Override
    public double perimeter(){
        double dtAB = A.distance(B.getX(),B.getY());
        double dtAC = A.distance(C.getX(),C.getY());
        double dtBC = B.distance(C.getX(), C.getY());

        return dtAB + dtAC + dtBC;
    }
    @Override
    public double area(){
        double dtAB = A.distance(B.getX(),B.getY());
        double dtAC = A.distance(C.getX(),C.getY());
        double dtBC = B.distance(C.getX(), C.getY());

        double p = dtAB + dtAC + dtBC;

        return Math.sqrt(p*(p-dtAB)*(p-dtAC)*(p-dtBC));
    }

    @Override
    public String type(){
        return "Tam giac";
    }
}
