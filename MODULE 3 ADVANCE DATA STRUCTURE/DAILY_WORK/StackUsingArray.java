package Sorting;

public class StackUsingArray {
    int size;
    int top1, top2;
    int arr[];

    // Constructor
    StackUsingArray(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    // Method to push an element x to stack1
    void push1(int x) {
        // There is at least one empty space for new element
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to push an element x to stack2
    void push2(int x) {
        // There is at least one empty space for new element
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to pop an element from first stack
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Method to pop an element from second stack
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String args[]) {
        StackUsingArray ts = new StackUsingArray(11);
        ts.push1(1);
        ts.push1(2);
        ts.push1(3);
        ts.push1(4);
        ts.push1(5);
        ts.push1(6);
        ts.push2(10);
        ts.push2(9);
        ts.push2(8);
        ts.push2(7);
        ts.push2(6);
  
        
        
        

        System.out.println("Popped element from stack1 is " + ts.pop1());
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }
}

