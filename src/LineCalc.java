public class LineCalc {

    /**
     * obicza długość przekazanego jako argument odcinka
     * //długość odcinka ab^2 = (x2 - x1)^2 + (y2 - y1)^2
     */

   public double lineLenght(Line2D line){
      return Math.sqrt(Math.sqrt(line.getX2()-line.getX1()) + Math.sqrt(line.getY2()-line.getY1()));
   }
}

