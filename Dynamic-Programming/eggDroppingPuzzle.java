// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(EggDrop.eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class EggDrop 
{
    static int [][]t=new int [11][51];
    static int eggDrop(int n, int k) 
	{
	    for(int []fill:t){
	        Arrays.fill(fill,-1);
	    }
	   
	    return solve(n,k);
	}
	static int solve(int e,int f){
	    if(f==0||f==1){
	        return f;
	    }
	    if(e==1){
	        return f;
	    }
	    if(t[e][f]!=-1){
	        return t[e][f];
	    }
	    int low =0,high=0;
	    int min=Integer.MAX_VALUE;
	    for(int k=1;k<=f;k++){
	        if(t[e-1][k-1]!=-1){
	            low=t[e-1][k-1];
	        }
	        else{
	            low=solve(e-1,k-1);
	            t[e-1][k-1]=low;
	        }
	        if(t[e][f-k]!=-1){
	            high=t[e][f-k];
	        }
	        else{
	            high=solve(e,f-k);
	            t[e][f-k]=high;
	        }
	        int temp=1+Math.max(low,high);
	        min=Math.min(min,temp);
	    }
	    t[e][f]=min;
	    return min;
	}
}
