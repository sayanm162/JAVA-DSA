class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLL {
    Node head = null;
    Node tail = null;
    

    public boolean isEmpty() {
        return head == null & tail == null;
    }

    //add element
    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

        
    }

    //remove from Queue 
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = head.data;
        if(tail == head) { //single element
            tail=head=null;
        }
        else {
        head = head.next; }
        return front;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = head.data;
        return front;

    }

    


    public static void main(String args[]) {
        QueueUsingLL q = new QueueUsingLL();
        q.add(1);
        q.add(2);
        q.add(3);

        //printing the queue
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
