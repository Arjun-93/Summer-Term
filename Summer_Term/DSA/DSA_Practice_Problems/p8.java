package DSA.DSA_Practice_Problems;

public class p8 {
    public static int main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int a = dividend / divisor;
        return a;
    }

}
