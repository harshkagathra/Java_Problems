import java.util.*;
public class DFS {
	List<String> list=new ArrayList<String>();
	public List<String> DepthFirst(TreeNode node){
		if(node==null){
			return null;
		}else{
		DepthFirst(node.left);
		
		DepthFirst(node.right);
		list.add(Integer.toString(node.val));
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode h1=new TreeNode(5);
		TreeNode h2=new TreeNode(4);
		TreeNode h3=new TreeNode(6);
		TreeNode h4=new TreeNode(1);
		TreeNode h5=new TreeNode(3);
		TreeNode h6=new TreeNode(8);
		h1.left=h2;
		h1.right=h3;
		h2.left=h4;
		h2.right=h5;
		h3.right=h6;
		DFS obj=new DFS();
		System.out.println(obj.DepthFirst(h1));

	}

}
