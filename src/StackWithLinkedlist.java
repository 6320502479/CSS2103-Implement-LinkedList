
public class StackWithLinkedlist extends LinkedList {

    public void push(Object item) {
        add(item);
    }

    public Object pop() {
        if (isEmpty())
            return null;
        Node current = getHead();
        int top = size() - 1;
        for (int i = 0; i < top; i++)
            current = current.getNext();
        remove(top);
        return current.getItem();
    }

    public Object peek() {
        if (isEmpty())
            return null;
        Node current = getHead();
        int top = size() - 1;
        for (int i = 0; i < top; i++)
            current = current.getNext();
        return current.getItem();
    }

    // public int size() extends from LinkedList

    // public int isEmpty() extends from LinkedList

    public static void main(String[] args) {

        StackWithLinkedlist stack = new StackWithLinkedlist();

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
