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
    public void printlist(LinkedList x){
        Node n = x.head;
        while (n!=null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    LinkedList insert(LinkedList x,int d){
        Node newNode = new Node(d);
        if(head == null){           //to insert if list is empty
            x.head = newNode;
        }
        else {                      //insert at end
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
        return x;
    }
    LinkedList delete(LinkedList x,int position){
        Node n = head;
        int size =0;
        while(n!=null){            //to calculate the size of the list
            size++;
            n = n.next;
        if(head == null)           //list is empty
        {
            System.out.println("Empty list");
            return x;
        }
        if(head.next == null)      //list only has a single node
        {
            x.head = null;
            return x;
        }
        }
        if(position > size || position <1){     //invalid node position
            System.out.println("Invalid position");
            return x;
        }
        if(position == 1){
            x.head = head.next;
            return x;
        }
        else if(position == size){
            Node t =head;
            while(t.next.next!=null){
                t=t.next;
            }
            t.next = null;
            return x;
        }
        else{
//
             Node cN=head;
            for(int a=1;a<position-2;a++){   //linked list position is from 1.....so on
                cN=cN.next;
            }
            Node t1 = cN.next; //to store the value
            cN.next=cN.next.next;
            return x;
        }



    }
}
class Main {

    public static void main(String[] args) {
	LinkedList a = new LinkedList();
	    a.insert(a,1);
        a.insert(a,2);
        a.insert(a,3);
        a.printlist(a);
        System.out.println();
        System.out.println("Delete the 2nd node");
        a.delete(a,2);
        a.printlist(a);
	
    }
}
