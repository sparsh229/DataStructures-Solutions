// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new solve().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int []ngr=ngr(arr,n);
        int j=0;
        for(int i=0;i<=n-k;i++){
            if(j<i){
                j=i;
            }
            while(ngr[j]<i+k){
                j=ngr[j];
            }
            res.add(arr[j]);
        }
        return res;
        
    }
    static int[]ngr(int []arr,int n){
        int[] nge = new int[arr.length];

        Stack < Integer > st = new Stack < > ();
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }
        return nge;
    }
}
