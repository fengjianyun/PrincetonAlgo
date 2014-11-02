package ch1.sec1.exercises.exo1_1_29;

/**
 * 1.1.29 Equal keys. Add to BinarySearch a static method rank() that takes a key and
 * a sorted array of int values (some of which may be equal) as arguments and returns the
 * number of elements that are smaller than the key and a similar method count() that
 * returns the number of elements equal to the key. Note: If i and j are the values returned
 * by rank(key, a) and count(key, a) respectively, then a[i..i+j-1] are the values in
 * the array that are equal to key.
 * 
 * @author libojuve@gmail.com
 * 
 */
public class EqualKeys {
    public static int rank(int key, int[] a) {
        int d = 0;
        int f = a.length - 1;

        while (d <= f) {
            int m = d + (f - d) / 2;
            if (a[m] < key) {
                d = m + 1;
            }
            else if (a[m] > key) {
                f = m - 1;
            }
            else {
                f = m;
            }

            if (d < a.length) {
                if (a[d] == key) {
                    return d;
                }
            }
        }
        return -1;
    }

    public static int count(int key, int[] a) {
        int i = rank(key, a);
        int count = 0;
        if (i >= 0) {
            while (i < a.length && a[i] == key) {
                ++i;
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        test11();
    }


    private static void test1() {
        int[] a = { 1 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
    }

    private static void test2() {
        int[] a = { 1, 2 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
    }

    private static void test5() {
        int[] a = { 1, 1 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
    }

    private static void test6() {
        int[] a = { 1, 1, 3 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
    }

    private static void test7() {
        int[] a = { 1, 3, 3 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
    }

    private static void test8() {
        int[] a = { 1, 1, 1 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
    }

    private static void test3() {
        int[] a = { 1, 2, 3 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
    }

    private static void test4() {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
        System.out.println(rank(5, a));
    }


    private static void test9() {
        int[] a = { 1, 1, 3, 4 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
        System.out.println(rank(5, a));
    }

    private static void test10() {
        int[] a = { 1, 2, 2, 4 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
        System.out.println(rank(5, a));
    }

    private static void test11() {
        int[] a = { 1, 2, 3, 3 };
        System.out.println(rank(0, a));
        System.out.println(rank(1, a));
        System.out.println(rank(2, a));
        System.out.println(rank(3, a));
        System.out.println(rank(4, a));
        System.out.println(rank(5, a));
    }
}
