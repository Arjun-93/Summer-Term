package DSA.DSA_Practice_Problems;
public class p28 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        p28 obj = new p28();
        int x = obj.sumOddLengthSubarrays(arr);
        System.out.println(x);
    }
    public int sumOddLengthSubarrays(int[] A) {
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * A[i];
        }
        return res;
    }}

    // public int sumOddLengthSubarrays(int[] arr) {
    //     int n = arr.length;
    //     //int[] a = new int[n];
    //     int sum = 0;
    //     for (int i = 0; i < n; i++)
    //     {
    //         // j is the number of elements which should be printed
    //         for (int j = i; j <n; j++)

    //         { if(j%2==0){
    //             sum+=arr[j];
    //         }
    //             // print the array from i to j
    //             // for (int k = i; k <= j; k++)
    //             // {
                
    //             //     System.out.print(arr[k]);
    //             // }
    //             // System.out.println();
    //         }
    //     }return sum;
    // }
    // public int ArraySum(int[] arr){
    //     int sum =0;
    //     for(int i=0; i<arr.length; i++){
    //         sum += arr[i];
    //     }
    //     return sum;
    // }
    
