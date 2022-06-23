package practice;

public class regularexpressionmatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a*"));;
    }
    
    static boolean isMatch(String s, String p) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==p.charAt(i)){
                if(p.charAt(i+1)=='*'){
                    return true;
                }
            }
            if (p.charAt(i)=='.'){
                if(p.charAt(i+1)=='*'){
                    return true;
                }
            }
        }
        return false;
    }
}
