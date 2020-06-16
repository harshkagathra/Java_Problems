import java.util.*;
public class ValidateStack {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushstack=new Stack<Integer>();
        //Stack<Integer> popstack=new Stack<Integer>();
        int i=-1,j=0;
        if(pushed.length==0||popped.length==0){
            return true;
        }
        else{
       do{
    	   while(pushed[++i]!=popped[j])
        {
        	if(i<popped.length){
            pushstack.push(pushed[i]);
        	}
        	else{
        		break;
        	}
        }
        if(pushstack.peek()!=popped[j])
        {
        	break;
                 }
        else{
        	pushstack.pop();
        	j++;
        }
       }while(j<popped.length);
        if(j==popped.length){
            return true;
        }
        else{
            return false;
        }
        }
	}
	public static void main(String[] args){
		int[] pushed={1,2,0};
		int[] popped ={2,1,0};
		ValidateStack obj=new ValidateStack();
		boolean c= obj.validateStackSequences(pushed,popped);
		System.out.println(c);
	}
}
