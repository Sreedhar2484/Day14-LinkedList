package com.bridgelabzs.linkedlists;
import java.util.Scanner;

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
    public void append(Object data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.ref == null) {
            head.ref = newNode;
        } else {
            Node temp = head;
            while (temp.ref != null) {
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
        }
    
    public void sortList() {
            // Node current will point to head
            Node current = head, index = null;
            int temp;

            if (head == null) {
                return;
            } else {
                while (current != null) {
                    // Node index will point to node next to current
                    index = current.ref;

                    while (index != null) {
                        // If current node's data is greater than index's node data, swap the data
                        // between them
                        if (current.data > index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.ref;
                    }
                    current = current.ref;
                }
            }
        }
    
        

        
        
    public static void main(String args[]){
        LinkedList LL1 = new LinkedList();
        LL1.append(56);
        LL1.display();
        LL1.append(30);
        LL1.display();
        LL1.append(40);
        LL1.display();
        LL1.append(70);
        LL1.display();
        LL1.sortList();
        LL1.display();
        
        
        
        
    }
}