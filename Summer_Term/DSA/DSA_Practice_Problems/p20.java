package DSA.DSA_Practice_Problems;

public class p20 {
    public static void main(String[] args) {
        //1672. Richest Customer Wealth
    }

    public int maximumWealth(int[][] accounts) {
        
        int cursum = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            int maxsum = 0;
            for (int j = 0; j < accounts[i].length;) {
                maxsum = maxsum + accounts[i][j];
                if (cursum > maxsum) {
                    maxsum = cursum;
                    j++;
                }
                if (cursum < 0) {
                    cursum = 0;
                    j++;
                }return maxsum;
                
            }}
        return cursum;
    }}

    // public int maximumWealth(int[][] accounts) {
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<accounts.length;i++){
    //         int sum=0;
    //         for(int j=0;j<accounts[i].length;j++){
    //             sum+=accounts[i][j];
    //         }
    //         max=Math.max(sum,max);
    //     }
    //     return max;
    // }