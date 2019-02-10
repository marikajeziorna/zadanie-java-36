abstract public class GeometricalShape extends Shape2D {
    double area;

    public GeometricalShape(double x1, double y1, double area, double area1) {
        super(x1, y1, area);
        this.area = area1;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }
}
