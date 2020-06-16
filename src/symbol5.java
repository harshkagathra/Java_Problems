import java.util.ArrayList;
import java.util.List;


public class symbol5 {
	public int sol(int n){
		String s=Integer.toString(n);
		List<Character> a=new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			a.add(s.charAt(i));
		}
		a.add('5');
		if(a.get(1)>7&&a.size()==4){
			
		}
		char character=a.get(0);
		int j=0;
		while(character>5&&j<s.length()){
			character=a.get(j);
			j++;
		}
		for(int i=s.length();i>=j;i--){
			a.set(i, a.get(i-1));
		}
		a.set(j, '5');
		String ans="";
		for(int i=0;i<a.size();i++){
			ans+=a.get(i);
		}
		return Integer.parseInt(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		symbol5 obj=new symbol5();
		System.out.println(obj.sol(323));

	}

}
