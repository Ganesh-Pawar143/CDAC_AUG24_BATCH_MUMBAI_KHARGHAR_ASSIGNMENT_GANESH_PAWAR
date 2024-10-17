class Q3DetectLoopInLL{

	static Node head ;
	class Node{
		int data ;
		Node next;
		
	
	public Node(int data){
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
	
	boolean detectLoop(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		
		return false;
	}


	public void createLoop(){
		Q3DetectLoopInLL first = new Q3DetectLoopInLL();
		Q3DetectLoopInLL first = new Q3DetectLoopInLL();
		Q3DetectLoopInLL first = new Q3DetectLoopInLL();
		Q3DetectLoopInLL first = new Q3DetectLoopInLL();
		Q3DetectLoopInLL first = new Q3DetectLoopInLL();
	}

	public static void main(String args[]){
		
		Q3DetectLoopInLL ll = new Q3DetectLoopInLL();

		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		System.out.println(ll.detectLoop(head));
		
	}

}