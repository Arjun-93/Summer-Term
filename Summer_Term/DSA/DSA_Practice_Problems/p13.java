package DSA.DSA_Practice_Problems;

public class p13 {
    //1281. Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        int l = 0;
        while (n > 0) {
          l = n % 10;
          product *= l;
          sum += l;
          n /= 10;
        }
        double ans = product-sum;
        System.out.println(ans);
    }

    
}
