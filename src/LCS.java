
public class LCS {
	 public String longestPalindrome(String s) {
		 boolean[][]t = new boolean[s.length()][s.length()];
		 char[] s1= s.toCharArray();
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 for(int j=i;j<s.length();j++)
			 {
				 if(i==j)
				 {
					 t[i][j]=true;
				 }
				 else if(i==j-1&&s1[i]==s1[j])
				 {
					 t[i][j]=true;
				 }
				 else if(s1[i]==s1[j]&&t[i+1][j-1]==true)
				 {
					 t[i][j]=true;
				 }
				 else
				 {
					 t[i][j]=false;
				 }
			 }
		 }
		 int max=0;
		 int maxi=0;
		 int maxj=0;
		 String s2="";
			 for(int i=0;i<s.length();i++)
			 {
				 for(int j=i;j<s.length();j++)
				 {
					 if(t[i][j]==true && j-i>max)
					 {
						 max=j-i;
						 maxi=i;
						 maxj=j;
					 }
				 }
			 }
			 if(s.equalsIgnoreCase(""))
			 {
			 for(int i=maxi;i<=maxj;i++)
			 {
				 s2=s2+s1[i];
			 }}
			 
			 return s2;
		 }
	 
	 
	 public static void main(String[] args)
	 {
		 String s="";
		 LCS obj=new LCS();
		 String sub=obj.longestPalindrome(s);
		 System.out.println(sub);
	 }
}

