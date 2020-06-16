class CountAndSay{
 public String countandSay(int n) {
        if(n==1){
            return "1";
        }
        int count=1;
        String s="1";
        int flag=0;
        String ans="";
        int j;
        for(int i=1;i<n;i++){
            ans="";
            char prev=s.charAt(0);
            for(j=1;j<s.length();j++){
              char curr=s.charAt(j);
                if(curr==s.charAt(j-1)){
                    if(flag==1){
                        count++;
                    }else{
                        flag=1;
                        count++;
                    }
                }
                else{
                    ans=ans+Integer.toString(count)+s.charAt(j-1);
                    count=1;
                }
            }
            ans=ans+Integer.toString(count)+s.charAt(j-1);
            s=ans;
            count=1;
        }
        return ans;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay obj=new CountAndSay();
		System.out.println(obj.countandSay(6));

	}

}
