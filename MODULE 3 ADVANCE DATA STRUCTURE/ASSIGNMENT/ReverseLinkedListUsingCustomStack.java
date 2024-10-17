
package app.core.main;

import java.util.Scanner;

// Node class for linked list and stack
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class to implement push, pop operations
class Stack {
    private Node top;

    // Constructor to initialize the stack
    Stack() {
        this.top = null;
    }

    // Push method to insert a new element into the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class ReverseLinkedListUsingCustomStack {

    // Function to reverse the linked list using custom stack
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Stack stack = new Stack();
        Node temp = head;

        // Push all nodes onto the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Pop from the stack and update the linked list nodes
        head = new Node(stack.pop()); // New head is the last node in original list
        Node current = head;

        while (!stack.isEmpty()) {
            current.next = new Node(stack.pop());
            current = current.next;
        }

        return head;
    }

    // Function to insert a new node at the end of the list
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
