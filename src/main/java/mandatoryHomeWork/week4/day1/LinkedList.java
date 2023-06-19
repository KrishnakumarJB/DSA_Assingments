package mandatoryHomeWork.week4.day1;

public class LinkedList {
	Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.display();

	}

	
	
	
	
class Node{
	
	int data;
	Node next;
	
		
	}

public void lastIndex() {
	Node newNode = new Node();
	
}

public void insert(int ele) {
	Node newNode = new Node();
	newNode.data = ele;
	newNode.next = null;
	
	head = newNode;
	
}

public void display() {
	
	Node temp = head;
	while(temp != null) {
		System.out.print(temp.data+ " ");
		temp = temp.next;
	}
}


}



