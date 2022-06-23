package DSA.DSA_Practice_Problems;

public class p21 {
    // put zeores at last and the no.s are in ascending order
    public static void main(String[] args) {
        //283. Move Zeroes
        p21 obj = new p21();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
        int n = nums.length;
        for(int i =0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public void moveZeroes(int[] nums) {
        
        
        int arrLen = nums.length;
        int[] res = new int[arrLen];
        int index = 0;
        for(int num : nums){
            if(num != 0){
                res[index] = num;
                index++;
            }
        }
        
        for(int i = 0; i <arrLen; i++){
            nums[i] = res[i];
        }
    }
    }
