package practice;
import java.util.ArrayList;
import java.util.List;
public class possiblestring {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
            characters.add(c);
        }
        List<String> allStrings = new ArrayList<String>();
        for (Character c : characters) {
            for (Character d : characters) {
                for (Character e : characters) {
                    for (Character f : characters) {
                        String s = "" + c + d + e + f;
                        allStrings.add(s);
                    }
                }
            }
        }
        System.out.println(allStrings);
        System.out.println(allStrings.size()); // 456 976 combinations}
}}
