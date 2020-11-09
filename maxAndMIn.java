import java.util.Scanner;
import java.lang.Math;
public class maxMIn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, a[i]);
			min=Math.min(min, a[i]);
		}
		System.out.print("Max is "+max+" min is "+min);
	}

}
