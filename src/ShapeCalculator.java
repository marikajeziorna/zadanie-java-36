public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{
    @Override
    public void circleArea(Circle circle) {
        double circleP = Math.pow(circle.getR(), 2) * circle.getPi();
    }

    @Override
    public void rectangleArea(Rectangle rectangle) {
        double rectangleP = rectangle.getA() * rectangle.getB();
    }

    @Override
    public void ballVolume(Ball ball) {
        double ballV = ball.getPi() * Math.pow(ball.getR(), 3) * 4 / 3;
    }

    @Override
    public void cubeVolume(Cube cube) {
        Math.pow(cube.getA(),3);
    }
}

