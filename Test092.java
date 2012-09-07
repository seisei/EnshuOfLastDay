class ListNode{
  ListNode next;
  int data;
}

class Test092{

    public static void main(String args[]){
	
	ListNode firstNode = new ListNode();
	firstNode.data = 0;
	firstNode.next = null;
	ListNode lastNode = firstNode;
	
	for(int i = 1; i < 10; i++){
	 ListNode newNode = new ListNode();
	 lastNode.next = newNode;
	 newNode.data = i;
	 newNode.next = null;
	 lastNode = newNode;
	}
	  ListNode current = firstNode;
	    do{
	    System.out.println(current.data);
		current = current.next;
	  }while(current != null);
	  
    }
}