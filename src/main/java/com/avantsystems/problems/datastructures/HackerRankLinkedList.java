package com.avantsystems.problems.datastructures;

public class HackerRankLinkedList {


    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

    }


    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        HackerRankLinkedList.SinglyLinkedListNode newNode = new HackerRankLinkedList.SinglyLinkedListNode(data);
        HackerRankLinkedList.SinglyLinkedListNode tail = head;

        if (head == null) {
            head = newNode;
        } else {
            while (tail.next != null){
                tail = tail.next;
            }
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        HackerRankLinkedList l = new HackerRankLinkedList();
        HackerRankLinkedList.insertNodeAtTail(null, 89);

    }


}
