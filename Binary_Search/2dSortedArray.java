import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int key=sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;i<m;j++){
        a[i][j]=sc.nextInt();
      }
    }
    int ans[]={-1,-1};
    int i=0;
    int j=n-1;
    System.out.print(peak(a,l,h,key));

  }
  public static void peak(int[][]a,int i,int j,int key){
    int mid=l+((h-l)/2);
    while(i>=0&&j>=0&&i<n&&j<m){
      if(a[i][j]==key){
        ans[0]=i;
        ans[1]=j;
      }
      else if(a[i][j]<key){
        i++;
      }
      else{
        j--;
   
      }
    }
    System.out.print(ans[0]+" "+ans[1]); 
  }
  
}
