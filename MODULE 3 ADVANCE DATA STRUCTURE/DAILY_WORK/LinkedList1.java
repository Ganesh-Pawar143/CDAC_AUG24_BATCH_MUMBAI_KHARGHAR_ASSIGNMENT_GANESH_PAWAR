class LinkedList1{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		
		Node(int d){
			data=d;
			next=null;
		}
		
	}
		
	void insert(int new_data){		
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;		
	}	
	
	
	void insertAfter(Node prev_node, int new_data){		
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;		
	}
	
	//insertion at end
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
		    head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	
	void deleteNode(int key){
		Node temp=head, prev = null;
		
		//Deletion at begining
		if (temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key){
			prev =temp;
			temp=temp.next;
		}
		
		if (temp==null){
			return;
		}
		prev.next = temp.next;
	}
	
	//delete by Position	
	void deleteNodePos(int position){
		
		if (head == null){
			return;
		}
		
		Node temp = head ;
		if (position == 0){
			head = temp.next; // head position chnage
			return;
		}
		
		for (int i=0; temp != null && i<position -1 ; i++){
			temp=temp.next;			
		}
		
		if (temp == null || temp.next==null){
			return;
			
		}
		
		Node next = temp.next.next;
		temp.next=next;		
	}
	
	//Delete List 
	void deleteList(){
		head=null;
	}
	
	//count Nodes in List
	int countNode(){
		Node temp = head;
		int countlist=0;
		while(temp != null){
			countlist++;
			temp=temp.next;
		}
		return countlist;
	}
	
	//Recursive Program for count number of nodes 
	
	int countRec(Node node){
		//base condition
		//Node node=head
		if(node==null){
			return 0;
		}
		
		return 1 + countRec(node.next);
	}
	
	
	//search in List for element 
	
	boolean searchElement(Node head,int key){
		
		Node n=head;
		
		if (n==null){
			System.out.println("Emptylist");
		}
		
		while(n != null){
			if (n.data ==key){
				return true; //element found
			}
			n=n.next;
			
		}
			return false;		
		
	}
	
	// Revere Linked Lsit
	
	public void reverse(){
		//Node n=head;
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current!= null){
			next = current.next;
			current.next=prev;
			prev = current;
			current = next;
			
		}
		
		head = prev;
	
		
	}
	/*
	//print Middle element of the linked list;
	
	void middlepoint(){
		Node ptr1; //slowpointer
		Node ptr2; //fastpointer
		
		while(ptr1 != null && ptr2 != null){
			
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
		}
		System.out.println(ptr1.data);
		
		
	}
	*/
		
	//detect a loop in LinkedList
	boolean detectLoop(Node head){
		Node slow = head, fast =head;
		
		while(fast != null && fast.next != null ){
			slow = slow.next;
			fast=fast.next;
			if (slow==fast){
				return true;
			}
		}
		return false;
	}
	
	/*
	//merge two sorted List
	Node merge(Node l1,node l2){
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		
		if (l1.data < l2.data){
			l1.next = merge (l1.next, l2);
			return l1;
		}else{
			l2.next = merge (l1,l2.next);
			return l2;
		}
	}
	*/
		
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"---->");
			n=n.next;
		}
		
		
	}
	
	
	
	public static void main(String [] args){
		
		LinkedList1 l1=new LinkedList1();
		l1.head=new Node(10);
		Node Second = new Node(20);
		Node Third=new Node(30);
		
		l1.head.next=Second;
		Second.next = Third;
		
		l1.display();
		
		System.out.println();
		
		
		l1.insert(5);
		l1.display();
		System.out.println();
		
		
		l1.insertAfter(l1.head,60);
		l1.display();
		System.out.println();
		
		
		l1.insertAfter(l1.head.next,100);
		l1.display();
		System.out.println();
		/*
		l1.deleteNode(5);
		l1.display();
		System.out.println();
		
		l1.deleteNode(10);
		l1.display();
		System.out.println();
		*/
		/*
		l1.reverse();
		l1.display();
		System.out.println();
		*/
		
		System.out.println(l1.searchElement(l1.head,25));
		
		System.out.println(l1.countRec(l1.head));
		
		l1.append(64);
		l1.display();
		System.out.println();
	}
	
}