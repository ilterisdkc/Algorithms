import SearchAlgorithms.JumpSearch;
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

        int element = 57;
        System.out.println("JumpSearch for 57: " + JumpSearch.jumpSearch(numbers, element));
    }

    private static String printIntArray(int[] numbers) {
        StringBuilder result = new StringBuilder();
        try {
            for (int number : numbers) {
                result.append(number).append(" , ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}
