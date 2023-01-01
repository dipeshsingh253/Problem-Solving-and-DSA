package masai;

public class CreateYourOwnStack {


    class stack {
        // complete the class as mentioned in the problem statement
        int top;
        int size;
        int[] arr;

        public stack(int size) {

            this.size = size;
            this.arr = new int[size];
            top = -1;


        }


        boolean push(int el) {

            if (isFull()) return false;

            top++;

            arr[top] = el;

            //   System.out.println(el);

            return true;

        }

        boolean pop() {

            if (isEmpty()) return false;

            int removed = arr[top];
            top--;

            System.out.println(removed);

            return true;

        }


        boolean peek() {


            if (isEmpty()) return false;

            System.out.println(arr[top]);

            return true;
        }

        int size() {
            return top + 1;
        }


        boolean isFull() {
            return top == size - 1;
        }

        boolean isEmpty() {
            return top == -1;
        }

    }

}
