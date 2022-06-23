package practice;

public class Q1 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1,0,3};
        int k = obj.missingNumber(nums);
        System.out.println(nums.length);
        System.out.println(k);
    }
    
}

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
           int n = nums.length;
           for(int i=0;i<nums.length;i++){
               sum+=nums[i];
           }
           return n*(n+1)/2 - sum ;
       }
}