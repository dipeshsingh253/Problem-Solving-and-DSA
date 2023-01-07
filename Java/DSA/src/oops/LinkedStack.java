package oops;

public class LinkedStack {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    int size;
    Node top;

    public LinkedStack() {
        this.size = 0;
        this.top = null;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {

        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        size++;

    }

    public int pop() throws Exception {

        if (isEmpty()) throw new Exception("Stack is empty");

        Node popped = top;

        top = top.next;
        size--;

        return popped.data;

    }


    public int peek() throws Exception {

        if (isEmpty()) throw new Exception("Stack is empty");

        return top.data;
    }

    public static void main(String[] args) throws Exception {

        LinkedStack customStack = new LinkedStack();

        customStack.push(5);
        customStack.push(4);
        customStack.push(3);
        customStack.push(2);
        customStack.push(1);
//        customStack.push(0);

        System.out.println(customStack.size());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
        System.out.println(customStack.size());



    }

    private int size() {
        return size;
    }


}
