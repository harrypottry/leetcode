package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月16日 18:13
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview22 {

    public static ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy = new ListNode(-1, head), prev = dummy;
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        while (true) {
            // 检查剩余节点是否有k个，不足则返回
            ListNode last = prev;
            for (int i = 0; i < k; i++) {
                last = last.next;
                if (last == null) {
                    return dummy.next;
                }
            }

            // 翻转k个节点
//            ListNode curr = prev.next, next;
            ListNode curr = prev.next;
            ListNode next;
            for (int i = 0; i < k - 1; i++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode listNode = reverseKGroup(list1, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

