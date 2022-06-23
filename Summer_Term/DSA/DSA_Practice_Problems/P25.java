package DSA.DSA_Practice_Problems;

public class P25 {

    // Merged Two String
    public static void main(String[] args) {

        P25 obj = new P25();
        String x = obj.mergeAlternately("abc", "pqrst");
        System.out.println(x);
    }
    public String mergeAlternately(String word1, String word2) {
        String str1 = "";
        int i =0;
        int count = 0;
        int x = word1.length()+word2.length();

        int j =0;
        while(count<x){
            if(count%2==0){
                if(i<word1.length()){
                    str1 += word1.charAt(i);
                    i++;
                }
                else{
                    break;
                }

            } else{
                if(j<word2.length()){
                    str1 += word2.charAt(j);
                    j++;
                }
                else{
                    break;
                }
            } count++;
        }
        while(i<word1.length()){
            str1 += word1.charAt(i);
            i++;
        }

        while(j<word2.length()){
            str1 += word2.charAt(j);
            j++;
        }
        return str1;   
    
    }}
    // def mergeAlternately(self, w1, w2): python solution in O(1)
    //     return ''.join(a + b for a, b in zip_longest(w1, w2, fillvalue=''))