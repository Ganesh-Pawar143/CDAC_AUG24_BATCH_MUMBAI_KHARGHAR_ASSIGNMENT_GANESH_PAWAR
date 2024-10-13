package EXTRA;
import java.util.Scanner;


public class LinkedListHackerRank {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void add(int data) {
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

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        int getMiddle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        boolean contains(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the linked list elements
        String[] elements = scanner.nextLine().split(" ");
        LinkedList linkedList = new LinkedList();
        for (String element : elements) {
            linkedList.add(Integer.parseInt(element));
        }

        // Read the element to be searched
        int searchElement = scanner.nextInt();

        // Print the elements of the linked list
        linkedList.printList();

        // Find and print the middle element
        System.out.println(linkedList.getMiddle());

        // Search for the element and print the result
        if (linkedList.contains(searchElement)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
