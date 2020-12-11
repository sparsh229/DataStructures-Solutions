class Main {
  public static void main(String[] args) {
    int []a={5,4,1,2,3};
    //calculate number of rotations
    int n=a.length;
    int l=0;
    int h=n-1;
    while(l<=h){
      int mid=l+((h-l)/2);
      int next=(mid+1)%n;
      int pre=(mid+n-1)%n;
      if(a[mid]<=a[next]&&a[mid]<=a[pre]){
         System.out.print(mid);
         return;
      }
      else if(a[l]<=a[mid]){
        l=mid+1;
      }
      else if(a[h]<=a[mid]){
        h=mid-1;
      }
    }
  }
}
