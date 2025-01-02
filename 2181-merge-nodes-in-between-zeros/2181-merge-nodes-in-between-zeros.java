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
public class Solution {
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode start = head;
        while (start != null) {
            ListNode end = start;   
            int sum = 0;
            while (end.val != 0) {
                sum += end.val;
                end = end.next;
            }
            start.val = sum;   
            start.next = end.next;   
            start = start.next;
        }
        return head;
    }

//연결 리스트의 노드들 중 0으로 둘러싸인 값을 합치고 새로운 리스트로 반환
//연결 리스트에서 0으로 둘러싸인 구간의 값들을 합산하도록 구현
//연결 리스트를 순회하면서 값을 합산하고 새로운 노드를 만들어야 함