import java.util.ArrayList;
import java.util.List;


public class harvest {

	public long maxProfit(int k, int[] a){

		long max =Integer.MIN_VALUE;
		int[] r=new int[a.length];
		int flag=0;
		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++){
			if(i<k){
				temp=temp+a[i];
				count++;
			}
			else if(i==k){
				r[0]=temp;
			}
			else{
				r[i-k]=r[i-k-1]+a[i-1]-a[i-k-1];
			}
		}
		for(int i=a.length-k;i<a.length;i++){
			r[i]= r[i-1]+a[(i+k-1)%a.length]-a[i-1];
		}
//			for(int j=0;j<k;j++){
//				long t1= a[(i+j)%a.length];
//				long t2=a[((i+j)%a.length+(a.length/2))%a.length];
//				temp=temp+t1+t2;
//				}
		for(int i=0;i<r.length;i++){
			System.out.println(r[i]+" ");
		}
		for(int i=0;i<a.length;i++){
			temp=r[i]+r[(i+(a.length/2))%a.length];
			if(max<temp){
				max=temp;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		harvest h=new harvest();
		List<Integer> a= new ArrayList<Integer>();
		int[] A=new int[]{5,6,-3,-5,-2,5};
		System.out.println(h.maxProfit(2, A));

	}

}
