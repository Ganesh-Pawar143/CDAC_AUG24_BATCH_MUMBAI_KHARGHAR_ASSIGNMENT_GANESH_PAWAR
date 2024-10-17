class Q2ReverseLL{

	Node head;
	
    class Node{
		int data;
		Node next;
	
	//constructor	
	Node(int data){
		this.data = data;
		this.next = null;
		}
	}
		boolean isEmpty(){
		return(head==null);
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		
		if(head == null){
			head = new_node;
		}else{
			Node n = head;
			while(n.next !=null){
				n = n.next;
			}
			n.next = new_node;
		}		
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"--> ");
			n=n.next;
		}
	}
	
	Node reverse(){
		Node n = head;
		Node prev = null;
		Node current = n;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current ;
			current = next;			
		}
		n = prev;
		return n;
	}
	

	public static void main(String args [] ){
		Q2ReverseLL ll1 = new Q2ReverseLL();
		
		ll1.insert(1);
		ll1.insert(2);
		ll1.insert(3);
		ll1.insert(4);
		ll1.insert(5);
		
		ll1.display();
		System.out.println();
		ll1.head = ll1.reverse();
		ll1.display();
		System.out.println();
		
		Q2ReverseLL rr2 = new Q2ReverseLL();
		
		rr2.insert(10);
		rr2.insert(20);
		rr2.insert(30);
		rr2.display();
		System.out.println();
		
		System.out.println();
		rr2.head = rr2.reverse();
		rr2.display();
		
	
	}

}