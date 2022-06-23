package practice;
import java.util.HashMap;
public class hasmap {
    public static void main(String[] args) {
        HashMap<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("x", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        // Methods to acess items from roman

        for (String i : roman.keySet()){
            System.out.println(i);
        }
        for (Integer v : roman.values()){
            System.out.println(v);
        }
        for (String e : roman.keySet()) {
            System.out.println("key: " + e + " value: " + roman.get(e));
          }
        // roman.get("I");
        // roman.remove("L");
        // roman.size();
        // roman.clear();
    }
}
