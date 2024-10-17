class Q6QueueUsingArray{
		
	int size = 5;
	int q[] = new int[size];
	int front , rear;
	
	Q6QueueUsingArray(){
		front = -1;
		rear = -1;
	}
	boolean isEmpty(){
		return (front==-1);
	}
	boolean isFull(){
		return (rear == (size -1));
	}
	void enqueue(int x){
		if(isFull()){
			System.out.println("q is fulllll !!!!!!!!!");
		}else{
			if(front==-1){
				front = 0;
			}
			rear++;
			q[rear] = x;
		}
	}
	int dequeue()
	{
		//Already empty queue
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		else{
			int x = q[front];
			if (front > rear)
			{
				front = -1;
				rear = -1;
			}
			else{
				front++;
			}
			return x;
		}
	}

		
	public static void main(String args[]){
		
		Q6QueueUsingArray q1 = new Q6QueueUsingArray();
		q1.enqueue(5);
		q1.enqueue(10);
		
		System.out.println("case 1 :  ");
		System.out.println("dequed element = "+q1.dequeue());
		
		Q6QueueUsingArray q2 = new Q6QueueUsingArray();
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		
		int a = q2.dequeue();
		int b = q2.dequeue();
		System.out.println("case 2 :  ");
		System.out.println("dequed element = "+a+","+b);
		
	}	

}