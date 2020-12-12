import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    //suppose that array is infinte so to find index of infinite array we will find l and h
    int l=0;
    int h=1;
    while(a[h]<key){
      l=h;
      h=h*2;
    }
    System.out.print(bs(a,l,h,key));
    //now simply apply binary search

  }
  public static int bs(int[]a,int l,int h,int d){
    int mid=l+((h-l)/2);
    while(l<=h){
      if(a[mid]==d){
        return mid;
      }
      else if(a[mid]<d){
        l=mid+1;
      }
      else{
        h=mid-1;
      }
    }
    return -1;
  }
  
}
