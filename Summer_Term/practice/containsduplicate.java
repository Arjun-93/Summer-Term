package practice;

public class containsduplicate {
    public static void main(String[] args) {
        String str = "()(]";
        System.out.println(str);
        int[] digits ={10};
        int n = digits.length;
    
        if(n==1){
            digits[0]=digits[0]+1;
        } else{
            digits[n-1] = digits[n-1]+1;
        }
    }

    // static boolean isValid(String s) {
    //     Stack<Character> st new Stack<Character>();
    //     for(int i :s){
    //         if(s.charAt(i)=='('){
    //             st.push(')');
    //         }
    //         if(s.charAt(i)=='['){
    //             st.push(']');
    //         }
    //         if(s.charAt(i)=='{'){
    //             st.push('}');
    //         }
        // }}
    }
