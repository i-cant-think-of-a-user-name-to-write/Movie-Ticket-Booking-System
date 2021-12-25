package com.company;

class Node{
    Node next;
    int data;

    Node(int data){
        this.next = null;
        this.data = data;
    }
}

public class Linked_List {
    Node root;
    int size = 0;

    public void add(int data){
        Node curr = root;
        Node temp = new Node(data);

        if(root==null){
            this.root = temp;
            this.size+=1;
            return;
        }

        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;
            this.size+=1;
        }
    }

    public void traverse(){

        if(root==null){
            return;
        }
        else{
            Node curr = root;
            while(curr!=null){
                System.out.print(curr.data+", ");
                curr = curr.next;
            }
            return;
        }
    }
}
