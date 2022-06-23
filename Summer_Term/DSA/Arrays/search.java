package DSA.Arrays;

public class search {
    public static void main(String[] args) {
        // Driver code for Linear search
        
    }

    public static void linarSearch(int[] arr, int x){
        // This method do linear search and return index of searched element
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==x){return;}
        }return;}

    public int binarySearch(int[] arr,int l, int h, int x){
        // This method do Binary search and return index of searched element          
        if(h>=1){
            int mid = l+(h-l)/2;
            if (arr[mid]==x){return mid;} 
            if (arr[mid]>x){return binarySearch(arr, l, mid-1, x);}
            return binarySearch(arr, mid+1, h, x);
        }return -1;}}

