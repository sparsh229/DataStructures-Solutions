import java.io.*;
import java.util.*;

class sort0,1,2 {
    
public static void sort012(int a[], int n){
    int l=0,h=n-1,m=0;
    while(m<=h){
    if(a[m]==0){
        int temp=a[m];
        a[m]=a[l];
        a[l]=temp;
        l++;
        m++;
    }
    else if(a[m]==1){
        m++;
    }
    else if(a[m]==2){
        int temp=a[m];
        a[m]=a[h];
        a[h]=temp;
        h--;
    }
    }
}

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
