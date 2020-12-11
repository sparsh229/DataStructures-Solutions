class Main {
  public static void main(String[] args) {
    int []a={1,4,4,4,5};
    int n=a.length;
    int d=4;
    int l=0;
    int h=n-1;
    int first=-1;
    while(l<=h){
      int mid=l+((h-l)/2);
      if(a[mid]==d){
        first=mid;
        h=mid-1;
      }
      else if(a[mid]>d){
        h=mid-1;
      }
      else if(a[mid]<d){
        l=mid+1;
      }
    }
    System.out.print(first);
  }
}
