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
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    // } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int n, int sum) 
	{ 
	   int [][]t=new int[n+1][sum+1];
	   for(int i=0;i<n+1;i++){
	       for(int j=0;j<sum+1;j++){
	           if(i==0&&j!=0){
	               t[i][j]=Integer.MAX_VALUE-1;
	           }
	           if(j==0){
	               t[i][j]=0;
	           }
	       }
	   }
	   for(int j=1;j<sum+1;j++){
	       if(j%coins[0]==0){
	           t[1][j]=j/coins[0];
	       }
	       else{
	           t[1][j]=Integer.MAX_VALUE-1;
	       }
	   }
	   for(int i=2;i<n+1;i++){
	       for(int j=1;j<sum+1;j++){
	           if(coins[i-1]<=j)
	           t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
	           else
	           t[i][j]=t[i-1][j];
	       }
	       
	   }
	   if(t[n][sum]==Integer.MAX_VALUE-1){
	       return -1;
	   }
	   return t[n][sum];
	} 
}
