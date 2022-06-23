package DSA.DSA_Practice_Problems;

import java.util.Arrays;

public class p3 {

    // Median of two sorted arrays
    public static void main(String[] args) {
        int[] array1 = { 1, 2 };
        int[] array2 = { 3, 4 };
        solu so = new solu();
        double y = so.copyarray(array1, array2);
        System.out.println(y);
    }}

class solu {
    public double copyarray(int[] nums1, int[] nums2) {
        int aLen = nums1.length;
        int bLen = nums2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(nums1, 0, result, 0, aLen);
        System.arraycopy(nums2, 0, result, aLen, bLen);
        Arrays.sort(result);
        System.out.println("\nlength of merged array : " + result.length);
        // System.out.println(result[(result.length) / 2 - 1]);
        // System.out.println(result[(result.length) / 2]);
        // System.out.println((result.length) % 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        int rLen= result.length;
        
        double ans;
        if(rLen%2 !=0) {
            int targetIndice = ((aLen + bLen) - 1) / 2;
            ans=(double)result[targetIndice];
        }else{
            int targetIndice=rLen/2;
            ans=(double)(result[targetIndice]+result[targetIndice-1])/2;
        }
        return ans;
    }}
