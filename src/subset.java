import java.util.*;


public class subset {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        res=dfs(res,nums,new ArrayList<Integer>(),0);
        return res;
    }
    public List<List<Integer>> dfs(List<List<Integer>> res,int[] nums, List<Integer> l, int start){
        res.add(new ArrayList<Integer>(l));
        for(int i=start;i<nums.length;i++){
            l.add(nums[i]);
            dfs(res,nums,l,i+1);
            l.remove(l.size()-1);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[]{1,2,3,4};
		subset obj=new subset();
		System.out.println(obj.subsets(nums));

	}

}
