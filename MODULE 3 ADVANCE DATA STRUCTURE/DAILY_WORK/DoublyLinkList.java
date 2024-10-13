package LIST;

public class DoublyLinkList {
	
	class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }

    }

    Node head=null;
    void insertHead(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        new_node.prev=null;
        if (head!=null){
            head.prev=new_node;
        }
        head=new_node;       
    }
    
    
    void insertAfterNode(int node_data,int new_data) {
    	
    	Node curr=head;
    	while(curr!= null && curr.data!=node_data ) {
    		curr=curr.next;
    		if (curr.next==null && curr.data!=node_data) {
    			System.out.println("Node Not Found to insert");
    			return;
    		}
    	}    	
    	Node new_node=new Node(new_data);
    	if (curr.next==null){
   		 new_node.next=null;
   		 new_node.prev=curr;
   		 curr.next=new_node;
   		 return;
   	 	}
    	new_node.next=curr.next;
    	new_node.prev=curr;
    	curr.next.prev=new_node;
    	curr.next=new_node;
    	return;
    }
    
    void insertBeforeNode(int node_data,int new_data) {
    	Node curr=head;
    	Node new_node=new Node(new_data);
    	if (curr.data==node_data) {
    		insertHead(new_data);
    		return;
    	}
    	while (curr.next!=null && curr.next.data!=node_data) {
    		curr=curr.next;
    		if (curr.next==null && curr.data!=node_data) {
    			System.out.println("Node Not Found to insert");
    			return;
    		}
    	}
    	new_node.next=curr.next;
    	new_node.prev=curr;
    	curr.next.prev=new_node;
    	curr.next=new_node;
    	return;   	
    	
    }
    
    
    
    
    
    void display(){
    	
    	Node curr=head;
    	Node rev=null;
    	System.out.println("Forward List");
    	while(curr!=null) {
    		System.out.print(curr.data+" ");
    		rev=curr;
    		curr=curr.next;
    	}   
    	System.out.println();
    	System.out.println("Reverse List");
    	while(rev!=null) {
    		System.out.print(rev.data+" ");
    		rev=rev.prev;
    	}
    	
    }
    
    
    
    public static void main(String []args) {
    	DoublyLinkList dl=new DoublyLinkList();
    	dl.insertHead(40);
    	dl.insertHead(30);
    	dl.insertHead(20);
    	dl.insertHead(10);
    	
    	dl.insertAfterNode(30, 35);
    	
    	dl.insertAfterNode(40, 50);
    	//dl.insertAfterNode(80, 60);
    	
    	dl.insertBeforeNode(30, 25);
    	dl.insertBeforeNode(10, 5);
    	
    	dl.display();
    }

}
