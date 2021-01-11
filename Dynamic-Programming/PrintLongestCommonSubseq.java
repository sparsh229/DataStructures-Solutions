import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    String a=sc.next();
	    String b=sc.next();
	    int t[][]=LCS(a,b,n,m);
	    String res="";
	    int i=n;int j=m;
	    while(i>0&&j>0){
	        if(a.charAt(i-1)==b.charAt(j-1)){
	            res+=a.charAt(i-1);
	            i--;j--;
	        }
	        else{
	            if(t[i-1][j]<t[i][j-1]){
	                j--;
	            }
	            else{
	                i--;
	            }
	        }
	    }
      StringBuilder input1 = new StringBuilder();input1.append(res);
      input1 = input1.reverse();
      System.out.println(input1);
		
	}
	public static int [][]LCS(String a,String b,int n,int m){
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
	    return t;
	}
}
