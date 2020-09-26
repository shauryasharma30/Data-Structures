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
    public void printlist(LinkedList x)
    {
      Node n =x.head;
      while(n!=null)
      {
          System.out.print(n.data + " ");
          n=n.next;
      }
        System.out.println();
    }
    public void reverselist(Node p)
    {
     if(p.next == null)
     {
         head = p;
         return;
     }
     reverselist(p.next);
     Node q = p.next;
     q.next = p;
     p.next = null;
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
	a.insert(a,1);
	a.insert(a,2);
	a.insert(a,3);
	a.insert(a,4);
	a.printlist(a);
        System.out.println("Reversed : ");
    a.reverselist(a.head);
    a.printlist(a);

    }
}
