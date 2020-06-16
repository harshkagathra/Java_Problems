import java.util.*;
public class TwoSum {
	    public int[] twoSum(int[] nums, int target) {
	    	int[] sum = new int[2];
	    	for(int i=0; i<nums.length-1;i++)
	    	{
	    		for(int j=i+1;j<nums.length;j++)
	    		{
	    			if(nums[i]+nums[j]==target)
	    			{
	    				sum[0]=nums[i];
	    				sum[1]=nums[j];
	    			}
	    		}
	    	}
	        return sum;
	        
	    }
	    public static void main(String []args)
	    {
	    	int[] nums = {2,7,11,15};
	    	int target = 9;
	    	TwoSum ts= new TwoSum();
	    	int[] sum = ts.twoSum(nums,target);
	    	System.out.println(sum[0]+" "+sum[1]);
	    }
	}

