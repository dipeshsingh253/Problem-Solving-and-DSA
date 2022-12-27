package linkedlist;

import java.util.LinkedList;

public class CustomLinkedList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        private Node head;
        private Node tail;
        private int size;

    }



}
