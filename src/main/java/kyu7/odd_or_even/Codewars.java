package kyu7.odd_or_even;

public class Codewars {
    public static String oddOrEven (final int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res^=array[i];
        }
        return (res & 1) == 0 ? "even" : "odd";
    }
}
