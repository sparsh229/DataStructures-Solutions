// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new solve().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends

class pair{
   int first;
   int second;
    pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class solve{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<pair>st=new Stack<>();
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else if(!st.isEmpty()&&st.peek().first>price[i]){
                ans[i]=st.peek().second;
            }
            else if(!st.isEmpty()&&st.peek().first<=price[i]){
                while(!st.isEmpty()&&st.peek().first<=price[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek().second;
                }
            }
            pair Mypair=new pair(price[i],i);
            st.push(Mypair);
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=i-ans[i];
        }
        return ans;
    }
    
}
