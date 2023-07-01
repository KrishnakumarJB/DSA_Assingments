package mandatoryHomeWork.week4.day4;

import mandatoryHomeWork.week4.day1.LinkedList;
import mandatoryHomeWork.week5.day2.ListNode;

public class ReverseLL extends LinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
//        ListNode(int val, mandatoryHomeWork.week5.day2.ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode previous = null;
            ListNode current = head;


            while(current != null){
                ListNode next = current.next;
                current.next = previous;
                previous = current;
                current = next;



            }
            head = previous;
            return head;

        }
    }
}
