package DSA.Arrays;

public class Array {
    public static void main(String[] args) {

        // Create Arrays and it Traversal
        int age[] = {8,9,10,11,12};
        System.out.println();

        for(int i=0; i<age.length+1;i++){
            System.out.print(age[i]+" ");
        }
        System.out.println();

        // Arrays Operation 

        // 1. Insertion we have insert 15 at position 3
        for(int i=0; i<age.length;i++){
            if (i==3){
                age[i] = 15;
                System.out.println("New array "+age[i]+" ");
            }
        }



        // 2. Deletion
        // 3. Search
        // 4. Update


    }
}
