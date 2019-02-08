public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{
    private double result;


    @Override
    public void circleArea(Circle circle) {
        result = Math.pow(circle.getR(), 2) * circle.getPi();
    }

    @Override
    public void rectangleArea(Rectangle rectangle) {
        result = rectangle.getA() * rectangle.getB();
    }

    @Override
    public void ballVolume(Ball ball) {
        result = ball.getPi() * Math.pow(ball.getR(), 3) * 4 / 3;
    }

    @Override
    public void cubeVolume(Cube cube) {
        result = Math.pow(cube.getA(),3);
    }
}

