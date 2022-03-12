package SearchAlgorithms;

/**
 * @author ilterisdkc
 */
public class BinarySearch {

    public int iterativeBinarySearch(int arr[], int element) {
        int first = 0;
        int last = arr.length-1;

        while (first <= last) {
            int middle = (first+last)/2;
            if (arr[middle] == element) {
                return middle;
            }
            else if (arr[middle] < element) {
                first = middle+1;
            }
            else if (arr[middle] > element) {
                last = middle-1;
            }
        }
        return -1;
    }

    public int recursiveBinarySearch(int[] arr, int first, int last, int element) {

        if (last >= first) {
            int middle = (first+last)/2;
            if (arr[middle] == element) {
                return middle;
            }
            if (arr[middle] > element) {
                return recursiveBinarySearch(arr, first, middle-1, element);
            }
            return recursiveBinarySearch(arr, middle+1, last, element);
        }
        return -1;
    }

}
