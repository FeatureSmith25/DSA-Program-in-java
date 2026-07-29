class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
public class get_at_index{
    public static void get(Node head, int idx){
        int x=0;
        Node temp=head;
        while(x<=idx){
            if(x==idx){
                System.out.println(temp.val);
            }
            temp=temp.next;
            x++;
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

        get(a,3);
    }
}
