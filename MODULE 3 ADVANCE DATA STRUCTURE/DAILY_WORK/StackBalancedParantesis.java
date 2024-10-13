package ParishakDemo;

import java.util.*;

class Stack {
    int top;
    char arr[];

    Stack() {
        top = -1;
        arr = new char[100];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(char ch) {
        arr[++top] = ch;
    }

    char pop() {
        return arr[top--];
    }
}

public class StackBalancedParantesis{
    public static boolean hasBalanced(String expr){
        Stack stack = new Stack();
        for(char ch: expr.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if (ch == ')' || ch== '}' || ch == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') || (ch == '}' && last != '{') || (ch == ']' && last != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String expr= sc.nextLine();
        if (hasBalanced(expr)){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        sc.close();
    }
}
