package hw.three;

public class SortTwoArrays {
    public static int[] mergeArrays(int arrOne[], int arrTwo[]) {

        int[] mergedArray = new int[arrOne.length + arrTwo.length];
        int arrOneKey = 0;
        int arrTwoKey = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (arrOneKey < arrOne.length && arrTwoKey < arrTwo.length) {
                if (arrOne[arrOneKey] < arrTwo[arrTwoKey]) {
                    mergedArray[i] = arrOne[arrOneKey];
                    arrOneKey++;
                } else {
                    mergedArray[i] = arrTwo[arrTwoKey];
                    arrTwoKey++;
                }
            } else if (arrOneKey < arrOne.length) {
                mergedArray[i] = arrOne[arrOneKey];
                arrOneKey++;
            } else if (arrTwoKey < arrTwo.length) {
                mergedArray[i] = arrTwo[arrTwoKey];
            }
        }
        return mergedArray;
    }
}
