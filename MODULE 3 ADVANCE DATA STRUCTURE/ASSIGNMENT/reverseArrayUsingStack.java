package app.core.main;
import java.util.Scanner;



public class reverseArrayUsingStack {
    static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            stackArray[++top] = value;
        }

        public int pop() {
            return stackArray[top--];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Stack stack = new Stack(size);

        for (int i = 0; i < size; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < size; i++) {
            array[i] = stack.pop();
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
