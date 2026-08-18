class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class update {
    Node head;
    Node tail;
    int size = 0;

    void addathead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
            temp.prev = null;
        }
        size++;
    }

    void addattail(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            temp.next = null;
        }
        size++;
    }

    void addAtIndex(int idx, int val) {
        if (idx < 0 && idx > size) {
            System.out.print("Invalid Index");
            return;
        }
        if (idx == 0) {
            addathead(val);
            return;
        }
        if (idx == size) {
            addattail(val);
            return;
        }
        Node temp = new Node(val);
        Node a = head;
        for (int i = 1; i < idx; i++) {
            a = a.next;
        }
        temp.next = a.next;
        a.next = temp;
        temp.prev = a;
        temp.next.prev = temp;
        size++;
    }

    void deleteathead() {
        if (size == 1 || size == 0) {
            head = tail = null;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteattail() {
        if (size == 1 || size == 0) {
            head = tail = null;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reversePrint() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DLL {
    public static void main(String[] args) {
        update u = new update();
        u.addathead(20);
        u.addathead(30);
        u.addattail(10);
        u.addattail(60);
        u.addAtIndex(3, 50);
        u.print();
    }
}