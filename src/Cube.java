public class Cube extends Shape3D {
   private double width;
   private double height;
   private double deepness;

    public Cube(double x1, double y1, double z, double volume, double width, double height, double deepness) {
        super(x1, y1, z, volume);
        this.width = width;
        this.height = height;
        this.deepness = deepness;
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

    public double getDeepness() {
        return deepness;
    }

    public void setDeepness(double deepness) {
        this.deepness = deepness;
    }
}



//Objętość V = a^3
//Pole całkowite Pc = 6a^2