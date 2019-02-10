public class LineCalc {

    /**
     * obicza długość przekazanego jako argument odcinka
     * //długość odcinka ab^2 = (x2 - x1)^2 + (y2 - y1)^2
     */

   public double lineLength(Line2D line){
       return Math.sqrt(Math.pow(line.getX2()-line.getX1(),2) + Math.pow(line.getY2()-line.getY1(),2));   }
}

