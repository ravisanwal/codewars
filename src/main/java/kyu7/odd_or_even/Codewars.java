package kyu7.odd_or_even;

public class Codewars {
    public static String oddOrEven (final int[] array) {
        int res = 0;
        for (final int item : array) {
            res ^= item;
        }
        return (res & 1) == 0 ? "even" : "odd";
    }
}
