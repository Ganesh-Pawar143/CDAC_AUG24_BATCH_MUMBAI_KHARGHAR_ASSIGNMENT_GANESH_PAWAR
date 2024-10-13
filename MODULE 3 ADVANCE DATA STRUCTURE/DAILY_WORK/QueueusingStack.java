package Sorting;

class StackD{
	private int n;
	private int top;
	private int arr[];
	
	StackD(){
		this.n=n;
		this.top=-1;
		arr=new int[n];
	}
	void push() {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}else {
		arr[top++]=n;
		}
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		top--;
	}
	private boolean isEmpty() {
		return (top==-1);
	}
	boolean isFull() {
		return (top==n);
	}
	void display() {
		for(int i=n;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
    
public class QueueusingStack {
     
	public static void main(String[] args) {
		StackD s = new StackD();
	}

}
