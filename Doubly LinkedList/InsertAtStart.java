package com.company;

import org.w3c.dom.Node;

class dNode{
    int data;
    dNode next;
    dNode prev;
    public dNode(int d){
        data = d;
        next = null;
        prev = null;
    }
}
class dLinkedList{
    dNode head;
    dLinkedList(){
        head = null;
    }
    public void printlist(dNode x)
    {
        dNode last = null;
        System.out.println("Traversal in forward direction");
        while(x!=null){
            System.out.print(x.data+" ");
            last = x;
            x = x.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last = last.prev;
        }
    }
    dLinkedList insertStart(dLinkedList x,int d){
        dNode t = new dNode(d);
        if(head == null){
            head = t;
            return x;
        }
        t.next = head;
        head = t;
        head.next.prev = head;
        return x;
    }
}
class Main {

    public static void main(String[] args) {
	dLinkedList a = new dLinkedList();
	a.insertStart(a,1);
	a.insertStart(a,2);
	a.insertStart(a,3);
	a.insertStart(a,4);
	a.insertStart(a,5);
	a.printlist(a.head);

    }
}
