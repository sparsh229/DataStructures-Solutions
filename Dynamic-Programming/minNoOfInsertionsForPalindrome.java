
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        String str=sc.next();
	        int n=str.length();
	        StringBuilder s=new StringBuilder();
	        s.append(str);
	        s=s.reverse();
	        String str2=s.toString();
	        int lps=lcs(n,n,str,str2);
	        System.out.println(n-lps);
	        
	    }
		
	}
	 static int lcs(int p, int q, String s1, String s2){
       int [][]t=new int[p+1][q+1];
       for(int i=0;i<p+1;i++){
           for(int j=0;j<q+1;j++){
               if(i==0||j==0){
               t[i][j]=0;
               }
           }
       }
       for(int i=1;i<p+1;i++){
           for(int j=1;j<q+1;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                   t[i][j]=1+t[i-1][j-1];
               }
               else{
                   t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
               }
           }
       }
       return t[p][q];
    }
	
}
