  import java.util.*;
import java.util.Map.Entry;
class GFG { 
	
    public static int isKthBitSet(int n, int[] k) 
    { 
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<k.length;i++){
			System.out.println(k[i]);
    		for(int j=0;j<32;j++){
    			if ((k[i] & (1 << j)) != 0){
    				if(map.containsKey(j)){
    					map.replace(j, map.get(j)+1);
    				}else{
    					map.put(j, 1);
    				}
    			}

    		}
    	}
    	System.out.println(map);
    	int max=0;
    	for(int x: map.keySet()){
    		if(max<map.get(x)){
    			max=map.get(x);
    		}
    	}

    
    	return max;
       
    } 
  
    // driver code 
    public static void main(String[] args) 
    { 
        int n = 4;
        int[] k=new int[]{1,2,3,4};
        System.out.println(isKthBitSet(n, k)); 
    } 
} 