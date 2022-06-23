package DSA.DSA_Practice_Problems;

public class p16 {
    //1822. Sign of the Product of an Array
    public static void main(String[] args) {
        p16 obj = new p16();
        int[] nums= {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int y = obj.arraySign(nums);
        System.out.println(y);
    }

    public int arraySign(int[] nums) {
        // int product = 1;
        // for(int i=0; i<nums.length;i++){
        //     product = product*nums[i];
        // }
        // if (product>0){
        //     return 1;
        // }
        // if(product<0){
        //     return -1;
        // }
        int countneg = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]<0){
                countneg = countneg+1;
            }
            if(nums[i]==0){
                return 0;
            }
        }
        if(countneg%2==0){
            return 1;
        }
        return -1; 
    }}
