package ch1.sec1.exercises.exo1_1_15;

import java.util.Arrays;

/**
 * 1.1.15 Write a static method histogram()that takes an array a[] of int values and
 * an integer M as arguments and returns an array of length M whose ith entry is the number
 * of times the integer i appeared in the argument array. If the values in a[] are all
 * between 0 and M–1, the sum of the values in the returned array should be equal to
 * a.length.
 * 
 * @author libojuve@gmail.com
 * 
 */
public class Histogram {
    public static int[] histogram(int[] a, int M) {
        int[] histogram = new int[M];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] >= 0 && a[i] < M) {
                ++histogram[a[i]];
            }
        }

        return histogram;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 10, 1, 2, 4, 8, 10, 15, 100, 250, 7, -3, 20 };
        int[] histogram = histogram(a, 8);
        System.out.println(Arrays.toString(histogram));

        a = new int[] { 1, 3, 5, 0, 7, 10, 1, 2, 4, 8, 10, 15, 7, 20 };
        histogram = histogram(a, 21);
        System.out.println(Arrays.toString(histogram));
        System.out.println("a.length = " + a.length);

        int sum = 0;
        for (int i = 0; i < histogram.length; ++i) {
            sum += histogram[i];
        }
        System.out.println("histogram.sum = " + sum);
    }

}
