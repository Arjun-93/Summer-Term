package DSA.DSA_Practice_Problems;

import java.util.Arrays;

public class p17 {
    // 1502. Can Make Arithmetic Progression From Sequence
    public static void main(String[] args) {
        p17 obj = new p17();
        int[] arr = { 1, 2, 3 };
        System.out.println(obj.canMakeArithmeticProgression(arr));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int j = 1;
        int x = Math.abs(arr[0]-arr[1]);
        for(int i = 0; i <arr.length-1 && j< arr.length; i++)
        {
            if(Math.abs(arr[i]-arr[j]) != x)
            {

                return false;
            }
            j++;
        }
        return true;
    }
}