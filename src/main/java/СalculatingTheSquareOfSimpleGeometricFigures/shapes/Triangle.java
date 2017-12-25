package СalculatingTheSquareOfSimpleGeometricFigures.shapes;

public class Triangle {

    private final static double CONSTANT_ROOT_OF_THREE = Math.sqrt(3);
    private final static int CONSTANT_DELIMITER = 4;


    public static double getSquare(int side){
        return (CONSTANT_ROOT_OF_THREE * Math.pow(side, 2)) / CONSTANT_DELIMITER;
    }


}
