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
    public void printlist(Node head)
    {
        if(head == null)                           // exit condition
        {
            return;
        }
        System.out.print(head.data + " ");         //to print the Node data
        printlist(head.next);                      //recursive call, the process on top of the stack executes first

    }
    public void reverseprint(Node head)
    {
        if(head == null)                           //exit condition
        {
            return;
        }
        reverseprint(head.next);                   //recursive call
        System.out.print(head.data + " ");         //to print the Node while the reverse call-back
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        if(head == null)
        {
            head = newNode;
            return x;
        }
        Node t =head;
        while(t.next!=null)
            t=t.next;
        t.next = newNode;
        return x;
    }

}
class Main {

    public static void main(String[] args) {
	LinkedList a = new LinkedList();
	a.insert(a,5);
	a.insert(a,6);
	a.insert(a,7);
	a.insert(a,8);
        System.out.println("Forward Output");
    a.printlist(a.head);
    System.out.println();
        System.out.println("Reverse Output");
    a.reverseprint(a.head);
    }
}
