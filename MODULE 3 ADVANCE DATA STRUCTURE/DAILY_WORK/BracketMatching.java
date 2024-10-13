package ParishakDemo;
import java.util.*;
class Stack1 {
    int top;
    char arr[];

    Stack1() {
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
public class BracketMatching {
    public static boolean hasBalanced(String expr){
        Stack1 stack = new Stack1();
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            String expr = sc.nextLine();
            if (hasBalanced(expr)){
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
        sc.close();
    }


}
