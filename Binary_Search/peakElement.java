import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int l=0;
    int h=n-1;
    System.out.print(peak(a,l,h));

  }
  public static int peak(int[]a,int l,int h){
    int mid=l+((h-l)/2);
    while(l<=h){
      if(mid>0&&mid<n-1){
        if(a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
          return mid;
        }
        else if(a[mid+1]>a[mid-1]){
          l=mid+1;
        }
        else if(a[mid+1]<a[mid-1]){
          h=mid-1;
        }
      }
      else if(mid==0){
        if(a[0]>a[1]){
          return mid;
        }
        else{
          return -1;
        }
      }
      else if(mid==n-1){
        if(a[n-1]>a[n-2]){
          return mid;
        }
        else{
          return -1;
        }
      }
    }
    return -1;
  }
  
}
