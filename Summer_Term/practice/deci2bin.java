package practice;
public class deci2bin {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
       sortByBits(num);
    }

    static String[] sortByBits(int[] arr) {
        int n =  arr.length;
        String[] str = new String[n]; 
        for(int i=0; i<n; i++){
            str[i] = Integer.toBinaryString(arr[i]); 
            System.out.print(str[i]+" ");           
        }
        return str;
    }
    // static String bin(int num){
    //     String str ="";
    //     while(num>0){
    //         Integer remainder  = num%2;
    //         String temp = remainder.toString();
    //         str += temp;
    //     }
    //     return str;
    // }
}
