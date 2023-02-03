package com.bridgelabzs.linkedlists;

public class LinkedList{
    Node head;
    class Node{
        Node ref;
        Object data;
        Node(Object data){
            this.data = data;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked List is Empty");
        }else if(head.ref == null){
            System.out.println(head.data);
        }else{
            Node temp=head;
            while(temp!=null){
                if(temp.ref!=null){
                    System.out.print(temp.data + "=>");
                }else{
                    System.out.print(temp.data + "\n");
                }
                temp = temp.ref;
                
            }

        }
    }
    public void add(Object data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else if(head.ref == null){
            head.ref = newNode;
        }else{
            Node temp = head;
            while(temp.ref!=null){
                temp = temp.ref;
            }
            temp.ref = newNode;
        }    
    }
    public static void main(String args[]){
        LinkedList LL1 = new LinkedList();
        LL1.add(56);
        LL1.display();
        LL1.add(30);
        LL1.display();
        LL1.add(70);
        LL1.display();
    }
}