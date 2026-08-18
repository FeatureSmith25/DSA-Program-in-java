class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class bubble_sort {
    static Node sort(Node head) {
        Node temp = head;
        for (Node i = temp; i != null; i = i.next) {
            for (Node j = i; j != null; j = j.next) {
                if (i.data > j.data) {
                    int t = i.data;
                    i.data = j.data;
                    j.data = t;
                }
            }
        }
        return head;
    }

    static void print(Node head) {
        while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(30);
        Node n2 = new Node(42);
        Node n3 = new Node(33);
        Node n4 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;
        head = sort(head);
        print(head);
    }
}