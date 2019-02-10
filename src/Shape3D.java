abstract public class Shape3D extends Shape {
    private double z;
    double volume;

    public Shape3D(double x1, double y1, double z, double volume) {
        super(x1, y1);
        this.z = z;
        this.volume = volume;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
