package DSA.DSA_Practice_Problems;

public class p11 {
    // // Search Insert position
    // int[] arr = {1,2,3,4,5,6};
    // BinarySearch search =  new BinarySearch();
    // int z = search.binarySearch(arr,5);
    // if(z==-1){
    //     System.out.println("Element Not Found");
    // } else{System.out.println("Elemnt found at: "+z);}
}

class BinarySearch{
    public int binarySearch(int[] arr, int x){
        int low =0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        if (arr[mid]>x){
            high = mid-1;
            return binarySearch(arr, x);
        }  
        if(arr[mid]<x){
            low = mid+1;
            return binarySearch(arr, x);
        }
        return -1;
    }
}