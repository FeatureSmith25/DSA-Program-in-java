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
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    } 
    void remove(){
        Node i=head;
        Node j=head;
        while(j!=null){
            if(i.val==j.val){
                j=j.next;
            }
            else{
                i.next=j;
                i=j;
            }
        }
        i.next=j;
    }
}
public class removedublicates{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(1);
        ll.addAtTail(1);
        ll.addAtTail(1);
        ll.addAtTail(2);
        ll.addAtTail(2);
        ll.addAtTail(3);
        ll.addAtTail(4);
        ll.addAtTail(4);
        ll.addAtTail(4);
        ll.addAtTail(4);
        ll.print();
        ll.remove();
        ll.print();
    }
}