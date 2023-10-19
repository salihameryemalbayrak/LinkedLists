package veriyapilari_hafta3_tekrar;

public class LinkedStack {
	private ListNode top;
	
	LinkedStack(){
		top=null;
	}
	
	void push(Object nod){   
		top=new ListNode(nod,top);	
	}
	
	Object pop() {
		Object p =top.nod;
		top=top.next;
		return p;
	}
	
	Object peek() {
		if(top==null) {
			System.out.println("stack is empty");
			return null;
		}
		else {
			return top.nod;
		}
	}
	
	boolean isEmpty() {
		if(top==null) {
			return true;
		}
		else{
			return false;
		}
	}
	
	int size() {
		int size=0;
		ListNode current =top;
		while(current!=null) {
			current=current.next;
			size++;
		}
		return size;
	}

	

}
