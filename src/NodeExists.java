
public class NodeExists {
	boolean flag=false;
	public void exists(int n, TreeNode node){
		if(node==null){
			return;
		}
		
		
		exists(n,node.left);
		exists(n,node.right);
		if(node.val==n){
			flag=true;
		}
		System.out.println(node.val+" "+flag);
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
		NodeExists obj=new NodeExists();
		obj.exists(12,h1);
		System.out.println(obj.flag);

	}

}
