package com.stydy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 * @author fengfasong
 * @date 2021/1/6
 */
public class TreeAnswer {

    public List<Integer> inorderTraversal(TreeNode node){
        List<Integer> list = new ArrayList<>();
        inorder(node,list);
        return list;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode();

        TreeNode node3 = new TreeNode();
        TreeNode node4 = new TreeNode();
        node1.val = 1;
        node1.right = node3;
        node3.val = 2;
        node3.left = node4;
        node4.val = 3;
        TreeAnswer treeAnswer = new TreeAnswer();
        List<Integer> list = treeAnswer.inorderTraversal(node1);
        System.out.println(list);
    }
}
