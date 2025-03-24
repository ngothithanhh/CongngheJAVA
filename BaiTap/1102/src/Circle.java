public class Circle {
    private double x,y,r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void show() {
        System.out.printf("x = %.3f, y = %.3f, r = %.3f\n",x,y,r);
    }

    public double chuVi(){
        return Math.PI*2*r;
    }

    public double dienTich(){
        return Math.PI*r*r;
    }


}
