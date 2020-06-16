import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;


public class StrangeSort {
	public static void main(String[] args) {
//		int[] mapping1 = { 3, 5, 4, 6, 2, 7, 9, 8, 0, 1 };
//		String num1 = "990";
//		String num2 = "332";
//		List<Integer> ans=new LinkedList<Integer>();
//		System.out.println(sortNumber(num1, mapping1));
//		System.out.println(sortNumber(num2, mapping1));
		int[] mapping2 = { 2, 1, 4, 8, 6, 3, 0, 9, 7, 5 };
		//String[] nums2 = { "12", "02", "4", "023", "65", "83", "224", "50"};
		List<String> nums2=new LinkedList<String>();
		nums2.add("12");
		nums2.add("02");
		nums2.add("4");
		nums2.add("023");
		nums2.add("65");
		nums2.add("83");
		nums2.add("224");
		nums2.add("50");
		System.out.println(sortNumber(nums2,mapping2));
	}

	private static List<String> sortNumber(List<String> num, int[] mapping) {
		Stack<Integer> stack = new Stack<>();
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> ans= new LinkedList<Integer>();
		for (int i = 0; i < mapping.length; i++) {
			map.put(mapping[i], i);
		}
		for(int j=0;j<num.size();j++){
			for(int i=num.get(j).length()-1; i>=0;i--) {
				char c = num.get(j).charAt(i);
				stack.push(c - '0');
		}
		
		int res = 0;
		while (!stack.isEmpty()) {
			res *= 10;
			res += map.get(stack.pop());
		}
		map1.put(res,num.get(j));
		ans.add(res);
		}
		Collections.sort(ans);
		List<String> a=new LinkedList<String>();
		for(int i=0;i<ans.size();i++){
			a.add(map1.get(ans.get(i)));
		}
		
		
		return a;
	}
}
