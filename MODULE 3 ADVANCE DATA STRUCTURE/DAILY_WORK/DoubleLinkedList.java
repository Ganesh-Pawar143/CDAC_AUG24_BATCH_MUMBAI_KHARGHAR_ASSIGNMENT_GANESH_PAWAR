

class DoubleLinkedList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	
	//insert at the begining 
	
	void insertHead(int new_data){
		Node new_node=new Node(new_data);
		new_node.next = head;
		new_node.prev= null;
		
		if(head !=null){
			head.prev=new.node;
		}
		
		head=new_node;
	}
	
	
	void display(Node n){
		Node p = null;
		System.out.println("Forward Direction:");
		whie (n!=null){
			System.out.print(n.data+"-->");
			
		}
	}


	public static void main(String[]args){
		
		
		
		
	}


}