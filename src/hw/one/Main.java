package hw.one;

public class Main {
    public static void main(String[] args) {
        //Test Diamond:
        DiamondBuilder.drawDiamond(7);
        //Test GameScore:
        System.out.println(GameScore.GameForecastCalculator(2, 1,
                2, 1));
        System.out.println(GameScore.GameForecastCalculator(1, 1,
                3, 3));
        System.out.println(GameScore.GameForecastCalculator(2, 1,
                1, 4));
        //Test PowNumber:
        System.out.println(PowNumber.sqrtNum(4));
        System.out.println(PowNumber.cubeNum(4));
        System.out.println(PowNumber.powNum(4,4));
    }
}
