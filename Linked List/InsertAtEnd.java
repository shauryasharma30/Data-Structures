package com.company;
class Node {
    int data;
    Node next;

    public Node(int d) {
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
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        Node t = head;
        if(x.head == null)
            x.head = newNode;
        else{
            while(t.next!=null)
            {
                //System.out.print(t.next.data +" ");
               t = t.next;
            }
            t.next = newNode;
            newNode.next = null;
        }
        return x;
    }


}
public class Main {

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
        System.out.println("We append 4 to the end :");
        a.printlist();

    }
}
