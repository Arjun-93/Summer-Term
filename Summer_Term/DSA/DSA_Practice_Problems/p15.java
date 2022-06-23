package DSA.DSA_Practice_Problems;
import java.util.Arrays;

public class p15 {
    //976. Largest Perimeter Triangle
    public static void main(String[] args) {
        p15 obj = new p15();
        int[] nums = {2,1,2};
        double test = obj.Area(nums);
        
        System.out.println(test);

    }
    public int Area(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--)
            if(nums[i]+nums[i+1]>nums[i+2])
                 return nums[i]+nums[i+1]+nums[i+2];
           return 0;
        }
     
}

