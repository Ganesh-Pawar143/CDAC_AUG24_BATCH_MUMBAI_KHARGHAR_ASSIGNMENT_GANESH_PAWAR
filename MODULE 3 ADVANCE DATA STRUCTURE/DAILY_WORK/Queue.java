// Simple Queue Implemenatation
class Queue{
	
	int size=5;
	int Q[]=new int[size];
	int front,rear;
	
	Queue(){
		front=-1;
		rear=-1;
	}
	
	boolean isEmpty(){
		return (front==-1);
	}
	
	boolean isFull(){
		return(rear==size-1);
	}
	
	void enqueue(int x){
		if (isFull()){
			System.out.println("Queue is Full");
		}else{
			if (front==-1){
			front++;  // set front to 0 if queue is empty
			}
			rear++;
			Q[rear]=x;
			System.out.println(x+" Inserted");
		}
	}
	void dequeue(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			int x = Q[front];
			System.out.println(x + " Deleted");
			
			if(front > rear){
				System.out.println("Queue is Empty Now");
				front=-1;
				rear=-1;
			}else{
				front++;
			}			
						
		}
		
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Empty queue");
			
		}else{
			System.out.print("Queue Element :	");
			
			for (int i=front;i<=rear;i++){
				System.out.print(Q[i]+"	");
			}
			System.out.println();
		}
	}
		
	
	
	public static void main(String[]args){
		
		Queue Q1=new Queue();
		
		Q1.enqueue(10);
		Q1.display();
		Q1.enqueue(20);
		Q1.display();
		Q1.enqueue(30);
		Q1.display();
		Q1.enqueue(40);
		Q1.display();
		
		
		Q1.dequeue();
		Q1.display();
		Q1.dequeue();
		Q1.display();
		Q1.dequeue();
		Q1.display();
		Q1.dequeue();
		Q1.display();
		
		Q1.dequeue();
		Q1.display();
		
		
	}
	
}