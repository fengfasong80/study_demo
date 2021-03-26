package com.stydy.sort;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * @author fengfasong
 * @date 2021/3/17
 */
public class StackOut {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    public static int[] reversePrint(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp.value);
            temp = temp.next;
        }
        int[] arry = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arry[i] = stack.pop();
        }
        return arry;
    }
}
