import java.util.*;

class Q4evaluatePostfix{
	
	static final int max = 10;
	int top = -1;
	int arr [] = new int [max];
	
	boolean isEmpty(){
		return (top < 0);
	}
	boolean isFull(){
		return (top == max - 1);
	}
	
	boolean push(int num){
		if(top >= (max-1)){
			System.out.println("Stack overflow");
			return false;
		}else{
			arr[++top] = num;
			return true;
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("stack underflow");
			return 0;
		}else{
			int x = arr[top];
			top--;
			return x;
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println("stack empty");
		}else{
			System.out.print("stack elements : ");
			show(top);
			System.out.println();
		}
	}
	void show(int top){
		if(top<0)//base condition
			return ;
		System.out.print(arr[top]+" ");
		show(top-1);
	}

	public static void main(String args [] ){
		
		Scanner sc = new Scanner(System.in);
		
		Q4evaluatePostfix stack = new Q4evaluatePostfix();
		System.out.print("enter postfix : ");
		String str = sc.nextLine();
		int size = str.length();
		
		 for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
		System.out.println(stack.pop());
		
		
	}
}