//Find element in rotated array
class Main {
  public static void main(String[] args) {
    int []a={5,4,1,2,3};
    //calculate number of rotations
    int n=a.length;
    int find=4;
    int l=0;
    int h=n-1;
    int rotate=rotation(a,l,h);
    //apply binary search on left side of min ele
    int ans=bs(a,0,rotate-1,find);
    if(ans>0){
      System.out.print(ans);
      return;
    }
    //apply binary search on right side of min ele
    ans=bs(a,rotate,n-1,find);
    if(ans>0){
      System.out.print(ans);
      return;
    }
    else{
      System.out.print("-1");
      return;
    }

  }
  //Calculate number of rotations
  public static int rotation(int[] a,int l,int h){
    int n=a.length;
    while(l<=h){
      int mid=l+((h-l)/2);
      int next=(mid+1)%n;
      int pre=(mid+n-1)%n;
      if(a[mid]<=a[next]&&a[mid]<=a[pre]){
         return mid;
      }
      else if(a[l]<=a[mid]){
        l=mid+1;
      }
      else if(a[h]<=a[mid]){
        h=mid-1;
      }
    }
    return -1;

  }
  //usual binary search algo
  public static int bs(int []a,int start,int end,int n){
    while(start<=end)
    {
      int mid=start+((end-start)/2);
      if(n==a[mid])
      {
        return mid;
      }
      else if(n>mid)
      {
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }
  
}
