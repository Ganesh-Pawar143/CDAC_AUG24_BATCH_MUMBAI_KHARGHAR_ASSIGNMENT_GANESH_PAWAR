class Q1Assgn4{

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
	
	void delete(int key){
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.data == key){ //first node
			head = temp.next ;
		}
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		//no element found
		if(temp == null){
			return;
		}
		prev.next = temp.next;
		
	}
	
	boolean search(int key){
		Node temp = head ;
		while(temp != null && temp.data != key){
			temp = temp.next;
		}
		if(temp == null)
			return false;
		return true;
	}
	
	
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"--> ");
			n=n.next;
		}
	}
	
	

	public static void main(String args [] ){
		Q1Assgn4 ll1 = new Q1Assgn4();
		
		ll1.insert(3);
		ll1.insert(7);
		ll1.insert(5);
		
		ll1.delete(7);
		ll1.display();
		
		System.out.println("Found = "+ll1.search(5));
		
		Q1Assgn4 ll2 = new Q1Assgn4();
		
		ll2.insert(9);
		ll2.insert(4);
	
		ll2.delete(4);
		ll2.display();
		
		System.out.println("Found = "+ll2	.search(5));
		
		
	
	}

}