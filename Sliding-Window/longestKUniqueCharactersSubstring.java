/ { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int n=s.length();
        int i=0,j=0,max=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char tempj=s.charAt(j);
            map.put(tempj,map.getOrDefault(tempj,0)+1);
            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    char tempi=s.charAt(i);
                    if(map.containsKey(tempi)){
                        map.put(tempi,map.get(tempi)-1);
                        if(map.get(tempi)==0){
                            map.remove(tempi);
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
