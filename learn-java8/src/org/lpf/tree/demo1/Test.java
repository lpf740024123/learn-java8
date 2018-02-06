package org.lpf.tree.demo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		TreeBuilder treeBuilder = TreeBuilder.getInstance();
		
		TreeNode treeNode1 = new TreeNode("1","广州","0");  
        TreeNode treeNode2 = new TreeNode("2","深圳","0");  
        TreeNode treeNode3 = new TreeNode("3","天河区",treeNode1);  
        TreeNode treeNode4 = new TreeNode("4","越秀区",treeNode1);  
        TreeNode treeNode5 = new TreeNode("5","黄埔区",treeNode1);  
        TreeNode treeNode6 = new TreeNode("6","石牌",treeNode3);  
        TreeNode treeNode7 = new TreeNode("7","百脑汇",treeNode6);  
  
  
        TreeNode treeNode8 = new TreeNode("8","南山区",treeNode2);  
        TreeNode treeNode9 = new TreeNode("9","宝安区",treeNode2);  
        TreeNode treeNode10 = new TreeNode("10","科技园",treeNode8);  
        List<TreeNode> list = new ArrayList<TreeNode>();  
        list.add(treeNode1);  
        list.add(treeNode2);  
        list.add(treeNode3);  
        list.add(treeNode4);  
        list.add(treeNode5);  
        list.add(treeNode6);  
        list.add(treeNode7);  
        list.add(treeNode8);  
        list.add(treeNode9);  
        list.add(treeNode10);  
        Date d1 = new Date();
        List<TreeNode> trees = treeBuilder.bulid(list);
        Date d2 = new Date();
        List<TreeNode> trees_ = treeBuilder.bulidByRecursive(list);  
        Date d3 = new Date();
        System.out.println(d2.getTime()-d1.getTime());
        System.out.println(d3.getTime()-d2.getTime());
        System.out.println(trees);
        System.out.println(trees_);
        Map<?,?> map = new HashMap<>();
		//map.put(key, value);
	}
}
