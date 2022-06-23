package DSA.DSA_Practice_Problems;

import java.lang.String;

public class p4 {
    // IS palindrome
    public static void main(String[] args) {
        // p4 pal = new p4();
        // int x = -11;
        // pal.isPalindrome(x);
        String s = "   -42";
        String sr = s.trim();
        System.out.println(sr);
        int intVal = Integer.parseInt(sr);
        System.out.println(intVal);

        Integer c = 45;
        String str1 = c.toString();
        System.out.println(str1);
    }
    // // If x is a negative number it is not a palindrome
    // // If x % 10 = 0, in order for it to be a palindrome the first digit should
    // also be 0
    // if (x < 0 || (x != 0 && x % 10 == 0))
    // return false;
    // int res = 0;
    // while (x > res) {
    // res = res * 10 + x % 10;
    // x = x / 10;
    // }
    // // If x is equal to reversed number then it is a palindrome
    // // If x has odd number of digits, dicard the middle digit before comparing
    // with x
    // // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
    // // So, reversedNum/10 = 23, which is equal to x
    // return (x == res || x == res / 10);

    public boolean isPalindrome(int x) {
        // Type casting integer to String.
        String myNumberAsString = String.format("%d", x); // %d converter defines a single decimal integer variable.
        // System.out.println(myNumberAsString);

        // System.out.println(len);
        // char ans = myNumberAsString.charAt(1);
        // System.out.println(myNumberAsString.charAt(0));
        // System.out.println(myNumberAsString.charAt(2));
        int len = myNumberAsString.length();
        for (int i = 0; i < len; i++) {
            if (myNumberAsString.charAt(i) == myNumberAsString.charAt(len - i - 1)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
            }
        }
        return false;
    }
}
