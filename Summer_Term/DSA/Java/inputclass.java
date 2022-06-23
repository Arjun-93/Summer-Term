package DSA.Java;
import java.io.*;
//import java.util.Scanner;
public class inputclass{
    public static void main(String[] args) throws IOException{

    // BufferedReader Class to take Input as stream of data as string of characters
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Name : ");
    String str =bf.readLine();// Read String 
    System.out.print("Enter Rollno. : ");  
    int it =Integer.parseInt(bf.readLine());// Read Integer
    System.out.println();
    System.out.println("Entered Name: "+str);
    System.out.println("Entered Rollno.: "+ it);


    // Scanner Class to read input
    //Scanner sc = new Scanner(System.in);
    //System.out.println();
    //System.out.print("Enter Name : ");
    //String str1 = sc.nextLine();
    //System.out.print("Enter Rollno. : "); 
    //int inte = sc.nextInt();
    }
}