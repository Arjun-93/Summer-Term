package DSA.DSA_Practice_Problems;

public class p6 {
    // Regular Expression Matching
    public static void main(String[] args) {
        p6 sol = new p6();
        String s = "aa";
        String p = "bb";
        boolean x = sol.matching(s, p);
        System.out.println(x);
    }
    public boolean matching(String s, String p){
        for(int i =0; i<s.length(); i++){
            if (s.charAt(i) == p.charAt(i)){
                return true;
            }
            else if(p.contains("*")){
                return true;
            } else if(p == ".*"){
                return true;
        }}
        return false;
    }}
