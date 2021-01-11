// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int n=str1.length();
	    int m=str2.length();
	    int lcs=LCS(str1,str2,n,m);
	    int res=(n-lcs)+(m-lcs);
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
}
