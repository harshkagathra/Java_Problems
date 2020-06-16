import java.util.*;
public class QueueVersion {
	public Queue<Integer> version(int k,int[][] input){
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<k;i++){
			if(input[i].length==2){
				q.add(input[i][1]);
			}
				else{
					q.poll();
				}
			}
		return q;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n =new int[][]{{0,1},{0,2},{1},{1},{0,3}};
		int version =2;
		QueueVersion obj=new QueueVersion();
		System.out.println(obj.version(version,n));

	}

}
