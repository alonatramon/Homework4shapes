package СalculatingTheSquareOfSimpleGeometricFigures;

import СalculatingTheSquareOfSimpleGeometricFigures.distance.DistanceBetweenPoints;
import СalculatingTheSquareOfSimpleGeometricFigures.shapes.Circle;
import СalculatingTheSquareOfSimpleGeometricFigures.shapes.Rectangle;
import СalculatingTheSquareOfSimpleGeometricFigures.shapes.Triangle;
import СalculatingTheSquareOfSimpleGeometricFigures.temperature.Temperature;

public class Launcher {


    public static void main (String[] args) {

        System.out.println("Square of Circle: " + Circle.getSquare(2));
        System.out.println("Square of Triangle: " + Triangle.getSquare(5));
        System.out.println("Square of Rectangle: " + Rectangle.getSquare(5, 7));

        System.out.println("Fahrenheit: " + Temperature.getFahrenheit(30));
        System.out.println("Celsius: " + Temperature.getCelsius(86));
        System.out.println("Distance Between Points: " + DistanceBetweenPoints.getDistanceBetweenPoints(1,1,2,2));



    }
}


