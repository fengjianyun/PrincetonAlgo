package ch1.sec1.exercises.exo1_1_28;

import java.util.Arrays;

/**
 * 1.1.28 Remove duplicates. Modify the test client in BinarySearch to remove
 * any duplicate keys in the whitelist after the sort.
 * 
 * @author libojuve@gmail.com
 * 
 */
public class RemoveDuplication {

    /**
     * precondition: a is a sorted array
     * Remove the duplicates in array a and pad the Integer.MAX => not to reallocate a new array
     * 
     * @param a
     *            a sorted array in which remove duplicates
     */
    public static void removeDuplicates(int[] a) {
        int i = a.length - 1;
        while (i >= 0) {
            // find the starting index of duplicates
            int j = i - 1;
            while (j >= 0 && a[i] == a[j]) {
                --j;
            }
            if (i - j > 1) {
                // 将i后元素搬到j + 2
                for (int k = i + 1, m = j + 2; k < a.length && a[k] != Integer.MAX_VALUE; ++k, ++m) {
                    a[k] = a[m];
                    a[k] = Integer.MAX_VALUE;
                }
            }
            i = j;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 3, 5, 5, 5, 8, 9, 10, 12, 12 };
        removeDuplicates(a);
        System.out.println(Arrays.toString(a));
    }
}
