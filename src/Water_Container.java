
public class Water_Container {
	 public int maxArea(int[] height) {
	        int max=0;
	        for(int i=0;i<height.length;i++){
	            
	            for(int j=i+1;j<height.length;j++){
	            	int min=height[i];
	            	if(height[i]>=height[j]){
	                    min=height[j];
	                }
	                if(max<min*(j-i)){
	                    max=min*(j-i);
	                }
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height =new int[]{8,10,14,0,13,10,9,9,11,11};
		Water_Container obj=new Water_Container();
		System.out.println(obj.maxArea(height));

	}

}
