package mandatoryHomeWork.week4.day1;

public class LinkedList {
	ListNode head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.display();

	}

	
	
	
	
class ListNode {
	
	int data;
	ListNode next;
	
		
	}

public void lastIndex() {
	ListNode newNode = new ListNode();
	
}

public void insert(int ele) {
	ListNode newNode = new ListNode();
	newNode.data = ele;
	newNode.next = null;
	
	head = newNode;
	
}

public void display() {
	
	ListNode temp = head;
	while(temp != null) {
		System.out.print(temp.data+ " ");
		temp = temp.next;
	}
}


}



