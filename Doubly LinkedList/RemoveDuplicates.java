package com.company;


import org.w3c.dom.Node;

class dNode{
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
class dLinkedList{
    dNode head;
    public void printlist(dNode n)
    {
        dNode last = null;
        System.out.println("Forward Traversal :");
        while (n != null) {
            System.out.print(n.data + " ");
            last = n;
            n = n.next;
        }
        System.out.println();
        System.out.println("Reverse Traversal :");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
    static dLinkedList removeDuplicates(dLinkedList x,dNode head)
    {
        dNode current = head;
        while(current.next!=null)
        {
            if(current.data == current.next.data) {
                delete(head,current.next);
            }
            else
                current = current.next;
        }
        return x;
    }
    dLinkedList insert(dLinkedList x, int d){
        dNode newNode = new dNode(d);
        if (head == null) {
            head = newNode;
            return x;
        }
        dNode t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = newNode;
        newNode.prev = t;
        return x;
    }
    public static void delete(dNode head,dNode del)
    {
                                          // base case
        if(head==null || del==null)
        {
            return ;
        }
                                            // If node to be deleted is head node
        if(head==del)
        {
            head=del.next;
        }
                                                /* Change next only if node to be deleted
                                                 is NOT the last node */
        if(del.next!=null)
        {
            del.next.prev=del.prev;
        }
                                               /* Change prev only if node to be deleted
                                               is not the first node */
        if (del.prev != null)
            del.prev.next = del.next;
    }
}

class Main {

    public static void main(String[] args) {
	dLinkedList a = new dLinkedList();
	a.insert(a,1);
	a.insert(a,1);
	a.insert(a,2);
	a.insert(a,3);
	a.insert(a,3);
	a.insert(a,3);
	a.insert(a,4);
	a.insert(a,4);
	a.printlist(a.head);
	a.removeDuplicates(a,a.head);
	a.printlist(a.head);

    }
}
