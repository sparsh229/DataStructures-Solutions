class Main {
  public static void main(String[] args) {
    int []a={5,4,3,2,1};
    int n=a.length;
    int d=4;
    int l=0;
    int h=n-1;
    while(l<=h){
      int mid=l+((h-l)/2);
      if(a[mid]==d){
        System.out.print(mid);
        return;
      }
      else if(a[mid]>d){
        l=mid+1;
      }
      else if(a[mid]<d){
        h=mid-1;
      }
    }
    System.out.print("-1");
  }
}
