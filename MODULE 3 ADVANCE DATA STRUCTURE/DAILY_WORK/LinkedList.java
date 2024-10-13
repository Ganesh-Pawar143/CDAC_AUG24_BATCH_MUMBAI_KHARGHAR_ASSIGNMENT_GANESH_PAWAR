package arrays;

import java.util.Scanner;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}

	}

	void display() {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();

	}
	
	public void reverse() {
        printReverse(head);
        System.out.println();
    }

    private void printReverse(Node node) {
        if (node == null) return;
        printReverse(node.next);
        System.out.print(node.data + " ");
    }

	void insertAtHead(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void insertAfterNode(int node_data, int new_data) {

		Node new_node = new Node(new_data);
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null && current.data != node_data) {
			current = current.next;

		}
		new_node.next = current.next;
		current.next = new_node;

	}

	void insertBeforeNode(int node_data, int new_data) {

		Node new_node = new Node(new_data);
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null && current.next.data != node_data) {
			current = current.next;
		}
		new_node.next = current.next;
		current.next = new_node;

	}

	void insertLast(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;

	}

	void deleteNode(int node_data) {
		if (head == null) {
			return;
		}
		if (head.data == node_data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null && current.next.data != node_data) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	void deleteAfterNode(int node_data) {
		if (head == null) {
			return;
		}
		if (head.data == node_data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null && current.data != node_data) {
			current = current.next;
		}
		current.next = current.next.next;

	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String cmd = sc.next();
			if (cmd=="EXIT") {
				break;
			}
			int new_data;
			switch (cmd) {
			case "AB": {
				new_data = sc.nextInt();
				l1.insertAtHead(new_data);
				break;
			}
			case "AE": {
				new_data = sc.nextInt();
				l1.insertLast(new_data);
				break;
			}
			case "PR": {
				l1.display();
				break;
			}
			case "AMA": {
				int node_data = sc.nextInt();
				new_data = sc.nextInt();
				l1.insertAfterNode(node_data, new_data);
				break;
			}
			case "AMB": {
				int node_data = sc.nextInt();
				new_data = sc.nextInt();
				l1.insertBeforeNode(node_data, new_data);
				break;
			}
			case "DN": {
				int node_data = sc.nextInt();
				l1.deleteNode(node_data);
				break;
			}
			case "DNA": {
				int node_data = sc.nextInt();
				l1.deleteAfterNode(node_data);
				break;
			}
			case "FRA": {
				
				l1.reverse();
				break;
			}

			}
			

		}
		sc.close();

	}

}