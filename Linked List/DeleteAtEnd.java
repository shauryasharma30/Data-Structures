package com.company;
class Node{
    int data;
    Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}
class LinkedList{
    Node head;
    public void printlist(LinkedList x){
        Node n = x.head;
        while (n!=null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        if(head == null){           //to insert if list is empty
            x.head = newNode;
        }
        else {                      //insert at end
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
        return x;
    }
    LinkedList deleteEnd(LinkedList x){
        if(head == null)           //list is empty
        {
            System.out.println("Empty list");
            return x;
        }
        if(head.next == null)      //list only has a single node
        {
            x.head = null;
            return x;
        }
        Node t = head;
        while(t.next.next!=null){
            t=t.next;
        }
        t.next = null;
        return x;

    }
}
class Main {

    public static void main(String[] args) {
	LinkedList a = new LinkedList();
	a.insert(a,1);
	a.insert(a,2);
	a.insert(a,3);
	a.printlist(a);
        System.out.println();
        System.out.println("Delete 3 from the end");
        a.deleteEnd(a);
        a.printlist(a);
    }
}
