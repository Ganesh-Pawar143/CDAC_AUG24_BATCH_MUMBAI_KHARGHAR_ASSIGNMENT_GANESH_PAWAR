package Sorting;


public class StackDemo {
	int top;
	int n;
	int arr[];
	StackDemo(int n){
		this.n=n;
		top=-1;
		arr=new int[n];
	}
	
	void push(int n) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		arr[++top]=n;
		
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		top--;
	}
	boolean isEmpty() {
		return (top==-1);
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println(arr[top]);
	}
	
	boolean isFull() {
		return (top==n);
	}
	
	void display() {
		for(int i=top; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String []args) {
		
		StackDemo s1=new StackDemo(5);
		
		s1.push(10);
		s1.display();
		

		
		
		
	}

}
