import java.util.LinkedList;
import java.util.List;


public class shares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<String> solve(List<Integer> price){
		double sum=0;
		List<String> ans=new LinkedList<String>();
		for(int i=0;i<6;i++){
			sum=sum+price.get(i);
		}
		double avg=sum/7;
		ans.add(avg.toString());
		for(int i=7;i<price.size();i++){
			
		}
	}

}
