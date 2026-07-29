class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class NodeCreation {
    public static void main(String[] args){
        Node a = new Node(10); // Node@7344699f
        Node b = new Node(20); // Node@7344699f
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50);
        System.out.println(a.val);
        System.out.println(a.next);

        a.next=b;        
        b.next=c;        
        c.next=d;        
        d.next=e;

        
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
    }   
}