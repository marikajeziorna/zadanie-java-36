public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    private final double pi = 3.14;

    public double getPi() {
        return pi;
    }

    @Override
    public double circleArea(Circle circle) {
        return Math.pow(circle.getR(), 2) * getPi();
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4 * getPi() / 3) * Math.pow(ball.getR(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return (cube.getWidth() * cube.getHeight() * cube.getDeepness());
    }
}

