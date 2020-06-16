
public class NoMatchNumber {
	public int Number(int n, int m, int r){
		int ans=0;
		for(int i=n;i<=m;i++){
			int d=0;
			int prod=i*r;
			char[] q=Integer.toString(prod).toCharArray();
			char[]q1 =Integer.toString(i).toCharArray();
			for(int j=0;j<q.length;j++){
				for(int k=0;k<q1.length;k++){
					if(q[j]==q1[k]){
						d=1;
					}
				}
				}
				if(d==0){
					ans++;
				
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,m=100,v=2;
		NoMatchNumber obj=new NoMatchNumber();
		System.out.println(obj.Number(n,m,v));

	}

}
