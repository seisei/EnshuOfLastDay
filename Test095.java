class ListNode{
  ListNode next;
  int data;
}

class Test095{

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
		
	    if(current.data  == 5){
		  lastNode.next = current.next;
		  break;
		}else{
		  if(current.next == null){
		    System.out.println("NG");
			break;
		  }
		}
		lastNode = current;
		current = current.next;
		
	  }while(current != null);
	  
	  ListNode current2 = firstNode;
	  do{
	    System.out.println(current2.data);
		current2 = current2.next;
	  }while(current2 != null);
	  
    }
}