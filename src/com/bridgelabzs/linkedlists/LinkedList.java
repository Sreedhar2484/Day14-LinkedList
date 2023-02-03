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
    void insert( int position,Object data) {  
		
	    Node newNode = new Node(data); 
	    newNode.ref = null;

	    if(position < 1) {
	      System.out.print("\nposition should be >= 1.");
	    } else if (position == 1) {
	      newNode.ref = head;
	      head = newNode;
	    } else {
	      
	      Node temp = new Node(data);
	      temp = head;
	      for(int i = 1; i < position-1; i++) {
	        if(temp != null) {
	          temp = temp.ref;
	        }
	      }
	   
	      if(temp != null) {
	        newNode.ref = temp.ref;
	        temp.ref = newNode;  
	      } else {
	        System.out.print("\nThe previous node is null.");
	      } 
        }  
    }    
	     
    
    public static void main(String args[]){
        LinkedList LL1 = new LinkedList();
        LL1.append(56);
        LL1.display();
        LL1.append(70);
        LL1.display();
        LL1.insert(2, 30);
        LL1.display();
    }
}