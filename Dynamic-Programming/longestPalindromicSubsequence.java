class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        s1.append(s);
        s1=s1.reverse();
        String s2=s1.toString();
        int m=s2.length();
        int res=LCS(s,s2,n,m);
        return res;
        
    }
    public static int LCS(String a,String b,int n,int m){
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
	    return t[n][m];
	}
}
