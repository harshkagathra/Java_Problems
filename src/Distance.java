import java.io.*;
import java.util.*;
public class Distance {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int [][] a= {{5,4},{-2,7},{3,5},{2,6},{8,-3},{1,5},{4,-6},{7,-2}};
	double [] b = new double[a.length];
	double[]c= new double[a.length];
	System.out.println("Enter the value k");
	int k = sc.nextInt();
	for (int i=0;i<a.length;i++)
	{
		b[i]=compute(a[i][0],a[i][1]);
		c[i]= i;
	}
	int n = b.length; 

    // One by one move boundary of unsorted subarray 
    for (int i = 0; i < n-1; i++) 
    { 
        // Find the minimum element in unsorted array 
        int min_idx = i; 
        for (int j = i+1; j < n; j++) 
            if (b[j] < b[min_idx]) 
                min_idx = j; 

        // Swap the found minimum element with the first 
        // element 
        double temp = b[min_idx]; 
        double t = c[min_idx]; 
        
        b[min_idx] = b[i];
        c[min_idx] = c[i];
        b[i] = temp;
        c[i] = t;
    }
	for(int i1=0;i1<k;i1++)
	{
	System.out.println(b[i1]+"    "+a[(int) c[i1]][0]+","+a[(int) c[i1]][1]);
	}
	
    }
	
public static double compute(int a,int b)
{
	double d=0;
	d=  Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
	return d;
	
}

}