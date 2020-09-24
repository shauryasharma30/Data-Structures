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
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        if(head == null)
        {
            x.head = newNode;
            return x;
        }
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = newNode;
        return x;
    }
    public void reverse(){
        Node current = head;
        Node previous = null;
        Node n;
        while(current!=null){
            n = current.next;
            current.next = previous;
            previous = current;
            current = n;
        }
        head = previous;
    }


}
public class Main {

    public static void main(String[] args) {
    LinkedList a = new LinkedList();
    a.insert(a,1);
    a.insert(a,2);
    a.insert(a,3);
    a.insert(a,4);
    a.insert(a,5);
    a.printlist();
    a.reverse();
    a.printlist();

    }
}
