package com.company;

import org.w3c.dom.Node;

import java.util.HashSet;

class dNode
{
    int data;
    dNode next;
    dNode prev;
    public dNode(int d)
    {
     data = d;
     next = null;
     prev = null;
    }
}
class dLinkedList
{
    dNode head;
    public void printlist(dNode n)
    {
        dNode last = null;
        System.out.println("Forward Traversal : ");
        while(n!=null)
        {
            System.out.print(n.data + " ");
            last = n;
            n = n.next;
        }
        System.out.println();
        System.out.println("Reverse Traversal :");
        while(last!=null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
    public static dNode removeDuplicates(dNode head) {
        if (head == null)     //if list is empty
            return null;
        HashSet<Integer> x = new HashSet<>();
        dNode current = head;
        dNode next;
        while (current != null) {
            if (x.contains(current.data)) {
                next = current.next;
                head = delete(head, current);
                current = next;
            } else {
                x.add(current.data);
                current = current.next;
            }
        }
        return head;
    }
    public static dNode delete(dNode head,dNode del)
    {
        if(head == null || del==null) {
            return null;                      //if the list is empty
        }
        if (head == del) {

            head = del.next;
        }
        if(del.next!=null)
        {
            del.next.prev = del.prev;
        }
        if(del.prev!=null)
        {
            del.prev.next = del.next;
        }
        return head;
    }
    dLinkedList insert(dLinkedList z ,int d)
    {
        dNode newNode = new dNode(d);
        if(head == null)
        {
            head = newNode;
            return z;
        }
        dNode t = head;
        while(t.next != null)
            t =t.next;
        t.next = newNode;
        newNode.prev = t;
        return z;

    }
}
class Main {

    public static void main(String[] args) {
	dLinkedList a = new dLinkedList();
	a.insert(a,1);a.insert(a,2);a.insert(a,2);a.insert(a,3);a.insert(a,3);a.insert(a,3);a.insert(a,4);a.insert(a,4);a.insert(a,1);
	a.printlist(a.head);
	a.removeDuplicates(a.head);
	a.printlist(a.head);
    }
}
