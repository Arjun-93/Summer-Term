package practice;

public class exceptions {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
          } catch (Exception e) {
            System.out.println("Something went wrong.");
          } finally {
            System.out.println("The 'try catch' is finished.");
          }
          // throw keyword
//The throw statement allows you to create a custom error.
//The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:   
    }
}
