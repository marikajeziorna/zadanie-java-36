public class Circle extends GeometricalShape {
        private double r;

    public Circle(double r) {
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