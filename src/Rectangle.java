public class Rectangle extends GeometricalShape {
    private double width;
    private double height;


    public Rectangle(double x1, double y1, double width, double height) {
        super(x1, y1);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.shapeCalculator.rectangleArea(this);
    }

}

//Pole prostokąta P = a*b
//Obwód prostokąta O = 2a + 2b