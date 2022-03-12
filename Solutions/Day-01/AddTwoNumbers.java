/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_01;

/**
 *
 * @author Peace E. BAKARE
 */

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
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode resultNode = dummyNode;
        int carry = 0;     
        
        while (l1 != null || l2 != null){            
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            
            int sum = l1_val + l2_val + carry;
            carry = sum / 10;
            int last_digit = sum % 10;
            
            ListNode newNode = new ListNode(last_digit);
            resultNode.next = newNode;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next; 
            resultNode = resultNode.next;
        }
        if(carry > 0){
            resultNode.next = new ListNode(carry);
            resultNode = resultNode.next;
        }
        return dummyNode.next;
    }
}
