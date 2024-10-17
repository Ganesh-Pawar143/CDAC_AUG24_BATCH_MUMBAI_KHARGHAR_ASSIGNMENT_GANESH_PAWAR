class Q6Assgn4{

	Node head;
	class Node{
		int data;
		Node next;
		
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insert(int new_data){
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
	
	
	void removeDuplicates(){
		Node n = head;
		if(n==null)
			return;
		else{
			while(n.next != null){
				if(n.data == n.next.data)
					n.next = n.next.next;
					n=n.next;
			}
			
		}
	}
	
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"--> ");
			n=n.next;
		}
	}
	
	


	public static void main(String args[]){
		
		Q6Assgn4 ll = new Q6Assgn4();
		
		System.out.println("case 1 :  ");
		ll.insert(1);
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(3);
		ll.insert(4);
		
		ll.display();
		
		System.out.println();
		ll.removeDuplicates();
		ll.display();
		
		System.out.println();
	    System.out.println("case 2 :  ");
		Q6Assgn4 ll2 = new Q6Assgn4();
		ll2.insert(7);
		ll2.insert(7);
		ll2.insert(8);
		ll2.insert(9);
		ll2.insert(9);
		ll2.insert(10);
		
		ll2.display();
		
		System.out.println();
		ll2.removeDuplicates();
		ll2.display();
	}

}