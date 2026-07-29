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
    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("invalid index!");
            return;
        }
        if(idx==0) addAthead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }   
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
    void deletion(int idx){
        if(idx<0||idx>=size){
            System.out.println("Invalid index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1) tail=temp;
    }
}
public class deletionatindex{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(10);ll.print();
        ll.addAtTail(20);ll.print();
        ll.addAtTail(30);ll.print();
        ll.addAtTail(40);ll.print();
        ll.addAthead(50);ll.print();
        ll.insert(88, 5);
        ll.addAthead(60);ll.print();
        ll.deleteAtHead();    ll.print();
        ll.deletion(2); ll.print();
    }
}