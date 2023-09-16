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

        public int itrSearch(int key) {
            if(size == 0) {
                System.out.println("LL is empty!");
                return Integer.MIN_VALUE;
            }

            int i = 0;
            Node temp = head;
            while(temp != null) {
                if(temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
    
        //helper function for recursive search
        public int helper(Node head, int key) {
            if(head == null) {
                return -1;
            }

            if(key == head.data) {
                return 0;
            }

            int idx = helper(head.next, key);
            if(idx == -1) {
                return -1;
            }

            return idx +1;

            

        }

        public int recSearch(int key) {
           return helper(head, key);
        }


        //reversing LL
        public void reverseLL() {
            Node curr = tail = head;
            Node prev = null;
            Node next;

            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
        }

        public int deleteFromEnd(int index) {
            if(head == null) {
                return Integer.MIN_VALUE;
            }
            //calculating size
            int sz = 0;
            Node temp = head;
            while(temp!=null) {
                temp = temp.next;
                sz++;
            }

            //node from end to be deleted if index == to head
            if(index == sz) {
                int val = head.data;
                head = head.next;
                return val;
            }

            //if other than head
            int i = 1;
            int iPrev = size-index;  //caluclating index of previous node to the node to be deleted from the beginning
            Node prev = head;
            while(i<iPrev) {
                prev = prev.next;
                i++;
            }

            //link previous node with the node next to next of deleting node
            int val = prev.next.data;
            prev.next = prev.next.next;
            return val;

        }
        //checking if a LL is palindrome or not
        //method to find min node using slow-fast apprach
        public Node findMid(Node head) {  //helper function
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next !=null) {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }

            return slow; //midNode
        }

        public boolean checkPalindrome() {
            if(head == null  || head.next == null) {
                return true;
            }
            //step1 - > find Mind
            Node midNode = findMid(head);
            //step2 -> reverse second half
            Node curr = midNode;
            Node prev = null;
            Node next;
            
            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev; //right half head
            Node left = head; //left half head

            //step3 -> check left half and right half for palindrome
            while(right != null) {
                if(left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

    public static void main(String args[]) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2, 9);
        // ll.add(0, 10);

        // //printing the linkedList
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.itrSearch(79));

        // System.out.println(ll.recSearch(9));
        // ll.reverseLL();
        // ll.print();

        // ll.add(2, 4);
        // ll.add(2, 6);
        // ll.print();

        // System.out.println(ll.deleteFromEnd(4));
        // ll.print();

        LinkedList newLL = new LinkedList();
        newLL.addFirst(1);
        newLL.addLast(2);
        newLL.addLast(2);
        newLL.addLast(1);
        newLL.print();
        System.out.println(newLL.checkPalindrome());
    }
}