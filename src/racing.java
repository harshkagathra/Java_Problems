import java.util.*;


public class racing {
	public static int minimumMovement(List<Integer> obstacle) {
		int curr=2,count=0,flag=0;
		List<Integer> change=new ArrayList<Integer>();
		for(int i=0;i<obstacle.size();i++){
			if(obstacle.get(i)!=curr && flag==0){
				continue;
			}
			if(!change.contains(obstacle.get(i))){
				flag=1;
				change.add(obstacle.get(i));
				if(change.size()==2){
					count++;
					flag=0;
					if(!change.contains(1)){
						curr=1;
					}else if(!change.contains(2)){
						curr=2;
					}
					else{
						curr=3;
					}
					//System.out.println(curr);

					change.clear();
				}
			}
		}
		if(change.size()!=0)
			return count+1;
		else
			return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
//		int[] obstacle=new int[]{1, 3, 1, 1, 2, 3, 2, 2, 2, 2, 3, 2, 2, 3, 3, 2, 3, 2, 2, 3, 1, 1, 3, 2, 3, 1, 1, 1, 2, 1, 2, 3, 2, 1, 2, 1, 3, 2, 3, 3, 3, 1, 2, 2, 1, 1, 2, 1, 3, 2, 1, 3, 3, 2, 3, 3, 1, 3, 1, 2, 3, 1};
//		for(int i=0;i<obstacle.length;i++){
//			input.add(obstacle[i]);
//		}
		//System.out.println(input);
		input.add(2);
		input.add(1);
		input.add(3);
		input.add(3);
		input.add(3);
		input.add(1);

		racing ans = new racing();
		System.out.println(ans.minimumMovement(input));

	}

}
