package learnings.linkedList;

public class LinkList {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.display();
        System.out.println();
        list.insertAtPos(1,3);
        list.insertAtBegin(9);
        list.display();
        System.out.println();
        list.insertAtBegin(10);
        list.insertAtPos(2,3);
        list.display();
    }



}



class LinkedList{

    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }

    public void insertAtBegin(int val){ //
        Node newNode = new Node(val);
//        newNode.data = val;
        //while list is empty
        if(head == null){
            head = newNode;
        } else{
            //list is not empty
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int pos, int val){

        if(pos == 0){
            insertAtBegin(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1; i< pos; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
