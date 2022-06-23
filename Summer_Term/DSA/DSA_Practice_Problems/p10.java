package DSA.DSA_Practice_Problems;

public class p10 {
    public static void main(String[] args) {
      // Sort 0s, 1s, 2s of given array
      first fr = new first();
      int[] arr = {0,2,0,1,1,1,2,2,2,1,0,0,0,2,1,1,1};
      int[] temp = fr.sort012(arr); 
      for (int i: temp){
          System.out.print(i+" ");
      }}}

class first{
    // Dutch National Flag Algorithm
    public int[] sort012(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int temp;
        while(mid <= high){
            switch (arr[mid]){
                case 0:{
                    // Swapping
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                }
                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }}}
        return arr;}}
