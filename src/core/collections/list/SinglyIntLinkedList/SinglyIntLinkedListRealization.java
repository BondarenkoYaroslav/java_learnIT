package core.collections.list.SinglyIntLinkedList;

import java.util.Arrays;

public class SinglyIntLinkedListRealization {
    private Node head;
    private int size;

    public void add(int value) {

        if (head != null) {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        } else {
            this.head = new Node(value);
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        int indexPreviousElement = index - 1;
        int currentIndex = 0;
        Node temp = head;

        if (index == currentIndex) {
            head = head.getNext();
            size--;
            return;
        }

        while (temp != null) {
            if (currentIndex == indexPreviousElement) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    @Override
    public String toString() {

        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
