// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
       int []maxr=new int[n];
       int []maxl=new int[n];
       maxl[0]=arr[0];
       maxr[n-1]=arr[n-1];
       for(int i=1;i<n;i++){
           maxl[i]=Math.max(maxl[i-1],arr[i]);
       }
       for(int i=n-2;i>=0;i--){
           maxr[i]=Math.max(maxr[i+1],arr[i]);
       }
       int water[]=new int[n];
       int sum=0;
       for(int i=0;i<n;i++){
           water[i]=Math.min(maxr[i],maxl[i])-arr[i];
           sum+=water[i];
       }
       return sum;
        
    } 
}

