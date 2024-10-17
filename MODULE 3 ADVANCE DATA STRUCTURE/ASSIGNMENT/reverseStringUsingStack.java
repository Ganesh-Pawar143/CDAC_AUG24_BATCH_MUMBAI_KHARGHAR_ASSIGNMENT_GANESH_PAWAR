package app.core.main;
import java.util.Scanner;



public class reverseStringUsingStack {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        scanner.close();

        char[] stack = new char[input.length()];
        int top = -1;

        // Push all characters of string to stack
        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

        // Pop all characters from stack and put them back to the string
        StringBuilder reversedString = new StringBuilder();
        while (top >= 0) {
            reversedString.append(stack[top--]);
        }

        System.out.println("Reversed string: " + reversedString.toString());
    }
}
