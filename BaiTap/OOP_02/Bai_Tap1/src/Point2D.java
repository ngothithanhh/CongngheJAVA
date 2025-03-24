import java.util.Scanner;

public class Point2D {

    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

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

    public void input(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    public String show() {
        return "Point2D [" + this.x + "," + this.y + "]";
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(double x, double y) {
        double dx = (this.getX() - x);
        double dy = (this.getX() - y);
        return Math.sqrt(dx * dx + dy * dy);
    }
}