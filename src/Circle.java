public class Circle extends GeometricalShape {
        private double r;

    public Circle(double x1, double y1, double r) {
        super(x1, y1);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return this.shapeCalculator.circleArea(this);
    }
}