 import java.util.*;
public class QueueUsingStack {
	Stack<Integer> PushStack = new Stack<Integer>();
	Stack<Integer> PopStack = new Stack<Integer>();
	public static void main(String[] args) {
		int ch;
		QueueUsingStack obj=new QueueUsingStack();
		Scanner sc =new Scanner(System.in);
		do{
		System.out.println("1.Enqueue \n 2. Dequeque \n 3.Exit \n Select your choice: \n");
		ch =sc.nextInt();
		
		switch(ch){
		case 1: System.out.println("Enter the value");
				int val=sc.nextInt();
				obj.enqueque(val);
				break;
		case 2: obj.dequeque();
				break;
		case 3: System.out.println("Thank You!");
				break;
		default: System.out.println("Wrong Choice");
		}
		}while(ch!=3);
	}
	
	public void enqueque(int val){
		PushStack.push(val);
		System.out.println(" ELement Enquequed is: "+ val);
	}
	
	public void dequeque(){
		if(PopStack.isEmpty())
		{
			if(PushStack.isEmpty())
			{
				System.out.println("Nothing to Dequeque!");
				return;
			}
			else{
				while(!PushStack.isEmpty())
				{
					PopStack.push(PushStack.pop());
				}
				System.out.println(" Element Dequequed is: "+ PopStack.pop());
			}
		}
		else{
			System.out.println(" Element Dequequed is: "+ PopStack.pop());
		}
		
	}

}
