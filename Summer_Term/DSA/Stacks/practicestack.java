package DSA.Stacks;

public class practicestack {
    // Driver Code 
    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(7);
        st.top();
        st.pop();
        st.isEmpty();
        
    }
    
}

class Stack{
    
    int[] arr = new int[10];
    int top = -1;

    public void push(int ele){
        top++;
        ele = arr[top];
    }

    public void pop(){
        top--;
    }

    public int top(){
        return arr[top];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        } return false;
    }

    public boolean isFull(){
        if(top==arr.length){
            return true;
        } return false;
    }

}
