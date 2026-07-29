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
    int size;

    void addAtTail(int val){
        if(tail==null){
            addAthead(val);
            return;
        }
        Node temp=new Node(val);
        tail.next=temp;
        tail=temp;
        size++;
    }
    void addAthead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
        if(head==null) tail=null;
        size--;
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
public class deletionAtHead{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(10);ll.print();
        ll.addAtTail(20);ll.print();
        ll.addAtTail(30);ll.print();
        ll.addAtTail(40);ll.print();
        ll.addAthead(50);ll.print();
        ll.addAthead(60);ll.print();
        ll.deleteAtHead();    ll.print();
    }
}