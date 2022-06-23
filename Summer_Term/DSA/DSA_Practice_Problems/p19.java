package DSA.DSA_Practice_Problems;
import java.util.*;
public class p19 {
    // 202. Happy Number
    public static void main(String[] args) {
        

    }
    public boolean IsHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1) {
            int result = 0;
            while (n != 0) {
                result += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (set.contains(result)) {
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }
    static boolean isHappy(int n) {
        String string_number = Integer.toString(n);
  
        // Traversing through the string using for loop
        
        for (int i = 0; i < string_number.length(); i++) {
            for( int j =0; j<=9; j++){
                double y = (string_number.charAt(i)-j)*(string_number.charAt(i)-j) + (string_number.charAt(i+1)+j)*(string_number.charAt(i+1)+j);
                if( y==1) return true;
            }}
    return false;
}}
