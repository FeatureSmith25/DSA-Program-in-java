class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
public class recursive_display{
    public static void rec_print(Node head){
        Node temp=head;
        if(temp==null) return;
        System.out.print(temp.val+" ");
        rec_print(temp.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(100);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        rec_print(a);
    }
}
