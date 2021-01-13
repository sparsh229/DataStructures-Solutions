/ { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int t[][]=new int[501][501];
    static int palindromicPartition(String s)
    {
        
        for(int i=0;i<s.length()-1;i++)
        {
            Arrays.fill(t[i],-1);
        }
        
        int result=solve(s,0,s.length()-1);
        
        return result;
    }
    static int solve(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        if(isPalindrome(s,i,j)==true){
            t[i][j]=0;
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left=0;
            int right=0;
            if(t[i][k]!=-1){
                left=t[i][k];
            }
            else{
                left=solve(s,i,k);
                t[i][k]=left;
            }
            if(t[k+1][j]!=-1){
                right=t[k+1][j];
            }
            else{
                right=solve(s,k+1,j);
                t[k+1][j]=right;
            }
            int temp=1+left+right;
            min=Math.min(min,temp);
        }
        t[i][j]=min;
        return min;
    }
    static boolean isPalindrome(String s,int i,int j){
        if(i>=j){
            return true;
        }
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
