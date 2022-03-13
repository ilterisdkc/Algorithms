package SearchAlgorithms;

/**
 * @author ilterisdkc
 *
 * JumpSearch is a search algorithm for sorted arrays
 * Time complexity = O(sqrt(n))
 *
 */
public class JumpSearch {

    public static int jumpSearch(int[] arr, int element) {
        int length = arr.length;
        int step = (int) Math.floor(Math.sqrt(length));

        int prev = 0;
        while (arr[Math.min(step, length)-1] < element) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(length));
            if (prev >= length)
                return -1;
        }

        while (arr[prev] < element) {
            prev++;
            if (prev == Math.min(step, length))
                return -1;
        }

        if (arr[prev] == element)
            return prev;

        return -1;
    }

}
