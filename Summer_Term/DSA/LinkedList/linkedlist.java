package DSA.LinkedList;

class linkedList{
    Node head;

    static class Node{
        int value;
        Node next;

        Node(int d){
            value = d;
            next = null;
        }
    }
    public void insertAtBegning(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfterNode(Node prev_node,int data){
        if(prev_node==null){
            System.out.println("Previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    public void insertAtEnd(int data){
        
    }
}


// public class linkedlist {
//     // Implementation of linked list
//     public static void main(String[] args) {
//         LinkedList ll =new LinkedList();
//         ll.head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);

//         ll.head.next = second;
//         second.next = third;

//         while(ll.head!=null){
//             System.out.print(ll.head.value+"-->");
//             ll.head = ll.head.next;
//         }}

//     }



