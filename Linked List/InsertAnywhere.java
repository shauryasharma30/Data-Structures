package com.company;
class Node{
    int data;
    Node next;
    public Node(int d){
        data =d;
        next = null;

    }
}
class LinkedList{
    Node head;

    public void printlist()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }


    LinkedList insert(LinkedList x,int d,int position){

        int size = 0;
        Node t = head;
        while (t!= null){
            size++;
            t=t.next;
        }
        //to check if position is valid
        if(position<0 || position>size+1)
        {
            System.out.println("Invalid");
        }
        //to insert if list is empty
        if(position == 1 && head==null)
        {
            x.head = new Node(d);
        }
        //to insert at the beginning
        else if(position == 1)
        {
            Node newNode = new Node(d);
            t = head;
            newNode.next = t;
            head = newNode;
        }
        //to insert at the end
        else if(position == size){
            Node newNode = new Node(d);
            t=head;
            while(t.next!=null)
            {
                t = t.next;
            }
            t.next=newNode;
            newNode.next = null;
        }
        //to insert anywhere in the middle
        else{
            t=head; // iterator type of working
            Node newNode = new Node(d);
            for(int i=0; i<position-2 ;i++) //to go to the n-1 th position
            {
                t = t.next;
            }
            newNode.next = t.next;
            t.next=newNode;

        }
        return x;
    }

}
class Main {

    public static void main(String[] args) {
    LinkedList a = new LinkedList();

    a.insert(a,2,1);       // 2
        a.insert(a,3,2);   // 2,3
        a.insert(a,4,1);   //4,2,3
        a.insert(a,5,2);   //4,5,2,3
       a.printlist();

    }
}
