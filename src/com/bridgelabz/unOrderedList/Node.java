package com.bridgelabz.unOrderedList;

public class Node<K> {
    private K data;
    private Node next;

    public Node(K data) {
        this.data = data;
        this.next = null;
    }

    public K getData() {
        return data;
    }

    public void setData(K data) {
        this.data = data;
    }

    public Node<K> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}