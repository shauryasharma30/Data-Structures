package com.company;

import org.w3c.dom.Node;

import java.sql.SQLOutput;

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
    public void printlist(dNode n){
        dNode last = null;
        System.out.println("Forward Traversal :");
        while(n!=null){
            System.out.print(n.data + " ");
            last = n;
            n = n.next;
        }
        System.out.println();
        System.out.println("Reverse Traversal :");
        while(last!=null)
        {
            System.out.print(last.data +" ");
            last = last.prev;
        }
    }
    dLinkedList insert(dLinkedList x,int d)
    {
        dNode newNode = new dNode(d);
        if(head == null){
            head = newNode;
            return x;
        }
        dNode t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next = newNode;
        newNode.prev = t;
        newNode.next = null;
        return x;
    }
}
class Main {

    public static void main(String[] args) {
    dLinkedList a = new dLinkedList();
    a.insert(a,1);
    a.insert(a,2);
    a.insert(a,3);
    a.insert(a,4);
    a.printlist(a.head);
    }
}
