package ch1.sec1.exercises.exo1_1_14;

/**
 * 1.1.14 Write a static method lg() that takes an int value N as argument and returns
 * the largest int not larger than the base-2 logarithm of N. Do not use Math.
 * 
 * @author libojuve@gmail.com
 * 
 */
public class LgN {

    /**
     * 求不大于Log2N的最大整数
     * 
     * @param N
     * @return 返回不大于log2N的最大整数
     */
    public static int lg(int N) {
        int n = 1;
        int i = 0;
        while (n < N) {
            n <<= 1;
            ++i;
        }
        if (n > N) {
            n >>= 1;
            --i;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(lg(10));
        System.out.println(lg(8));
    }
}
