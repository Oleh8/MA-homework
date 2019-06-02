package hw.two;

public class DoSmth {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        return (a & b & !c & !d)||(!a & b & c & !d)||(!a & !b & c & d)
                ||(a & d & !b & !c)||(b & d & !a & !c)||(a & c & !b & !d);
    }

    public static int leapYearCount(int year) {
        int counter=0;
        counter = (year/4)-(year/100)+(year/400);

        return counter;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }
}
