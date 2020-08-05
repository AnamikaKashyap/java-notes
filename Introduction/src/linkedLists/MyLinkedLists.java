package linkedLists;

public class MyLinkedLists<E> {
	
	Node<E> head;
	
	public void add(E data) {//---------------------------------------------------
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}//----------------------------------------------------------------------
	
	public E removeLast()throws Exception {//------------------------------------------------

		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove  = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
		
		//		Node toRemove = new Node(data);
//		
//		if(isEmpty()) {
//			System.out.println("List is empty");
//		    return;
//		}
//		
//		Node temp = head;
//			
//		while(temp.next!=null) {
//		temp = temp.next;	
//		}
//		temp.next = temp.next.next;
//		temp.next.next = null;
		
	}//---------------------------------------------------------------------
	
	public E getLast()throws Exception {
		
Node<E> temp = head;	
		if(temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
