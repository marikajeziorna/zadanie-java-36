public class Ball extends Shape3D {
        private double r;

    public Ball(double x1, double y1, double z, double volume, double r) {
        super(x1, y1, z, volume);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}






