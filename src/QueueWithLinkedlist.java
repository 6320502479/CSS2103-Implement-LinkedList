public class QueueWithLinkedlist extends LinkedList {

    public void enqueue(Object item) {
        add(item);
    }

    public Object dequeue() {
        if (isEmpty())
            return null;
        Node current = front();
        remove(0);
        return current.getItem();
    }

    public Node front() {
        if (isEmpty())
            return null;
        return getHead();
    }

    // public int size() extends from LinkedList
    // public int isEmpty() extends from LinkedList

    public static void main(String[] args) {
        QueueWithLinkedlist queue = new QueueWithLinkedlist();
        queue.enqueue(5);
        queue.display();

        queue.enqueue(4);
        queue.display();

        queue.enqueue(3);
        queue.display();

        System.out.println("dequeue : " + queue.dequeue());
        queue.display();

        System.out.println("dequeue : " + queue.dequeue());
        queue.display();
    }
}
