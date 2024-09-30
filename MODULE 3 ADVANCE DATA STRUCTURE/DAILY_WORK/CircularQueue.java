
public class CircularQueue{
	int size=5;
	int CQ[]=new int[size];
	int front,rear;
	
	CircularQueue(){
		
		front=-1;
		rear=-1;
	}
	
	boolean isEmpty(){
		return (front==-1);
	}
	
	boolean isFull(){
		return((rear+1)%size == front );
	}
	
	void enqueue(int x){
		if (isFull()){
			System.out.println("Queue is Full");
		}else{
			if (front==-1){
			front++;  // set front to 0 if queue is empty
			}
			rear= (rear+1) %size;
			CQ[rear]=x;
			System.out.println(x+" Inserted");
		}
	}
	void dequeue(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			int x = CQ[front];
			System.out.println(x + " Deleted");
			
			if(front == rear){
				System.out.println("Queue is Empty Now");
				front=-1;
				rear=-1;
			}else{
				front= (front+1)%size; //front ++
			}			
						
		}
		
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Empty queue");
			
		}else{
			System.out.print("Queue Element :	");
			
			int i=front;
			while (true ){
				System.out.print(CQ[i]+"	");
				if (i==rear)break;
				i=(i+1)%size;
			}
			
			//while (i != rear ){
			//	System.out.print(CQ[i]+"	");
				
			//	i=(i+1)%size;
			//}
			
			System.out.println();
		}
	}
	
	
	public static void main(String [] args){
		CircularQueue cq1= new CircularQueue();
		
		
		cq1.enqueue(10);
		cq1.enqueue(20);
		cq1.enqueue(30);
		cq1.enqueue(40);
		cq1.enqueue(50);
		
		cq1.enqueue(60);
		
		cq1.display();
		
		
		cq1.dequeue();
		cq1.display();
		cq1.dequeue();
		cq1.display();
		cq1.dequeue();
		cq1.display();
		cq1.dequeue();
		cq1.display();
		cq1.dequeue();
		cq1.display();
		cq1.dequeue();
		
		
		
		
	} 
}