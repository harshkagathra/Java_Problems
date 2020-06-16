import java.util.*;
public class MinStack {

	    /** initialize your data structure here. */
	    Stack<Integer> min =new Stack<Integer>();
	          Stack<Integer> stack =new Stack<Integer>();
	          int mini=100;
	   
	    
	    public void push(int x) {
	        stack.push(x);
	        if(x<mini)
	        {
	        	mini=x;
	        	min.push(x);
	        }
	        else{
	        	min.push(mini);
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	        min.pop();
	    }
	    
	    public int top() {
	        int x= stack.peek();
	        return x;
	    }
	    
	    public int getMin() {
	        int x =min.peek();
	        return x;
	    }
	    public static void main(String[] args){
	    	MinStack obj =new MinStack();
	    	obj.push(5);
	    	obj.push(2);
	    	obj.push(1);
	    	obj.push(2);
	    	obj.push(4);
	    	obj.push(0);
	    	System.out.println(obj.getMin());
	    	obj.pop();
	    	System.out.println(obj.getMin());
	    	obj.pop();
	    	System.out.println(obj.getMin());
	    	obj.pop();
	    	System.out.println(obj.getMin());
	    	obj.pop();
	    	System.out.println(obj.getMin());
	    	obj.pop();
	    	System.out.println(obj.getMin());
	    }
	}

