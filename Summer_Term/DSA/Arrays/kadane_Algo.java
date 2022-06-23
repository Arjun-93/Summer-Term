package DSA.Arrays;

/**
 * hello
 */
public class kadane_Algo {

    public static void main(String[] args) {
        kadane_Algo obj = new kadane_Algo();
        int[] a = {-1,-2,3,-4,5,-6};
        int x = obj.maxsumSubArray(a);
        System.out.println("Th maximum sum is: "+x);
    }
    public int maxsumSubArray(int a[]){
        int maxsum = 0;
        int  cursum = 0;
        for (int i =0; i<a.length; i++){
            cursum += a[i];
            if (cursum>maxsum){
                maxsum = cursum;
            }
            if(cursum <0){
                cursum =0;
            }}
        return maxsum;
}}