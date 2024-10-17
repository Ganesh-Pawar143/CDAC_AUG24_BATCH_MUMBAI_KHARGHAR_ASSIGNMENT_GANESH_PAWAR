class Q7CircularQueue{
	
	int size = 4	;
	int [] cq = new int [size] ;
	int front = -1;
	int rear = -1;
	
	boolean isEmpty()
	{
		return (front == -1);
	}
	
	boolean isFull ()
	{
		return ((rear + 1) % size == front);
	}
	void enqueue(int x){
		if(isFull()){
			System.out.println("queue is full !!!");
		}else{
		if(front == -1){
			front = 0;
		}
		rear = (rear + 1) % size;
		cq[rear] = x;
		}
	}
	int dequeue(){
		if(isEmpty()){
			System.out.println("queue is empty !!!");
			return -1;
		}else{
			int x = cq[front];
			if(front == rear){
				front = -1;
				rear = -1;
			}else{
				front = (front + 1) % size;
			}
			System.out.println("dequeue  "+x);
			return x;
		}
			
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty Queue !");
		}else{
			System.out.println("queue elements are :  ");
			int i = front;
			while(i!=rear){
				System.out.print(cq[i]+" ");
				i = (i+1) % size;
			}
			System.out.println(cq[rear]);
			System.out.println();
		}
		
	}
	
	public static void main(String args[]){
		
		Q7CircularQueue cq = new Q7CircularQueue();
		/*
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.enqueue(7);
		
		cq.dequeue();
		cq.enqueue(8);
		cq.display();
		*/
		Q7CircularQueue cq1 = new Q7CircularQueue();
		
		cq1.enqueue(1);
		cq1.enqueue(2);
		cq1.enqueue(3);
		cq1.enqueue(4);
		cq1.display();
		
		System.out.println(cq1.isFull());
		
	}
}