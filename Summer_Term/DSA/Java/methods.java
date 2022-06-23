package DSA.Java;

public class methods {
    // Here we see that why we use static and public methods
    static void Staticmethod(){
        System.out.println("\nStatic methods can be called without creating objects");
    }
    
    public void Publicmethod(){
        System.out.println("Public methods must be called by creating objects\n");
    }

    // public static void main(String[] args) {
    //     Staticmethod();// calling static method 
    //     // Publicmethod(); this will result an error 
    //     // to acess public method we have to make objects, below we go 
    //     methods obj = new methods();
    //     obj.Publicmethod();
    // }}
 // Multiple classes example

 class second{
    public static void main(String[] args) {
        methods obj1 = new methods();
        obj1.Publicmethod();
    }
    }}