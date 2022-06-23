package DSA.DSA_Practice_Problems;

public class p14 {
    //191. Number of 1 Bits 
    public static void main(String[] args) {
        p14 obj = new p14();
        int n = 11110111;
        int ans = obj.No_of_bit(n);
        System.out.println(ans);
   
}
public int No_of_bit(int n){
        
    String s = Integer.toBinaryString(n);
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
            sum++;
        }
    }
    return sum;
}
    
}
