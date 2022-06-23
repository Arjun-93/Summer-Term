package DSA.Stacks;

// Stack Implementation
class Stacks{
    private static int arr[];
    private static int top;
    private static int capacity;

    Stacks(int size){ //constructor
        arr = new int[size];
        capacity = size;
        top= -1;
    }
    public Boolean isFull(){
        return top == capacity-1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }

    public void push(int x){
        if (isFull()){
         System.out.println("Overflow\nProgram Terminated\n");
        System.exit(1);
        }
        System.out.println("Inserting "+x);
        arr[++top] = x;
     }
     public int pop(){
         if(isEmpty()){
            System.out.println("No more elements to remove\nProgram Terminated\n");
            System.exit(1);  
         }
         return arr[top--];
    }
    public void printStack(){
        for( int i=0; i<top+1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

    // Driver Code
    public class stacl_implementation {
        public static void main(String[] args) {
            Stacks st  = new Stacks(7);
            st.push(1);
            st.push(2);
            st.push(3);
            st.pop();
            st.pop();
            st.pop();            
            st.printStack();
            st.isEmpty();
            st.isFull();
        }
    }
