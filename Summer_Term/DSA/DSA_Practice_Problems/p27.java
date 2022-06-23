package DSA.DSA_Practice_Problems;


public class p27 {
    
    public static void main(String[] args) {
        String str =  interpret("G()()(al)");
        System.out.println(str);
    }
    // Goal Parsher
     static String interpret(String command) {
        //HashMap <String,  String> map = new HashMap<String, String>();
        StringBuilder dtr  = new StringBuilder();
        for(int i =0; i<command.length(); i++){
            if(command.charAt(i)=='G'){dtr.append('G');}
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){dtr.append('o');}
            }
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)=='a') {
                    if(command.charAt(i+2)=='l'){
                        if(command.charAt(i+3)==')'){
                            dtr.append("al");
                        }}}}}
            return dtr.toString();
    }}
