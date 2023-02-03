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

        public void search(Object searchElement) {
            if (head.data == searchElement)
                System.out.println(searchElement + " is Found");
            else {
                Node temp = head;

                boolean isFound = false;

                while (temp != null) {
                    if (temp.data == searchElement) {
                        isFound = true;
                        break;
                    }

                    temp = temp.ref;
                }

                if (isFound == true)
                    System.out.println(searchElement + " is Found");
                else
                    System.out.println(searchElement + " is not found..");
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
        
        public void delete_Data(Object data) {
            int index = 0;
            Node left = head;
            Node right = left.ref;
            while (right.data != data) {
                left = left.ref;
                right = right.ref;
                index++;

            }
            left.ref = right.ref;
        }
        
        public void size(){
            Node temp=head;
            int count = 0;
            while(temp!=null)
            {
                temp=temp.ref;
                count++;
            }  
            System.out.println("Size of Linked List is : " + count);
            //return count;
        }
            
    
    public static void main(String args[]){
        LinkedList LL1 = new LinkedList();
        LL1.append(56);
        LL1.display();
        LL1.append(30);
        LL1.display();
        LL1.append(70);
        LL1.display();
        LL1.search(30);
        LL1.insert(3, 40);
        LL1.display();
        LL1.search(40);
        LL1.delete_Data(40);
        LL1.size();
        LL1.display();
        
        
    }
}