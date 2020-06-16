import java.util.*;
public class social {
	public List<List<Integer>> solve(List<Integer> count){
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> temp=new ArrayList<Integer>();
		int[] flag=new int[count.size()];
		for(int i=0;i< count.size();i++){
			flag[i]=0;
		}
		for(int i=0;i<count.size();i++){
			if(flag[i]==0){
				temp.add(i);
				for(int j=1;j<count.get(i);j++){
					for(int k=i+1;k<count.size();k++){
						if(count.get(k)==count.get(i)&& flag[k]==0){
							temp.add(k);
							flag[k]=1;
							break;
						}
					}
				}
				ans.add(temp);
				temp=new ArrayList<Integer>();
		}
	}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(1);
		social obj=new social();
		System.out.println(obj.solve(a));
	}

}
