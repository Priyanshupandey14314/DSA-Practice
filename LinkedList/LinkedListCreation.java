
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
     public static int size = 0; // maintain size

    public void addFirst(int data) {

        Node nd = new Node(data);

        if (head == null) {
            head = tail = nd;
            size++;
            return;
        }

        nd.next = head;
        head = nd;
        size++;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
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
        if(idx == 0){
            addFirst(data);
            return;
        }
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
        size++;
         
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
        if(size==0){return -1;}
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0) return -1;
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp = head;
        int i=0;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next=null;
        tail = temp;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
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
        ll.removeLast();
        ll.print();
        int search = ll.search(5);
        System.out.println(search);
        int recS = ll.recSearch(3);
        System.out.println(recS);
    }
}