import javafx.scene.shape.Circle;

public class TestClass {
    public static void main(String[] args) {
        Calc2D calc2D_1 = new Circle(5);
        calc2D_1.circleArea();

        Calc2D calc2D_2 = new Rectangle(6, 5);
        calc2D_2.rectangleArea();

        Calc3D calc3D_1 = new Ball(5);
        calc3D_1.ballVolume();

        Calc3D calc3D_2 = new Cube(5);
        calc3D_2.cubeVolume();

        LineCalc lineCalc = new LineCalc();
        lineCalc.lineLenght(lineCalc);


    }
}
