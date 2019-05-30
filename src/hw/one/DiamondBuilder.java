package hw.one;

public class DiamondBuilder {
    public static void drawDiamond(int givenNum) {

        int rowLenght = givenNum;
        int stars = 1;
        int space = rowLenght - stars;

        for (int i = 0; i <= rowLenght / 2; i++) {

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
        space = rowLenght - stars;
        stars = rowLenght - space;

        for (int i = 0; i <= rowLenght / 2 - 1; i++) {

            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = rowLenght - stars; k >= 1; k--) {
                System.out.print("*");
            }
            stars -= 2;
            space++;

            System.out.println();
        }
    }
}


