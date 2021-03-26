package com.stydy.leetcode;

/**
 * 验证二叉树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树
 * @author fengfasong
 * @date 2021/3/22
 */
public class TwoTree {

    public boolean isValidBST(TreeNode root) {


        return false;
    }

    public boolean isValidBST(TreeNode node,long lower,long upper) {
        if(node == null){
            return true;
        }
        if(node.val <= lower || node.val >= upper){
            return false;
        }
        return isValidBST(node.left,lower,node.val) && isValidBST(node.right,upper,node.val);
    }
}
