package DSA.Queue;
class queue{
    // Queue has FIFO functionality
    private static int arr[];
    private static int count;
    private static int front;
    private static int rear;
    private static int capacity;

    queue(int size){
        arr =  new int[size];
        capacity = size;
        count = 0;
        front =0;
        rear = 0;
    }

    public boolean isFull(){
        if(rear%capacity==0){return true;}
        return false;
    }
    
    public boolean isEmpty(){
        if(front%capacity==0){return true;} 
            return false;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Queue is Full");
        }arr[rear%capacity]= element;
        rear++;
        count++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        } arr[front%capacity] = -1;// -1 is a dumy variable used to fill the queue
        count--;
        front++;
    }

    public int peek(){
        return arr[front%capacity];
    }
    
    public static void printQueue(){
        int x;
        for(int i=front; i<rear-1; i++){
            x = arr[i%capacity];
            System.out.print(x+" ");
        }}

    public int size(){
        return count;
    }}

    public class Queue {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.push(5);
        q.push(4);
        q.push(3);
        q.push(2);
        q.peek();
        q.size();
        q.push(1);
        q.push(0);
        q.pop();
        q.pop();
        q.pop();
        q.peek();
        q.size();
        q.isEmpty();
        q.isFull();
    }}