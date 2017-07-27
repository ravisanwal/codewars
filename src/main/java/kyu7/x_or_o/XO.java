package kyu7.x_or_o;

public class XO {

    public static boolean getXO(final String str) {
        return 0 == str
                .toLowerCase()
                .chars()
                .filter(x -> x == 'x' || x == 'o')
                .reduce(0, (a, b) -> b == 'x' ? a + 1 : a - 1);
    }

    public static void main(String[] args) {
        System.out.println(XO.getXO("xo"));
    }
}
