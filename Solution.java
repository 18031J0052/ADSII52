import java.util.Scanner;
import java.util.StringTokenizer;

class ADS_Program {
	int n;
	int a[][];
	 public ADS_Program(int n) 
	 {
	  this.n = n;
	  a = new int[n][n];
	 }
	 public void addEdge(int v, int w)
	 {
	  a[v][w]=1;
	  a[w][v]=1;
	 }
	 public void printGraph()
	 {
	  for (int i = 0; i < n; i++)
	  {
	   for (int j = 0; j <n ; j++) 
	   {
	    System.out.print(a[i][j]+ " ");
	   }
	  System.out.println();
	  }
	 }
}
 public class Solution {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String s= sc.next();
			int n= sc.nextInt();
			int m= sc.nextInt();
	    	ADS_Program g= new ADS_Program(n);
			//Scanner Scan = new Scanner(System.in);
			String abc;
			sc.next();
		    String[] Str1 = new String[n];
		    	abc=sc.nextLine();
		    	StringTokenizer t= new StringTokenizer(abc,",");
		    	int i=0;
		    	System.out.println(abc);
		    	while(t.hasMoreTokens())
		    	{
		    		Str1[i] = t.nextToken();
		    		//System.out.println(Str1[i]);
		    		i++;
		    	}
            //  sc.next();
		    for(i=0;i<n-1;i++)
		    {
		    	int n1=sc.nextInt();
		    	int l=sc.nextInt();
		    	g.addEdge(n1,l);
		  	 } 
		    g.printGraph();
		}
	}
