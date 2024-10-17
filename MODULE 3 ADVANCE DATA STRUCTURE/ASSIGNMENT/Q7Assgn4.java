class Q7Assgn4{

	Node head;

	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			next = null;
			prev=null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;
			return ;
		}
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
		new_node.prev = n;
	}
	
	
	void delete(int key){
		Node n = head;
		 // If the node to be deleted is the head node
		if(head == null)
			return;
		
		while(n!=null && n.data != key){
			n = n.next;
		}
		if(n == null){
			System.out.println("node not fount");
		}
		if(n == head ){
			head = head.next;
			if(head != null){
				head.prev = null;
			}
		}else{
			n.prev.next = n.next;
		}
		 if (n.next != null) {
            n.next.prev = n.prev; // Adjust the next node's prev pointer
        }
	}
	
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+"  ");
			n = n.next;
		}
		System.out.println(); 
	}

	public static void main(String args[]){
		
		Q7Assgn4 dll1 = new Q7Assgn4();
		
		dll1.insert(10);
		dll1.insert(20);
		dll1.insert(30);
		
		dll1.display();
		
		dll1.delete(20);
		dll1.display();
		
		
	}

}