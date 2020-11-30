import java.util.Arrays;

public class negetiveRearrange {
	public static void main(String[] args) {
		int arr[]= {1,2,-4,-5,6,9};//here i took my input please write code if you want to tak eyour own input
		int n=arr.length;
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]>0&&arr[j]<0) {
				i++;
				j--;
			}
			else if(arr[i]<0&&arr[j]>0) {
				swap(arr,i,j);
				i++;
				j--;
			}
			else if(arr[i]<0&&arr[j]<0) {
				j--;
			}
			else if(arr[i]>0&&arr[j]>0) {
				i++;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
	public static void swap(int[]a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
