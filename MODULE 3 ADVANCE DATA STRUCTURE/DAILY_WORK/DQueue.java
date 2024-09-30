
public class DQueue{
	int size=5;
	int DQ[]=new int[size];
	int front,rear;
	
	DQueue(){
		
		front=-1;
		rear=0;
	}
	
	boolean isEmpty(){
		return (front==-1);
	}
	
	boolean isFull(){
		return( (front ==0 && rear == size -1) || front == rear + 1);
	}
	
	
	void insertFront(int key){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		//first element inserted
		if (front==-1){
			front=0;
			rear=0;
		}else if (front==0){
			front=size-1;
			
		}else{
			front=front-1;
		}
		DQ[front]=key;
	}	
	
	void insertRear(int key){
		if (isFull()){
			System.out.println("Queue is Full");
		}
		if (front==-1){
			front=0;
			rear=0;
			
		}else if (rear==size-1){
			rear=0;
		}else{
			rear=rear+1;
		}
		DQ[rear]=key;
	}
	
	void deleteFront(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		
		if (front== rear){
			front=-1;
			rear=-1;
		}else if (front==size-1){
			front=0;
		}else{
			front=front+1;
		}
		
	}
	void deleteRear(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		
		if (front== rear){
			front=-1;
			rear=-1;
		}else if (rear==0){
			rear=size-1;
		}else{
			rear=rear+1;
		}
	
		
	}
	
	int getFront(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		return DQ[front];
		
	}
	
	int getRear(){
		if (isEmpty() || rear<0){
			System.out.println("Queue is Empty");
			return -1;
		}
		return DQ[rear];
		
	}	
	
	public static void main(String [] args){
		
		DQueue dq1=new DQueue();
		
		dq1.insertFront(10);
		dq1.insertFront(10);
		
		dq1.insertRear(30);
		dq1.insertRear(40);
		
		
		
		
		
		
	} 
}