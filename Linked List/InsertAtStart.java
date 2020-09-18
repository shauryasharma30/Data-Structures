package com.company;


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;

    }
}
class LinkedList{
    Node head;
    public void printlist(){
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return x;
    }

}
class Main{

    public static void main(String[] args) {
        LinkedList a = new LinkedList();

        a.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        a.head.next = second;
        second.next = third;
        a.printlist();
        a.insert(a,4);
        System.out.println();
        System.out.println("We insert 4 to the beginning:");
        a.printlist();
        a.insert(a,5);
        System.out.println();
        System.out.println("We insert 5 to the beginning:");
        a.printlist();

    }
}