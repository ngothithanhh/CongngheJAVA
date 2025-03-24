public class DuongThang {
    private Diem A, B;

    public DuongThang(Diem A, Diem B){
        this.A = A;
        this.B = B;
    }

    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public double doDaiDuongThang(){
        return Math.sqrt(Math.pow(B.getX() - A.getX(),2) + Math.pow(B.getY() - A.getY(),2));
    }
}
