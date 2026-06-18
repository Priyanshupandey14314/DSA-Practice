
public class LinkedListCreation {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        Node nd = new Node(data);

        if (head == null) {
            head = tail = nd;
            return;
        }

        nd.next = head;
        head = nd;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public void add(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
         
    }
    public int getSize(Node head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public int removeLast(){
        
    }

    public static void main(String[] args) {

        LinkedListCreation ll = new LinkedListCreation();

        ll.addFirst(12);
        ll.addFirst(45);
        ll.addLast(3);
        ll.addLast(5);
        ll.add(1, 78);
        ll.addLast(55);
        ll.print();
        int size = ll.getSize(head);
        System.out.println(size);
        ll.removeFirst();
        ll.print();
    }
}