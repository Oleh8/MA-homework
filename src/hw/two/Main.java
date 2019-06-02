package hw.two;

public class Main {

    public static void main(String[] args) {

        System.out.println("ffff " + DoSmth.booleanExpression(false, false, false, false));
        System.out.println("ffft " + DoSmth.booleanExpression(false, false, false, true));
        System.out.println("fftf " + DoSmth.booleanExpression(false, false, true, false));
        System.out.println("fftt " + DoSmth.booleanExpression(false, false, true, true) + " <- ");

        System.out.println("ftff " + DoSmth.booleanExpression(false, true, false, false));
        System.out.println("ftft " + DoSmth.booleanExpression(false, true, false, true) + " <- ");
        System.out.println("fttf " + DoSmth.booleanExpression(false, true, true, false) + " <- ");
        System.out.println("fttt " + DoSmth.booleanExpression(false, true, true, true));

        System.out.println("tfff " + DoSmth.booleanExpression(true, false, false, false));
        System.out.println("tfft " + DoSmth.booleanExpression(true, false, false, true) + " <- ");
        System.out.println("tftf " + DoSmth.booleanExpression(true, false, true, false) + " <- ");
        System.out.println("tftt " + DoSmth.booleanExpression(true, false, true, true));

        System.out.println("ttff " + DoSmth.booleanExpression(true, true, false, false) + " <- ");
        System.out.println("ttft " + DoSmth.booleanExpression(true, true, false, true));
        System.out.println("tttf " + DoSmth.booleanExpression(true, true, true, false));
        System.out.println("tttt " + DoSmth.booleanExpression(true, true, true, true));


    }
}
