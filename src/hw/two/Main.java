package hw.two;

public class Main {

    public static void main(String[] args) {

        System.out.println("ffff " + HomeWorkTwo.booleanExpression(false, false, false, false));
        System.out.println("ffft " + HomeWorkTwo.booleanExpression(false, false, false, true));
        System.out.println("fftf " + HomeWorkTwo.booleanExpression(false, false, true, false));
        System.out.println("fftt " + HomeWorkTwo.booleanExpression(false, false, true, true) + " <- ");

        System.out.println("ftff " + HomeWorkTwo.booleanExpression(false, true, false, false));
        System.out.println("ftft " + HomeWorkTwo.booleanExpression(false, true, false, true) + " <- ");
        System.out.println("fttf " + HomeWorkTwo.booleanExpression(false, true, true, false) + " <- ");
        System.out.println("fttt " + HomeWorkTwo.booleanExpression(false, true, true, true));

        System.out.println("tfff " + HomeWorkTwo.booleanExpression(true, false, false, false));
        System.out.println("tfft " + HomeWorkTwo.booleanExpression(true, false, false, true) + " <- ");
        System.out.println("tftf " + HomeWorkTwo.booleanExpression(true, false, true, false) + " <- ");
        System.out.println("tftt " + HomeWorkTwo.booleanExpression(true, false, true, true));

        System.out.println("ttff " + HomeWorkTwo.booleanExpression(true, true, false, false) + " <- ");
        System.out.println("ttft " + HomeWorkTwo.booleanExpression(true, true, false, true));
        System.out.println("tttf " + HomeWorkTwo.booleanExpression(true, true, true, false));
        System.out.println("tttt " + HomeWorkTwo.booleanExpression(true, true, true, true));

        System.out.println(HomeWorkTwo.doubleExpression(0.1,0.2,0.3));
    }
}
