package com.stydy.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 不同的二叉搜索树
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树
 * @author fengfasong
 * @date 2021/3/22
 */
public class DiffTreeNode {


    public List<TreeNode> generateTrees(int n) {


        return null;
    }

    public List<TreeNode> generateTrees(int start,int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for(int i = start;i <= end;i++){
            List<TreeNode> leftNodes = generateTrees(start, i - 1);
            List<TreeNode> rightNodes = generateTrees(i + 1, end);

            for(TreeNode left : leftNodes){
                for(TreeNode right : rightNodes){
                    TreeNode currNode = new TreeNode(i);
                    currNode.left = left;
                    currNode.right = right;
                    allTrees.add(currNode);
                }
            }
        }
        return allTrees;
    }

}
