package DSA.Java;

public class attributes {
    // Multiple Attributes
    int x = 5;
    String fname = "Arjun";
    String lname = "Mehra";
    int age = 20;
    //final int x = 15;
    public static void main(String[] args) {
        attributes myObj = new attributes();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
    //The final keyword is called a "modifier"
    }}



















