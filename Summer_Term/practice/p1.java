package practice;
import java.io.*;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n =5;
        String arr[];
        arr = new String[7];
        for(int i =0; i<n+1;i++){
            String str =bf.readLine();
            arr[i] = str; 
            System.out.println(arr[i]+" ");
        }}}