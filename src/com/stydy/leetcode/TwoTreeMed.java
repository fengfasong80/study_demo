package com.stydy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历:左-中-右
 * @author fengfasong
 * @date 2021/3/22
 */
public class TwoTreeMed {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> end = new ArrayList<>();
        inorder(root,end);
        return end;
    }

    public void inorder(TreeNode node,List<Integer> res){
        if(node == null){
            return;
        }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }

}
