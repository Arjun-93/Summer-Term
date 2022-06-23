package DSA.DSA_Practice_Problems;

public class p2 {
  // Two Sums
}

class Solution {
    public static int twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.print("["+i);
                    System.out.print(j+"]");
                }
            }
        }
        return 1;
     }
     public static void main(String[] args) {
        int[] arr = {2,7,5,9};
        int x = 9;
        twoSum(arr, x);
     }
    }
