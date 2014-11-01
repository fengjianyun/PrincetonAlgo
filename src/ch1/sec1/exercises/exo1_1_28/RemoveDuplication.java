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
     *            a sorted array in which remove duplicates, not null
     */
    public static int removeDuplicates(int[] a) {
        // 新的长度肯定至少为1
        int newLength = 1;
        for (int i = 1; i < a.length; ++i) {
            // 如果a[i] == a[i - 1]，新数组的长度就不会改变，继续寻找不同元素
            // 如果有不同，那这就是一个新数组中的元素，长度也加一
            if (a[i] != a[i - 1]) {
                a[newLength] = a[i];
                ++newLength;
            }
        }
        return newLength;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 3, 5, 5, 5, 8, 9, 10, 12, 12 };
        // int[] a = { 1, 1, 1, 1, 1 };
        int c = removeDuplicates(a);
        System.out.println(c);
        System.out.println(Arrays.toString(a));
    }
}
