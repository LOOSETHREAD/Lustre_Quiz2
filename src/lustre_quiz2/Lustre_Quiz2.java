/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lustre_quiz2;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;

    public void SingleLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
class CircularLinkedList {
    Node head;

    
    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
/**
 *
 * @author User
 */
public class Lustre_Quiz2 {
    
     public void search (int input){
         
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lustre_Quiz2 arrays = new Lustre_Quiz2();
        Scanner scn = new Scanner(System.in);
        
        while(true){
            System.out.println("\nQuestion:");
            System.out.println("Number [1]");
            System.out.println("Number [2]");
            int input = scn.nextInt();
            
            if(input == 1){
                SingleLinkedList myNum = new SingleLinkedList();
                Scanner scanner = new Scanner(System.in);
                myNum.SingleLinkedList(1);
                myNum.SingleLinkedList(2);
                myNum.SingleLinkedList(3);
                myNum.SingleLinkedList(4);
                System.out.println("\nNumber [1]");
                System.out.println("Input the number you want to find: ");
                int number = scanner.nextInt();
        

        int elementToFind = number;
        if (myNum.search(elementToFind)) {
            System.out.println(elementToFind + " is found in the list\n");
        } else {
            System.out.println(elementToFind + " is not found in the list\n");
                
                        
                    }
        
            }
            else if(input == 2){
                CircularLinkedList myList = new CircularLinkedList();
           Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nNumber [2]");
            System.out.print("Input data to insert: \n");
            System.out.println("Input 0 to exit: ");
            int data = scanner.nextInt();
            if (data == 0) {
                break;
            }
            
            System.out.print("Input position: \n");
            int pos = scanner.nextInt();
            myList.insertAtPosition(data, pos);
            myList.display();
            
            
            }
        
        
    


                
                
            }
            else{
                System.out.println("Invalid Input!\n");
            }
        }
    }
}