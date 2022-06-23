package DSA.DSA_Practice_Problems;

public class p23 {
    // Matrix Diagonal Sum
    public static void main(String[] args) {
        // p23 obj = new p23();
        // int[][] mat ={[1,2,3],[4,5,6],[7,8,9]};
        // int x = obj.diagonalSum(mat);
        // System.out.print(x+" ");
        
    }

    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int cursum = 0;
        for(int i=0; i<m; i++){
            int n = mat[i].length;
            for(int j=0; j<n; j++){               
                if(i==j){
                    cursum = cursum+mat[i][j];
                }
                if(j==n){
                    cursum += mat[i][n-1];
                }
                if(i==m){
                    cursum += mat[m-1][j];
                }
            }
        }
        return cursum;
    }
    
}
