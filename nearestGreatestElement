
import java.util.*;
public class NGL {
	public static void main(String[] args) {
		int [] a= {10, 5, 11, 6, 20, 12};
		int n=a.length;
		Stack<Integer> s=new Stack<Integer>();
		int [] ans=new int[n];
		for(int i=0;i<n;i++) {
			if(s.size()==0) {
				ans[i]=-1;
			}
			else if(s.size()>0&&s.peek()>a[i]) {
				ans[i]=s.peek();
			}
			else if(s.size()>0&&s.peek()<=a[i]) {
				while(s.size()>0&&s.peek()<=a[i]) {
					s.pop();
				}
				if(s.size()==0) {
					ans[i]=-1;
				}
				else {
					ans[i]=s.peek();
				}
			}
			s.push(a[i]);
		}
		System.out.print(Arrays.toString(ans));
	}
	

}
