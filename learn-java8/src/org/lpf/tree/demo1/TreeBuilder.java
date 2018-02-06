package org.lpf.tree.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 *懒汉式（静态内部类） 实现单例 
 *这种写法，即解决安全问题，又解决了性能问题
 */
public class TreeBuilder {

	private static class Singleton{
		private static TreeBuilder treeBuilder = new TreeBuilder();
	}
	public static final TreeBuilder getInstance(){
		return Singleton.treeBuilder;
	}
	private TreeBuilder(){};
	
	/**
	 * 两层循环实现建树 
	 * 构建树  list ->树
	 * @param treeNodes
	 * @return
	 */
	public List<TreeNode> bulid(List<TreeNode> treeNodes) {
		List<TreeNode> trees = new ArrayList<>();
		for (TreeNode treeNode : treeNodes) {
			if ("0".equals(treeNode.getParentId())) {
				trees.add(treeNode);
			}
			for (TreeNode it : treeNodes) {
				if (it.getParentId() == treeNode.getId()) {
					if (treeNode.getChildren() == null) 
						treeNode.setChildren(new ArrayList<>());
					treeNode.getChildren().add(it);
				}
			}
		}
		return trees;
		
	} 

	/**
	 * 递归实现构建树
	 * @param treeNodes
	 * @return
	 */
	public List<TreeNode> bulidByRecursive(List<TreeNode> treeNodes) {
		List<TreeNode> trees = new ArrayList<>();
		for (TreeNode treeNode : treeNodes) {
			if ("0".equals(treeNode.getParentId())) 
				trees.add(findChildren(treeNode, treeNodes));
		}
		return trees;
	}
	/**
	 * 递归查找子节点
	 * @param treeNode
	 * @param treeNodes
	 * @return
	 */
	public TreeNode findChildren(TreeNode treeNode,List<TreeNode> treeNodes) {
		for (TreeNode it : treeNodes) {
			if (treeNode.equals(it.getParentId())) {
				if (treeNode.getChildren() == null)
					treeNode.setChildren(new ArrayList<>());
				treeNode.getChildren().add(findChildren(treeNode, treeNodes));
			}
		}
		return treeNode;
	}
	
	
}
