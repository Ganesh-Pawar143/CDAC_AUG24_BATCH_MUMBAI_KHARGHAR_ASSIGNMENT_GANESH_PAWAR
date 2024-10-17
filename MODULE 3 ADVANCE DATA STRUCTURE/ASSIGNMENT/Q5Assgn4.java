class Q5Assgn4{

	Node head;
	class Node{
		int data;
		Node next;
		
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void inser(int new_data){
		Node new_node = new Node(new_data);
		if(head == null)
			head = new_node;
		else{
			Node n = head;
			while(n.next !=null){
				n = n.next;
			}
			n.next = new_node;
		}
	}
	
	
	int findNFromEnd(int n){
		if(head==null || n <= 0)
			return 0;
		
		Node first = head;
		Node second = head;
		
		for(int i=0;i<n;i++){
			first = first.next;
		}
		
		while(first != null){
			first = first.next;
			second = second.next;
		}
		return second.data;
		
	}
	
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"--> ");
			n=n.next;
		}
	}
	
	


	public static void main(String args[]){
		
		Q5Assgn4 ll = new Q5Assgn4();
		
		System.out.println("case 1 :  ");
		ll.inser(10);
		ll.inser(20);
		ll.inser(30);
		ll.inser(40);
		ll.inser(50);
		
		ll.display();
		
		System.out.println();
		int val = ll.findNFromEnd(2);
		System.out.println(val);
		
		System.out.println("case 2 :  ");
		Q5Assgn4 ll2 = new Q5Assgn4();
		ll2.inser(5);
		ll2.inser(15);
		ll2.inser(25);
		ll2.inser(35);
		
		ll2.display();
		
		System.out.println();
		int val1 = ll2.findNFromEnd(4);
		System.out.println(val1);
	}

}