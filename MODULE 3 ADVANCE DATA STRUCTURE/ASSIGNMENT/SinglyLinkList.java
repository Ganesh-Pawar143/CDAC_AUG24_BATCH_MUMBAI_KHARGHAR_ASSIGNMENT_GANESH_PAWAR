package app.core.main;
/*Implement a singly linked list with basic operations: insert, delete, search.
•	Test Case 1:
Input: Insert 3 → Insert 7 → Insert 5 → Delete 7 → Search 5
Output: List = [3, 5], Found = True
•	Test Case 2:
Input: Insert 9 → Insert 4 → Delete 4 → Search 10
Output: List = [9], Found = False
 */
public class SinglyLinkList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
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

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
        list.insert(3);
        list.insert(7);
        list.insert(5);
        list.delete(7);
        System.out.print("List = " + list);
        System.out.println("Found = " + list.search(5));

        list = new SinglyLinkList();
        list.insert(9);
        list.insert(4);
        list.delete(4);
        System.out.print("List = " + list);
        System.out.println("Found = " + list.search(10));
    }
    
}
