abstract public class GeometricalShape extends Shape2D {
    public Calc2D shapeCalculator;

    public GeometricalShape(double x1, double y1) {
        super(x1, y1);
        this.shapeCalculator = new ShapeCalculator();
    }
}
