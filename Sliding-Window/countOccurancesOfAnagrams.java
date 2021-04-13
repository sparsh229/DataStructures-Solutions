/ { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int k=pat.length();
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        int n=txt.length();
        HashMap<Character,Integer>map=new HashMap<>();
        char [] patarr = pat.toCharArray();
        for(char c:patarr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        count=map.size();
        while(j<n){
            char tempj=txt.charAt(j);
            if(map.containsKey(tempj)){
                map.put(tempj,map.get(tempj)-1);
                if(map.get(tempj)==0){
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count==0){
                    ans++;
                }
                char tempi=txt.charAt(i);
                if(map.containsKey(tempi)){
                    if(map.get(tempi)==0){
                        count++;
                    }
                    map.put(tempi,map.get(tempi)+1);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
