package ParishakDemo;

import java.util.Scanner;

public class CircularQueue{

    int []queue;
    int cap;
    int rear;
    int front;
    int size;

    CircularQueue(int n) {
        cap = n;
        front = -1;
        rear = -1;
        size = 0;
        queue = new int[cap];
    }

    void enque(int value) {

        if (size == cap) {
            System.out.println("FULL");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % cap;
        queue[rear] = value;
        size++;
    }

    void deque() {
        if (size == 0) {
            System.out.println("EMPTY");
            return;
        }
        System.out.println(queue[front]);
        front = (front + 1) % cap;
        size--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircularQueue cq = new CircularQueue(n);

        while (true) {
            String cmd = sc.next();
            if (cmd.equals("exit")) {
                break;
            }

            switch (cmd) {
                case "enque":
                    int value = sc.nextInt();
                    cq.enque(value);
                    break;

                case "deque":
                    cq.deque();
                    break;
            }
        }
        sc.close();
    }
}
