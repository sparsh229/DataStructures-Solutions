
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String str=sc.next();
		    Stack<Integer> st=new Stack<>();
		    int num =1;
		    for(int i=0;i<str.length();i++){
		        char ch=str.charAt(i);
		        if(ch=='D'){
		            st.push(num++);
		        }
		        else{
		            st.push(num++);
		            while(!st.isEmpty()){
		                System.out.print(st.pop());
		            }
		        }
		    }
		    st.push(num);
		    while(!st.isEmpty()){
		    System.out.print(st.pop());
		}
		System.out.println();
		}
		
	}
}
