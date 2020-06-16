
public class Bit_Adding {
	public int Calc(int n1,int n2){
		int carry=1;
		int ans=0;
		while(carry!=0){
		carry=n1&n2;
		carry=carry<<1;
		ans=n1^n2;
		n1=ans;
		n2=carry;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int n1=20,n2=10;
		Bit_Adding obj=new Bit_Adding();
		int ans=obj.Calc(n1,n2);
		System.out.println(ans);

	}

}
