abstract public class Shape2D extends Shape{
   private double area;

    public Shape2D(double x1, double y1, double area) {
        super(x1, y1);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
