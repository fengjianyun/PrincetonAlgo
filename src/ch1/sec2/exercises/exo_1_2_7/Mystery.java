package ch1.sec2.exercises.exo_1_2_7;

public class Mystery {

    public static void main(String[] args) {
        System.out.println(mystery("Hello"));
        System.out.println(mystery("abcd"));
    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) {
            return s;
        }
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }
}
