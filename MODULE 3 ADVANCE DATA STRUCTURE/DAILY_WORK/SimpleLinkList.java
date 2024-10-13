package ParishakDemo;
import java.util.Scanner;

public class SimpleLinkList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void addInitial(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void addLast(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    void addAfterNode(int node_data, int new_data) {
        Node new_node = new Node(new_data);
        if (head == null)
            return;
        Node curr = head;
        while(curr != null && curr.data != node_data) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
    }
    void addBeforeNode(int node_data, int new_data) {
        Node new_node = new Node(new_data);
        if (head == null)
            return;
        Node curr = head;
        while (curr != null && curr.next.data != node_data) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
    }

    void deleteNode(int node_data) {
        if (head == null)
            return;
        if (head.data == node_data) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data != node_data) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
    void deleteAfterNode(int node_data){
        if (head == null)
            return;
        if (head.data == node_data){
            head = head.next;
            return;
        }
        Node curr = head;
        while(curr.next != null && curr.data != node_data){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
    
    public static void main(String [] args){

    	SimpleLinkList l = new SimpleLinkList();
        Scanner sc = new Scanner(System.in);
        while (true){
            String cmd = sc.next();
            if (cmd.equals("EXIT")){
                break;
            }

            int new_data;
            switch(cmd){
                case "AB":
                    new_data = sc.nextInt();
                    l.addInitial(new_data);
                    break;
                
                case "AE":
                    new_data = sc.nextInt();
                    l.addLast(new_data);
                    break;
                
                case "PR":
                    l.display();
                    break;
                
                case "AMA":
                    int node_data = sc.nextInt();
                    new_data = sc.nextInt();
                    l.addAfterNode(node_data, new_data);
                    break;
                
                case "AMB":
                    int node_data1 = sc.nextInt();
                    new_data = sc.nextInt();
                    l.addBeforeNode(node_data1, new_data);
                    break;
                
                case "DN":
                    int node_data2 = sc.nextInt();
                    l.deleteNode(node_data2);
                    break;

                case "DNA":
                    int node_data3 = sc.nextInt();
                    l.deleteAfterNode(node_data3);
                    break;
            }
        }
        sc.close();
    }



}
