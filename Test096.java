class ListNode{
  ListNode next;
  int data;
}

class Test096{

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
	
	
	ListNode firstNode2 = new ListNode();
	firstNode2.data = 10;
	firstNode2.next = null;
	ListNode lastNode2 = firstNode2;
	
	for(int i = 11; i < 20; i++){
	 ListNode newNode2 = new ListNode();
	 lastNode2.next = newNode2;
	 newNode2.data = i;
	 newNode2.next = null;
	 lastNode2 = newNode2;
	}
	
	
	  ListNode current = firstNode;
	  ListNode current2 = firstNode2;
	    do{
		
	    if(current.next  == null){
		  current.next = current2;
		  break;
		}
		current = current.next;
		
	  }while(current != null);
	  
	  ListNode current3 = firstNode;
	  do{
	    System.out.println(current3.data);
		current3 = current3.next;
	  }while(current3 != null);
	  
    }
}