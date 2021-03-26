package com.stydy.leetcode;

/**
 * 平衡二叉树
 * @author fengfasong
 * @date 2021/3/25
 */
public class BalancedTree {

    public boolean isBalanced(TreeNode node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public static int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
}
