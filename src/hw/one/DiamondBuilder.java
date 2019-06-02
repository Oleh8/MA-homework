package hw.one;

public class DiamondBuilder {
    public static void drawDiamond(int givenNum) {


        int stars = 1;
        int space = givenNum - stars;

        for (int i = 0; i <= givenNum / 2; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            stars += 2;
            space--;
            System.out.println();
        }

        for (int i = 0; i <= givenNum / 2; i++) {
            stars -= 2;
            space++;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}