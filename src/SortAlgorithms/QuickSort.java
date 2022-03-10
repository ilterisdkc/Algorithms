package SortAlgorithms;

/**
 * @author ilterisdkc
 */
public class QuickSort {
    public static void quickSort(int[] numbers, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int selected = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (numbers[leftPointer] <= selected && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (numbers[rightPointer] >= selected && leftPointer < rightPointer) {
                rightPointer--;
            }

            int temp = numbers[leftPointer];
            numbers[leftPointer] = numbers[rightPointer];
            numbers[rightPointer] = temp;

        }
        int temp = numbers[leftPointer];
        numbers[leftPointer] = numbers[highIndex];
        numbers[highIndex] = temp;

        quickSort(numbers, lowIndex, leftPointer-1);
        quickSort(numbers, leftPointer+1, highIndex);

    }

    private static void swapNums(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

}
