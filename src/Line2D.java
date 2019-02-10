public class Line2D extends Shape2D {
    public LineCalc shapeCalculator;
    private double x2;
    private double y2;


    public Line2D(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.shapeCalculator = new ShapeCalculator();

    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double lineCalc() {
        return shapeCalculator.lineLength(this);
    }
}


