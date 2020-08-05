package linkedLists;

public class MainLinkedList {

	public static void main(String[] args) {
	
		MyLinkedLists<Integer> myLL = new MyLinkedLists();
			for(int i = 0; i<10; i++) {
				myLL.add(i);
}
		
		
		myLL.print();
	}

}
