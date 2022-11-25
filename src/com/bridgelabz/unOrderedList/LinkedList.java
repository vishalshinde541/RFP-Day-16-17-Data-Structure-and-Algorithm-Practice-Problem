package com.bridgelabz.unOrderedList;

public class LinkedList<K> {
    private Node<K> head;
    private Node<K> tail;

    public void add(K key){
        Node<K> node=new Node<>(key);
        if (head == null) {
            this.head=node;
            this.tail=node;
        } else {
            node.setNext(head);
            head=node;
        }
    }
    public void append(K key){
        Node<K> node=new Node<>(key);
        if (head == null) {
            this.head=node;
        }else {
            this.tail.setNext(node);
        }
        this.tail=node;
    }
    public void print(){
        Node<K> n=head;
        while (!n.equals(tail)){
            System.out.print(n.getData()+ " -> ");
            n=n.getNext();
        }
        System.out.println(tail.getData());

    }
    public K pop(){
        K deleteData = head.getData();
        this.head=head.getNext();
        return deleteData;
    }
    public K popLast(){
        Node tempNode=head;
        while (!(tempNode.getNext().equals(tail))){
            tempNode=tempNode.getNext();
        }
        K deleteData = (K) tempNode.getNext().getData();
        this.tail=tempNode;
        return deleteData;
    }
    public Node<K> search(K searchData){
        Node tempNode=head;
        while (tempNode != null){
            if (!(tempNode.getData().equals(searchData))){
                tempNode=tempNode.getNext();
            }else break;
        }
        return tempNode;
    }
    public void insertAfter(K previousData,K data){
        Node newNode=new Node(data);
        Node<K> tempNode=head;
        while (!tempNode.getData().equals(previousData)){
            tempNode=tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }
    public void delete(K deleteData){
        if (head==null){
            System.out.println("List is empty");
        } else if (head.getNext() == null) {
            if (head.getData().equals(deleteData)) {
                head=null;
            }else {
                System.out.println("data not found");
            }
        }else if (head.getData().equals(deleteData)){
            head=head.getNext();
        } else {
            Node<K> tempNode=head;
            while (tempNode !=tail ){
                if (!tempNode.getData().equals(deleteData)){
                    tempNode=tempNode.getNext();
                }else break;
            }

            Node<K> previousNode=head;
            while (!previousNode.getNext().getData().equals(deleteData)){
                previousNode=previousNode.getNext();
            }
            if (tempNode == tail){
                previousNode.setNext(null);
                tail=previousNode;
            }else
                previousNode.setNext(tempNode.getNext());
        }

    }
    public String toString(){
        String s="";
        Node<K> n=head;
        if (n != null && tail != null){
            while (!n.equals(tail)){
                s=s.concat(n.getData()+ ",");
                n=n.getNext();
            }
            s=s.concat((String) tail.getData());
        }
        return s;
    }
}