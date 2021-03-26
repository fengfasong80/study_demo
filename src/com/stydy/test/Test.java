package com.stydy.test;

import com.stydy.leetcode.TreeNode;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test<T extends TreeNode & Icon> {
    LinkedList<String> linkedList;
    Map<String,String> map = new HashMap<>(4);


    public void test(){
        String put = map.put("1", "2");
    }
}
