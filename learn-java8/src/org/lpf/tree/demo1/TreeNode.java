package org.lpf.tree.demo1;

import java.util.List;

public class TreeNode {

	private String id;
	private String parentId;
	private String name;
	private String code;
	private List<TreeNode> children;
	
	public TreeNode(String id, String name, String parentId) {  
        this.id = id;  
        this.parentId = parentId;  
        this.name = name;  
    }  
    public TreeNode(String id, String name, TreeNode parent) {  
        this.id = id;  
        this.parentId = parent.getId();  
        this.name = name;  
    }  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", praentId=" + parentId + ", name="
				+ name + ", code=" + code + ", children=" + children + "]";
	}

	
}
