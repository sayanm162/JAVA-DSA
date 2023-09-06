public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if(head == null) {
            System.out.println("LL is empty");
        }

        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1 , temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

        }

        public int removeFirst() {
            if(size == 0) {
                System.out.println("LL is empty!");
                return Integer.MIN_VALUE;
                
            }

            if(size==1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
                
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if(size == 0) {
                System.out.println("LL is empty!");
                return Integer.MIN_VALUE;
            }

            if(size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            //going for the second last node prev-2
            Node prev = head;
            int i = 0;
            while(i<size-2) {
                prev = prev.next;
                i++;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;

        }
    


    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.add(0, 10);

        //printing the linkedList
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}