import java.util.*;
public class PascalTriangle {
	    public List<List<Integer>> generate(int numRows) {
	        int i,j;
	        ArrayList<List<Integer>> pascal = new ArrayList<List<Integer>>();
	        ArrayList<Integer> a=new ArrayList<Integer>();
	        ArrayList<Integer> a_prev = new ArrayList<Integer>();
	        a_prev.add(1);
	        pascal.add(a_prev);
	        for(i=2;i<=numRows;i++){
	            for(j=0;j<i;j++){
	                if(j==0||j==i-1)
	                a.add(1);
	                else{
	                    a.add(a_prev.get(j-1)+a_prev.get(j));
	                }
	            }
	            
	            a_prev.clear();
	            a_prev.addAll(a);
	            a.clear();
	        }
	        pascal.add(a);
	        return pascal;
	    }
	    public static void main(String args[]){
	    	int num=9;
	    	PascalTriangle p=new PascalTriangle();
	    	System.out.println("Pascal triangle is: \n"+ p.generate(num));
	    }
	}