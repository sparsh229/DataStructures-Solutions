// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}

 // } Driver Code Ends


//User function Template for Java

public static int shortestCommonSupersequence(String x, String y, int m, int n)
{
    int res=m+n-LCS(x,y,m,n);
    return res;
}
public static int LCS(String a,String b,int n,int m){
	    int[][]t=new int[n+1][m+1];
	    for(int i=0;i<n+1;i++){
	        for(int j=0;j<m+1;j++){
	            if(i==0||j==0){
	                t[i][j]=0;
	            }
	        }
	    }
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<m+1;j++){
	            if(a.charAt(i-1)==b.charAt(j-1)){
	                t[i][j]=t[i-1][j-1]+1;
	            }
	            else{
	                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
	            }
	        }
	    }
	    return t[n][m];
	}

// { Driver Code Starts.



       
}  // } Driver Code Ends
