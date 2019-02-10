abstract public class Shape3D extends Shape {
    private double z;
    double volume;
    public Calc3D shapeCalculator;

    public Shape3D(double x1, double y1, double z, double volume) {
        super(x1, y1);
        this.z = z;
        this.volume = volume;
        this.shapeCalculator = new ShapeCalculator();
    }
}
