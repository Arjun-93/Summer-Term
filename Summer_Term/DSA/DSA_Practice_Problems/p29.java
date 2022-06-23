package DSA.DSA_Practice_Problems;

public class p29 {
    public static void main(String[] args) {
        int[] A = {4,1,2,1,2};
        singleNumber(A);
        
        
    }
    static int singleNumber(int[] A) {

        int n = A.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans ^= A[i];
            System.out.println(ans);
        }
        return ans;

    }
    
}
