import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		while(d-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    String x=sc.next();
		    String y=sc.next();
		    int[][]t=new int[n+1][m+1];
		    for(int i=0;i<n+1;i++){
		        for(int j=0;j<m+1;j++){
		            if(i==0||j==0){
		                t[i][j]=0;
		            }
		        }
		    }
		    int result=0;
		    for(int i=1;i<n+1;i++){
		        for(int j=1;j<m+1;j++){
		            if(x.charAt(i-1)==y.charAt(j-1)){
		                t[i][j]=t[i-1][j-1]+1;
		                result=Math.max(t[i][j],result);
		            }
		            else{
		                t[i][j]=0;
		            }
		        }
		    }
    		System.out.println(result);
    		    
		   
		}
	}
}
