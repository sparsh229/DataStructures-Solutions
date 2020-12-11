import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    int l=0;
    int h=n-1;
    int floor=0;
    int ceil=0;
    while(l<=h){
        int mid=l+((h-l)/2);
        if(a[mid]==d){
            floor=a[mid];
            ceil=a[mid];
            System.out.println(ceil);
            System.out.println(floor);
            return;
        }
        else if(a[mid]<d){
            floor=a[mid];
            l=mid+1;
        }
        else if(a[mid]>d){
            ceil=a[mid];
            h=mid-1;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
  }
  
}
