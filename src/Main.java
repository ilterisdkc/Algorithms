import SortAlgorithms.MergeSort;
import SortAlgorithms.QuickSort;

import java.util.Random;

/**
 * @author ilterisdkc
 */

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Original: " + printIntArray(numbers));

        MergeSort.mergeSort(numbers);
        System.out.println("MergeSorted: " + printIntArray(numbers));

        QuickSort.quickSort(numbers, 0, numbers.length-1);
        System.out.println("QuickSorted: " + printIntArray(numbers));
    }

    private static String printIntArray(int[] numbers) {
        String result = "";
        try {
            for (int number : numbers) {
                result = result + number + " , ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
