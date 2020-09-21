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
    public void printlist(){
        Node n =head;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        if(head==null)       //for an empty list
        {
            x.head = newNode;
        }
        else{               //to insert at end
            Node t = head;
            while(t.next!=null){
                t=t.next;
            }
            t.next = newNode;
        }
        return x;
    }
    LinkedList deletefirst(LinkedList x){
        if(head == null)
        {
            System.out.println("Empty lsit");
            return x;
        }
        if(head.next == null)
        {
            x.head = null;
            return x;
        }
        Node t = head;
        x.head = head.next;
        return x;

    }

}
public class Main {

    public static void main(String[] args) {
	LinkedList a = new LinkedList();
	a.insert(a,1);
	a.printlist();
        System.out.println();
	a.insert(a,2);
	a.printlist();
        System.out.println();
	a.deletefirst(a);
	a.printlist();
        System.out.println();
	a.deletefirst(a);
	a.printlist();
        System.out.println();
	a.deletefirst(a);
	a.printlist();

    }
}
