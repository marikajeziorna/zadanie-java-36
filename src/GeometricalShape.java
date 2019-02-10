abstract public class GeometricalShape extends Shape2D {
    private Calc2D shapeCalculator;

    public GeometricalShape(double x1, double y1, Calc2D shapeCalculator) {
        super(x1, y1);
        this.shapeCalculator = shapeCalculator;
    }

    @Override
    public double getX1() {
        return super.getX1();
    }

    @Override
    public void setX1(double x1) {
        super.setX1(x1);
    }

    @Override
    public double getY1() {
        return super.getY1();
    }

    @Override
    public void setY1(double y1) {
        super.setY1(y1);
    }
}
