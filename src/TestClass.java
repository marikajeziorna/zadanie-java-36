
public class TestClass {
    public static void main(String[] args) {

//        Calc2D circle = new Calc2D();
//        circle.circleArea();
//
//        Calc2D calc2D_2 = new Rectangle();
//        calc2D_2.rectangleArea();
//
//        Calc3D calc3D_1 = new Ball(5);
//        calc3D_1.ballVolume();
//
//        Calc3D calc3D_2 = new Cube(5);
//        calc3D_2.cubeVolume();
//
//        LineCalc lineCalc = new LineCalc();
//        lineCalc.lineLenght(lineCalc);

        Circle circle = new Circle(6.6);


        Rectangle rectangle = new Rectangle(6, 7);


        Calc3D calc3D_1 = new Ball(5);
        calc3D_1.getVolume();

        Calc3D calc3D_2 = new Cube(5);
        calc3D_2.getVolume();

        LineCalc lineCalc = new LineCalc();
        lineCalc.lineLenght(lineCalc);
    }
}
