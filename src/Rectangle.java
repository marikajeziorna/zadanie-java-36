public class Rectangle extends GeometricalShape {
    private double b;
    private double a;

    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}

//Pole prostokąta P = a*b
//Obwód prostokąta O = 2a + 2b