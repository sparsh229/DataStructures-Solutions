class Main {
  public static void main(String[] args) {
    int n=4;
    int[] a={1,2,3,4,5};
    System.out.print(bs(a,n));
    
  }
  public static int bs(int []a,int n)
  {
    int start=0;
    int end=a.length-1;
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
