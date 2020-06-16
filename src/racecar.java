import java.util.*;


public class racecar {
public static int minimumMovement(List<Integer> obstacle) {
		
		Map<Integer, Integer> uniqueElements = new HashMap<Integer, Integer>(); 
		int count = 0;
		int curr=2;
		for(int i = 1; i < obstacle.size(); i++) {
			if(obstacle.get(i) != curr && uniqueElements.isEmpty()) {
				continue;
			}
			if(!uniqueElements.containsValue(obstacle.get(i))) {
				uniqueElements.put(obstacle.get(i), i);
			}else {
				count += 1;
				if(!obstacle.contains(1)){
					curr=1;
				}else if(!obstacle.contains(2)){
					curr=2;
				}
				else{
					curr=3;
				}
				uniqueElements.clear();
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
//		input.add(6);
//		input.add(3);
//		input.add(2);
//		input.add(2);
//		input.add(1);
//		input.add(2);
//		input.add(1);
		
		input.add(6);
		input.add(2);
		input.add(1);
		input.add(3);
		input.add(3);
		input.add(3);
		input.add(1);

		racecar ans = new racecar();
		System.out.println(ans.minimumMovement(input));

	}

}
