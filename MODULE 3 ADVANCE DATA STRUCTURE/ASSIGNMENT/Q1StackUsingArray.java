class Q1StackUsingArray{

	static final int max = 10;
	int top = -1;
	int arr[] = new int[max];

	//constructor
	Q1StackUsingArray(){
		top = -1;
	}
	boolean isEmpty(){
		return (top < 0);
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

	public static void main(String args[]){
		
		Q1StackUsingArray st = new Q1StackUsingArray();
		System.out.println("case 1 : ");
		st.push(5);	
		st.push(3);
		st.push(7);
		st.display();
		
		st.pop();
		st.display();
		
		System.out.println("case 2 : ");
		st.push(10);	
		st.push(20);	
		st.pop();
		st.push(15);
		st.display();
		
	}

}