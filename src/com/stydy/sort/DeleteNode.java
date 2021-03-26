package com.stydy.sort;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。
 * @author fengfasong
 * @date 2021/3/21
 */
public class DeleteNode {

    public ListNode delNode(ListNode head,int val){
        if(head == null){
            return null;
        }
        if(head.value == val){
            return head.next;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur.value != val && cur != null){
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return dummy.next;
    }

}
