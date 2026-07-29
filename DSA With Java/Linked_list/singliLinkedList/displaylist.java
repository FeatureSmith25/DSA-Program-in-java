class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
public class displaylist {
    public static void print(Node head){
        // Node temp=head;
        // while(temp!=null){
        //     System.out.println(temp.val);
        //     temp=temp.next;
        // }
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.val);
        }
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

        print(a);
    }
}
