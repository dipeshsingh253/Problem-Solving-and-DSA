package oops;

public class CustomStack {

    int size;
    int[] arr;
    int top;

    public CustomStack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public void push(int data) throws Exception {

        if(isFull()){
            throw new Exception("Stack is full");
        }

        arr[++top] = data;

    }

    public int pop() throws Exception {

        if(isEmpty()) throw new Exception("Stack is empty");

        int popped = arr[top];
        arr[top--] = Integer.MIN_VALUE;

        return popped;

    }

    public int peek() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");

        return arr[top];
    }


    public static void main(String[] args) throws Exception {

        CustomStack customStack = new CustomStack(5);

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


}
