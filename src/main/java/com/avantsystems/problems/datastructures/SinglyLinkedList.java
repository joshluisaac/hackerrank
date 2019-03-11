package com.avantsystems.problems.datastructures;

public class SinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size = 0;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    void add(T t) {
        Node<T> node = new Node<>();
        node.setValue(t);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    void addFirst(T t) {
        Node<T> node = new Node<>();
        node.setValue(t);
        if (head != null) {
            node.setNext(head);
            head = node;
            size++;
        }
    }


    void addLast(T t) {
        Node<T> node = new Node<>();
        node.setValue(t);
        if (tail != null) {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    //Retrieves and removes the head (first element) of this list.
    void remove(){
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    void removeLast(){
        if(tail != null) {

        }

    }


    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("josh");
        list.add("josh2");
        list.add("josh3");
        list.add("josh4");
        list.addFirst("josh0");
        //System.out.println(list.toString());
        list.addLast("josh9");
        //System.out.println(list.toString());
        //list.remove();
        //System.out.println(list.toString());

        Node temp = list.head;
        System.out.println(temp.hashCode());
        System.out.println(list.head.hashCode());
        System.out.println("Tail hashcode " + list.tail.hashCode());


        while (temp.getNext() != null){
            //System.out.println(temp.getNext());
            temp = temp.getNext();
            System.out.println(temp.hashCode());
        }

        Node n = new Node();
        n.setValue(200);

        temp.setNext(n);
        temp = n;

        System.out.println(list.toString());
        System.out.println(temp.toString());

        //System.out.println(list.head.getNext().getNext());
        //System.out.println(list.tail.getNext());
        //System.out.println(list.tail.getValue());

        //System.out.println(list.getSize());
    }


}
