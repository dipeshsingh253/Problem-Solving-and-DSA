package oops;

public class CustomStack {

    /*
    operations : push , pop, peek
     */

    int[] arr;
    int size;

    int top = -1;

    public CustomStack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public boolean push(int ele){

        if (isFull()) return false;

        top++;
        arr[top] = ele;
        return true;
    }


    public int pop(){
        if (isEmpty()) return -1;

        int removed = arr[top];
        top--;

        return removed;
    }

    public int peek(){
        if (isEmpty()) return -1;

        return arr[top];
    }

    public int size(){
        return top+1;
    }

    private boolean isFull() {
        return top == size-1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(8);
        customStack.push(5);
        customStack.push(4);
        customStack.push(3);
        customStack.push(2);
        customStack.push(1);
        customStack.push(10);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
        System.out.println(customStack.size());



    }
}
