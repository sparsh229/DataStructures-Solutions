import java.util.*;
public class kthMinMaxElement {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    int pi=partition(arr,l,r);
    if(pi+1==k) {
    	return arr[pi];
    }
    else {
    	return kthSmallest(arr,l,pi-1,k);
    }
}
public static int partition(int []a,int l,int r) {
	int pivot=r;
	int i=l-1;
	int j=l;
	while(j<r) {
		if(a[j]<a[pivot]) {
			++i;
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			j++;
		}
		else if(a[j]>=a[pivot]) {
			j++;
		}
	}
	int temp=a[pivot];
	a[pivot]=a[i+1];
	a[i+1]=temp;
	return i+1;
}
public static int kthLargest(int[]a,int l,int r,int k) {
	int pi=partition(a,l,r);
	if(pi-1==k) {
		return a[pi];
	}
	else {
		return kthLargest(a,pi+1,r,k);
	}
}
}
