package ch1.sec2.exercises.exo_1_2_6;

/**
 * 1.2.6 A string <code>s</code> is a circular rotation of a string <code>t</code> if it matches when the characters are
 * circularly shifted by any number of positions;
 * e.g., ACTGACG is a circular shift of TGACGAC, and vice versa. Detecting this condition
 * is important in the study of genomic sequences. Write a program that checks whether
 * two given string s sand t are circular shifts of one another. <br/>
 * <br/>
 * Hint : The solution is a one-liner with indexOf(), length(), and
 * string concatenation.
 * 
 * @author libojuve@gmail.com
 * 
 */
public class CircularRotationDetecter {
    public static void main(String[] args) {
        String str1 = "ACTGACG";
        String str2 = "TGACGAC";

        if (str1.length() == str2.length() && (str1 + str1).indexOf(str2) >= 0) {
            System.out.println("Circular rotation detected");
        }
        else {
            System.out.println("Circular rotation not detected");
        }
    }
}
