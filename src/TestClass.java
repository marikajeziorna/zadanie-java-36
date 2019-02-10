public class TestClass {
    public static void main(String[] args) {

        Circle circle = new Circle(0, 0, 2);
        circle.getArea();
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rectangle = new Rectangle(0, 0, 2, 2);
        rectangle.getArea();
        System.out.println("Rectangle area:" + rectangle.getArea());

        Ball ball = new Ball(0, 0, 0, 0, 2);
        ball.getArea();
        System.out.println("Ball volume: " + ball.getArea());

        Cube cube = new Cube(0, 0, 0, 0, 2, 2, 2);
        cube.getArea();
        System.out.println("Cube volume: " + cube.getArea());

        Line2D line2D = new Line2D(1, 1, 3, 3);
        line2D.lineCalc();
        System.out.println("Line length: " + line2D.lineCalc());
    }
}
