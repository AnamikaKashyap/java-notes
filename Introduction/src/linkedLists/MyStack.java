package linkedLists;
import linkedLists.MyLinkedLists;
public class MyStack<E> {

	private MyLinkedLists<E> ll = new MyLinkedLists();
	
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
			}
		
		return ll.removeLast();
		
	}
	E peek()throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");
			}
		return ll.getLast();
	}

}
//https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/