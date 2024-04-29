package LinkedList1;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

class LinkedList1 {
    Node head; // head of the list



    // a class named node is defined that will represent the node of the Singly Linked List
    // the class object has two variables in it named data and next
    class Node {

        // the data variable is of integer type and will be used to store the value associated with that particular node of the Singly Linked List
        int data;

        // the next variable is of class node* type and will be used to store the address of the next node of the Singly Linked List
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // A function named rotate is written that will rotate the linked list in a counter-clockwise direction and update the head of the Linked List. It doesn't modify the list if k is greater than or equal to the size
    // So the function named rotate having two parameters named head_ref and k will represent the head node of the Linked List and k representing the number of nodes of the Linked List
    // The head_ref variable is of struct Node* type and an integer variable named k
    void rotate(int k)
    {
        if (k == 0)
            return;

        // Let us understand the below code for example k = 4
        // and list = 10->20->30->40->50->60.
        Node current = head;

        // current will either point to kth or NULL after this
        // loop. current will point to node 40 in the above example

        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        // If current is NULL, k is greater than or equal to count
        // of nodes in linked list. Don't change the list in this case
        if (current == null)
            return;

        // current points to kth node. Store it in a variable.
        // kthNode points to node 40 in the above example
        Node kthNode = current;

        // current will point to last node after this loop
        // current will point to node 60 in the above example
        while (current.next != null)
            current = current.next;

        // Change next of the last node to previous head
        // Next of 60 is now changed to node 10

        current.next = head;

        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;

        // change next of kth node to null
        kthNode.next = null;
    }


    // A function named push is written to add a new node to the Linked List
    // The function named push is written with two input parameters named head_ref and new_data
    // The head_ref variable is of struct Node** type is representing the head of the Linked List to which we want to add the new node
    // The new_data variable is of integer type that will represent the data the new node that we want to add to the Linked List will be stored in it
    void push(int new_data)
    {

        // First of all, the new node that we want to add to the Linked List is linked to an object of the Node class named new_node
        Node new_node = new Node(new_data);

        // The already existing Linked List is appended to the new node making the new node a part of the Linked List
        new_node.next = head;

        // Once the already existing Linked List is appended with the new node now the head pointer is moved to the new node making the new node
        // the head node of the Linked List
        head = new_node;
    }


    // A function named printList is written to print the data in the nodes of the Singly Linked List
    void printList()
    {
        Node temp = head;
        // The Linked List is traversed untill the last element of the Singly Linked List is encountered
        while (temp != null) {
            // while traversing the  Linked List the data present in the each node of the Singly Linked List is printed
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // main function is written to call all the functionalities functions of the Linked List written above that will rotate the Linked List
    public static void main(String args[])
    {
        LinkedList1 llist = new LinkedList1();
        Scanner sc = new Scanner(System.in);

        // // create a list 10->20->30->40->50->60
        // for (int i = 60; i >= 10; i -= 10)
        //  llist.push(i);

        // System.out.println("Given list");
        // llist.printList();

        // llist.rotate(4);

        // System.out.println("Rotated Linked List");
        // llist.printList();


        int data;
        int count = 0;
        char ch;

        // Do-while loop
        // Do part for performing actions
        do
        // Menu is displayed
        // Users enter 'y' to continue 'n' if
        // entered by user , the program terminates

        {
            // Menu
            // Display messages
            System.out.println("Please Choose one of the Operations::\n");
            System.out.println("1. To Insert Data in the Linked List.\n");
            System.out.println("2. To Rotate the Linked List.\n");
            System.out.println("3. To Display Data present in the Linked List.\n");
            System.out.println("\n");


            int choice;
            choice = sc.nextInt();

            // Switch case
            switch (choice) {

                // Case 1
                case 1:

                    System.out.println("Enter the data that you want to add to the newly added node to the Linked List :\n");
                    data = sc.nextInt();
                    llist.push(data);
                    count++;
                    // Display message
                    System.out.println("Data Added Successfully.\n");
                    // Break statement to terminate a case
                    break;

                // Case 2
                case 2:

                    // Display message
                    llist.rotate(count);
                    System.out.println("Linked List Rotated Successfully.");
                    // Break statement to terminate a case
                    break;


                // Case 3
                case 3:

                    // Display message
                    System.out.println("Data in the Linked List is:\n");
                    llist.printList();
                    // Break statement to terminate a case
                    break;

                default:
                    // Print statement
             // 1--->       System.out.println("Please enter a valid option from the menu to System.out.println("Please enter a valid option from the menu to proceed further"");
                            // Break statement
                    break;
            }


            System.out.println("\nType [N or n] to terminate the program.\nType [Y or y] to continue the program.\n");
            ch = sc.nextLine().charAt(0);

        } while (!(ch == 'N' || ch == 'n'));
    }//end of the main function
}
