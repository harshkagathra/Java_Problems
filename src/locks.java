import java.util.HashMap;
import java.util.Stack;


public class locks {
	public int answer(String[] S){
		int i;
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Stack<String> stack=new Stack<String>();
		for(i=0;i<S.length;i++){
			String[] s=S[i].split(" ");
			if(s[0].equalsIgnoreCase("aquire")){
				if(map.containsKey(s[1])){
					return i+1;
				}
				else{
					stack.push(s[1]);
					map.put(s[1], 1);
				}
			}
			else{String popped=stack.peek();
				if(!map.containsKey(s[1])){
					return i+1;
				}
				if(!popped.equalsIgnoreCase(s[1])){
					return i+1;
				}
				stack.pop();
				map.remove(popped);
			}
		}
		if(!stack.empty()){
			return i+1;
		}
		else{
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]=new String[]{"aquire 365","aquire 45","release 45","aquire 33","release 33","release 365","aquire 365"};
		locks obj=new locks();
		System.out.println("Answer is "+obj.answer(s));

	}

}
