package DSA.DSA_Practice_Problems;
import java.util.Arrays;
class p1 {
    public static void main(String[] args) {
   
      int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
      int n = arr.length;

      for (int i = 0; i < n/2 ; i++){
          int temp = arr[i];
          arr[i] = arr[n -i -1];
          arr[n-i-1] = temp;
      }
      System.out.println(Arrays.toString(arr));
    }
   }