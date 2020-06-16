
public class LongestUnivaluePath {
	int max;
	public int longestUnivaluePath(TreeNode root) {
        int count=0;
        int max=solution(root,0);
        return max;
    }
    public int solution(TreeNode root,int count){
        if(root.left!=null){
        if(root.val==root.left.val){
        	count++;
        	max=Math.max(max, count);
            solution(root.left,count);
        }
            else{
            	max=Math.max(max, count);
                solution(root.left,0);
            }
        }
        if(root.right!=null){
        if(root.val==root.right.val){
        	count++;
        	max=Math.max(max, count);
            solution(root.right,count);
        }
            else{
            	max=Math.max(max, count);
                solution(root.right,0);
            }
        }
        
    return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode h1=new TreeNode(5);
		TreeNode h2=new TreeNode(4);
		TreeNode h3=new TreeNode(5);
		TreeNode h4=new TreeNode(1);
		TreeNode h5=new TreeNode(1);
		TreeNode h6=new TreeNode(5);
		h1.left=h2;
		h1.right=h3;
		h2.left=h4;
		h2.right=h5;
		h3.right=h6;
		LongestUnivaluePath obj=new LongestUnivaluePath();
		System.out.println(obj.longestUnivaluePath(h1));

	}

}
