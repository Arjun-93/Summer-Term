package DSA.DSA_Practice_Problems;

public class p18 {
    //     public boolean areAlmostEqual(String s1, String s2)
    public static void main(String[] args) {
        String myString = "Hello Friends";
        char[] chars = myString.toCharArray();
        int len = chars.length;
        System.out.println("length of the char array: "+len);
        for (char ch : chars) {
            System.out.println(ch);
        }} 

    public boolean areAlmostEqual(String s1, String s2) {
        if(s1 == s2){
            return true;
        }
        // char[] chars1 = s1.toCharArray();
        // int len1 = chars1.length;
        // char[] chars2 = s2.toCharArray();
        // int len2 = chars2.length;
        // for (char ch : chars1) {
        //     System.out.println(ch);
        // }

        return false;
    }}
