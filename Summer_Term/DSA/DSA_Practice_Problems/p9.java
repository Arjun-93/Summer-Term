package DSA.DSA_Practice_Problems;
import java.util.*;
public class p9 {
    // Wave Array
    // Input array = {1,2,3,4,5}
    // output array = {2,1,4,3,5}
    public static void main(String[] args) {
        // Solution ob = new Solution();
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        Solution.convertToWave(n, arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        Arrays.sort(a);
        for (int i=0; i<n-1; i += 2)
            swap(a, i, i+1);
        // for (int  i : a)
        //     System.out.print(i+" ");
    }
    static void swap(int a[], int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }}
        

