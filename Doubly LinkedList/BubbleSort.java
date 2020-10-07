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
        System.out.println("Reverse Traversal : ");
        while(last!=null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
    dLinkedList insert(dLinkedList x,int d) {
        dNode newNode = new dNode(d);
        if (head == null) {
            head = newNode;
            return x;
        } else {
            dNode t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
            newNode.prev = t;
            return x;
        }
    }
        public static dNode bubbles(dNode head){
            int swaps = 0;
            dNode p ;                        // iterator
            dNode lptr = null;

            if(head == null)
                return null;
            do{
                swaps = 0;
                p = head;

                while(p.next != lptr)
                {
                    if(p.data > p.next.data)
                    {
                        int t = p.next.data;
                        p.next.data = p.data;
                        p.data = t;
                        swaps = 1;
                    }
                    p = p.next;
                }
                lptr = p;
            }
            while(swaps!=0);
            return head;

        }

}
class Main {

    public static void main(String[] args) {
	dLinkedList a = new dLinkedList();
	a.insert(a,2);a.insert(a,3);a.insert(a,1);a.insert(a,4);
	a.printlist(a.head);
        System.out.println("----------------Sorting the DLL by bubble sort");
    a.bubbles(a.head);
    a.printlist(a.head);
    }
}
