package SortAlgorithms;

import java.util.Arrays;

/**
 * @author ilterisdkc
 */
public class MergeSort {

    public static void mergeSort(int[] numbers) {
        int len = numbers.length;

        if (len < 2) {
            return;
        }

        /*
        int[] half1 = new int[len/2];
        int[] half2 = new int[len-len/2];

         */
        int[] half1 = Arrays.copyOfRange(numbers, 0, len/2);
        int[] half2 = Arrays.copyOfRange(numbers, len/2, len);

        /*
        for (int i=0; i<len/2; i++) {
            half1[i] = numbers[i];
        }

        for (int i=len/2; i<len; i++) {
            half2[i-len/2] = numbers[i];
        }
         */
        mergeSort(half1);
        mergeSort(half2);

        merge(numbers, half1, half2);

    }

    private static void merge(int[] inputArr, int[] half1, int[] half2) {
        int size1 = half1.length;
        int size2 = half2.length;

        int i = 0, j = 0, k = 0;

        while (i<size1 && j<size2) {
            if (half1[i] <= half2[j]) {
                inputArr[k] = half1[i];
                i++;
            }
            else {
                inputArr[k] = half2[j];
                j++;
            }
            k++;
        }

        while (i<size1) {
            inputArr[k] = half1[i];
            i++;
            k++;
        }

        while (j<size2) {
            inputArr[k] = half2[j];
            j++;
            k++;
        }
    }

}

