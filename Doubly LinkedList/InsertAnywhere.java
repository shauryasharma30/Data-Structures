package com.company;

import java.util.LinkedList;

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
class dLinkedList {
    dNode head;

    public void printlist(dNode n) {
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
    dLinkedList insert(dLinkedList x,int d)
    {
     dNode newNode = new dNode(d);
     if(head == null) {
         head = newNode;
         return x;
     }
     dNode t = head;
     while(t.next!=null)
     {
         t=t.next;
     }
     t.next = newNode;
     newNode.prev = t;
     return x;
    }
    dLinkedList insertAnywhere(dLinkedList x,int d,int n)
    {
      dNode newNode = new dNode(d);
      int size = 0;
      dNode y = head;
      while(y!=null)
      {
          size++;
          y = y.next;
      }
      if(n < 1 || n > size+1)                          //invalid position
      {
          System.out.println("Invalid position");
          return x;
      }
      else if(head == null && n == 1)                 //insert the first node
      {
          head = newNode;
          return x;
      }
      else if(n == 1)                                  //insert at beginning
      {
          newNode.next = head;
          head = newNode;
          head.next.prev = head;
          return x;
      }
      else if(n == size+1)                              //insert at end
      {
          dNode t = head;
          while(t.next!=null)
          {
              t=t.next;
          }
          t.next = newNode;
          newNode.prev = t;
          return x;
      }
      else{                                             //to insert in middle
          dNode t =head;
          for(int i =0;i<n-2 ;i++)
              t=t.next;
          newNode.prev = t;
          newNode.next = t.next;
          t.next = newNode;
          newNode.next.prev = newNode;
          return x;
      }
    }
}
public class Main {

    public static void main(String[] args) {
	dLinkedList a = new dLinkedList();
    a.insert(a,1);
    a.insert(a,2);a.insert(a,3);a.insert(a,4);a.insert(a,5);
    a.printlist(a.head);
    a.insertAnywhere(a,7,2);
        System.out.println("Inserting 7 at position 2");
    a.printlist(a.head);


    }
}
