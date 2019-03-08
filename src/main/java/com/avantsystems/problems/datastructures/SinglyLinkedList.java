package com.avantsystems.problems.datastructures;

public class SinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public SinglyLinkedList(){
        head = null;
        tail = null;
    }

    void add(T t) {
        Node<T> node = new Node<>();
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }



}
