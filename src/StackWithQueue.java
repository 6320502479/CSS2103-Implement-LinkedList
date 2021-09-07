public class StackWithQueue {
    private QueueWithLinkedlist q1 = new QueueWithLinkedlist();
    private QueueWithLinkedlist q2 = new QueueWithLinkedlist();

    private int size = 0;

    public void push(Object item) {
        size++;

        q2.enqueue(item);

        while (!q1.isEmpty())
            q2.enqueue(q1.dequeue());

        QueueWithLinkedlist q = q1;
        q1 = q2;
        q2 = q;
    }

    public Object pop() {
        size--;

        if (q1.isEmpty())
            return null;

        return q1.dequeue();
    }

    public Object peek() {

        return q1.front();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void display() {
        System.out.print("display : ");
        System.out.println(q1.toString());
    }

    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.push(66);

        stack.display();

        System.out.println("POP:" + stack.pop());
        stack.display();

        System.out.println("Peek:" + stack.peek());
        stack.display();

        System.out.println("Size:" + stack.size());
        stack.display();

        System.out.println("isEmpty:" + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty:" + stack.isEmpty());
        stack.display();
    }
}
