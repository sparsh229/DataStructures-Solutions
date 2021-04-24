/ { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}// } Driver Code Ends




class Solution
{
    // return the smallest window in S with all the characters of P
    // if no such window exists, return "-1" 
    public static String smallestWindow(String s, String p){
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int i=0,j=0;
        int count=map.size();
        int min=Integer.MAX_VALUE;
        String ans="-1"; 
        while(j<n){
            char tempj=s.charAt(j);
            if(map.containsKey(tempj)){
                map.put(tempj,map.get(tempj)-1);
                if(map.get(tempj)==0){
                    count--;
                }
            }
            if(count>0){
                j++;
            }
            else if(count==0){
                while(count==0){
                    char tempi=s.charAt(i);
                    if(map.containsKey(tempi)){
                        if(map.get(tempi)<0){
                            i++;
                            map.put(tempi,map.get(tempi)+1);
                        } 
                        else{
                            break;
                        }
                    }
                    else{
                        i++;
                    }
                }
                if(min>j-i+1){
                    min=j-i+1;
                    ans=s.substring(i,i+min);
                }
                j++;
            }
            else if(count<0){
                j++;
            }
            
        }
        return ans;
    }
}
