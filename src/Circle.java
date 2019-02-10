public class Circle extends GeometricalShape {
        private double r;

    public Circle(double x1, double y1, double area, double area1, double r) {
        super(x1, y1, area, area1);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
//Wzór na pole koła o danym promieniu:
//P = π⋅r2