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

}
