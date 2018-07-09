package ru.alex.leetcode.medium01;

/**
 * @author alexey
 * @version 7/3/18
 */
public class Soution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // first node of the result list
        ListNode result = new ListNode(0);
        // pointer on last element of the result list
        ListNode currentNode = result;
        // carry from previous operation
        int carry = 0;
        while(l1 != null || l2 != null) {
            // this is for the case when incoming lists have different sizes
            int firstNum = (l1 != null) ? l1.val : 0;
            int secondNum = (l2 != null) ? l2.val : 0;
            int sum = firstNum + secondNum + carry;
            carry = sum / 10;
            // creates new node with result and move the pointer
            ListNode newNode = new ListNode(sum % 10);
            currentNode.next = newNode;
            currentNode = currentNode.next;
            // moves to the next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) {
            currentNode.next = new ListNode(carry);
        }
        return result.next;
    }

}
