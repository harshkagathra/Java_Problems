import java.util.*;
public class ArrayListDemo {
	    public int findKthLargest(int[] nums, int k) {
	        Random rand=new Random();
	        int n=rand.nextInt(nums.length);
	        int pivot=nums[n];
	        int a=0;
	        
	        int temp;
	        temp = pivot;
	        nums[n]= nums[nums.length-1];
	        nums[nums.length-1]=temp;
	        
	        int left=0,right=nums.length-1;
	        do{
		        for(int i=0;i<nums.length;i++)
		        {
		        	if(nums[i]>pivot)
		        	{
		        		left=i;
		        		break;
		        	}
		        }
		        for(int i=nums.length-2;i>=0;i--)
		        {
		        	if(nums[i]<pivot){
		        		right=i;
		        		break;
		        	}
		        }
		        if(left<right)
		        {
		        	temp=nums[left];
		        	nums[left]=nums[right];
		        	nums[right]=temp;
		        }
		        else
		        {
		        	temp =nums[left];
		        	nums[left]=nums[nums.length-1];
		        	nums[nums.length-1]=temp;
		        }

		        System.out.println(nums);    
	        }while(left>right);
	    	
	        System.out.println(left);
	        if(k==nums.length-n)
	        {
	        	a=pivot;
	        }
	        else if(k<nums.length-n)
	        {
	        	int[] r=new int[nums.length-n];
	        	for(int i=n+1;i<nums.length;i++){
	        		r[i-n-1]=nums[i];
	        		return n+findKthLargest(r, k);
	        	}
	        }
	        else{
	        	int[] rr=new int[n];
	        	for(int i=0;i<n;i++){
	        		rr[i]=nums[i];
	        		return findKthLargest(rr,k-n);
	        	}
	        }
	        return a;
	        
	    }
	
	public static void main(String[] args)
	{
		int[] nums={1,2,5,3,7,6,9};
		int k=2;
		ArrayListDemo ar=new ArrayListDemo();
		int r=ar.findKthLargest(nums, k);
		System.out.println("Element is: "+r);
	}
}
