package LinkedList;

public class TheLinkedList<T> {

    Node head;

    public TheLinkedList() {
        head = null;
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete() {
        head=head.next;
    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.println((T)n.value);
            n=n.next;
        }
    }
}
