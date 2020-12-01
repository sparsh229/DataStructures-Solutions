import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []a=new int[n];
		int []b=new int[m];
		 for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<m;i++){
	            b[i]=sc.nextInt();
	        }
		HashSet<Integer> union=new HashSet<Integer>();
		int i=0,j=0;
		while(i<n) {
			union.add(a[i]);
			i++;
		}
		while(j<m) {
			union.add(b[j]);
			j++;
		}
		System.out.println(union.size());
	t--;	
	}
	
	}
}
