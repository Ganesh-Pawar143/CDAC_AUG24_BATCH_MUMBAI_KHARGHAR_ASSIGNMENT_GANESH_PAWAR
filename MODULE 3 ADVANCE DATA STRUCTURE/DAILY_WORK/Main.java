package arrays;
class Stack{
	private int size;
	private int top;
	private int arr[];
	
	Stack(int n){
		this.size=n;
		this.top=-1;
		arr=new int[n];
	}
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}else {
		arr[++top]=data;
	}
}
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		return arr[top--];
	}
	boolean isEmpty() {
		return (top==-1);
	}
	boolean isFull() {
		return (top==size);
	}
	void display() {
		for(int i=size;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
    
public class Main {
     private Stack stack1;
     private Stack stack2;
     
     public Main(int size) {
    	 stack1=new Stack(size);
    	 stack2=new Stack(size);
     }
     public void enqueue(int data) {
         stack1.push(data);
         System.out.println(data + " enqueued to queue");
     }
     public int dequeue() {
         if (stack1.isEmpty() && stack2.isEmpty()) {
             System.out.println("Queue is empty");
             return -1;
         }

         if (stack2.isEmpty()) {
             while (!stack1.isEmpty()) {
                 stack2.push(stack1.pop());
             }
         }
         return stack2.pop();
     }

     public static void main(String[] args) {
         Main queue = new Main(5);

         queue.enqueue(10);
         queue.enqueue(20);
         queue.enqueue(30);

         System.out.println("Dequeued element: " + queue.dequeue());
         System.out.println("Dequeued element: " + queue.dequeue());
         
         queue.enqueue(40);
         
         System.out.println("Dequeued element: " + queue.dequeue());
         System.out.println("Dequeued element: " + queue.dequeue());
     }
 }
