public class QueueWithStack {
    private StackWithLinkedlist s1 = new StackWithLinkedlist();
    private StackWithLinkedlist s2 = new StackWithLinkedlist();

    public void enqueue(Object item) {
        while (!s1.isEmpty())
            s2.push(s1.pop());

        s1.push(item);

        while (!s2.isEmpty())
            s1.push(s2.pop());

    }

    public Object dequeue() {
        if (s1.isEmpty())
            return null;

        Object item = s1.peek();
        s1.pop();
        return item;
    }

    public Object front() {
        if (s1.isEmpty())
            return null;
        return s1.getHead();
    }

    // enqueue
    // dequeue
    // front
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
