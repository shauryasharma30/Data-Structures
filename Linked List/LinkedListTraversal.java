package com.company;

import org.w3c.dom.Node;



class LinkedList {

        Node head;

        static class Node{
            Node next;
            int data;
            public Node(int d)//constructor
            {
                data = d;
                next = null;
            }
        }

        public void printList()
        {
         Node n = head;
         while(n!=null) {
             System.out.print(n.data + " ");
         n=n.next;
         }

        }
    public static void main(String[] args) {
       LinkedList a = new LinkedList();

        a.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        a.head.next = second;
        second.next = third;

        a.printList();

    }
}
