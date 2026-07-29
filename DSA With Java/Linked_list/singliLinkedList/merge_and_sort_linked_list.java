class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Linked_list{
    Node head;
    Node tail;
    int size=0;
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
}

public class merge_and_sort_linked_list{
    public static void merge(Node head1, Node head2){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node i=head1;
        Node j=head2;
        while(i!=null && j!=null){
            if(i.val<j.val){
                t.next=i;
                i=i.next;
            }
            else{
                t.next=j;
                j=j.next;
            }
            t=t.next;
        }
        while(i!=null){
            t.next=i;
            i=i.next;
            t=t.next;
        }
        while(j!=null){
            t.next=j;
            j=j.next;
            t=t.next;
        }
        Node temp=dummy.next;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();

        l1.addAtTail(10);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(60);
        l1.print();

        l2.addAtTail(20);
        l2.addAtTail(50);
        l2.addAtTail(70);
        l2.addAtTail(80);
        l2.addAtTail(90);
        l2.print();

        merge(l1.head, l2.head);
    }
}