class Node{
    int val; 
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void addAthead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Linked_List_Datastructure {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(10);ll.print();
        ll.addAtTail(20);ll.print();
        ll.addAtTail(30);ll.print();
        ll.addAtTail(40);ll.print();
        ll.addAthead(50);ll.print();
        ll.addAthead(60);ll.print();

    }
}