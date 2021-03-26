package com.stydy.algorithm;

import com.stydy.leetcode.TreeNode;

/**
 * 单值二叉树
 * @author fengfasong
 * @date 2021/3/22
 */
public class Demo19 {

    public boolean isUnivalTree(TreeNode head){
        if(head == null){
            return true;
        }
        return true && isUnivalTree(head.left) && isUnivalTree(head.right);
    }
}
