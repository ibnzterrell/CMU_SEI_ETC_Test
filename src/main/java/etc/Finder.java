package etc;

import java.util.List;

/**
 * Code Test for CMU SEI ETC
 * @author Terrell Ibanez
 * @version 1.0
 */

public class Finder {
    /**
     * Finds a missing number from a sorted list.
     * @param list Sorted list
     * @return int Missing number
     */
    public static int findMissing(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        int pivot = (start + end) / 2;

        while (end - start > 1) {
            if (list.get(pivot) == list.get(0) + pivot) {
                start = pivot;
            }
            else {
                end = pivot;
            }
            pivot = (start + end) / 2;
        }

        return list.get(start) + 1;
    }
}