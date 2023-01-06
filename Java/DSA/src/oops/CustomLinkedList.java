package oops;

import java.util.NoSuchElementException;

public class CustomLinkedList {
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    public void removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {


        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.addFirst(4);
        customLinkedList.addFirst(5);




    }


}
