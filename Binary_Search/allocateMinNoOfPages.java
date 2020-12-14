int res=-1;
    if(n<m){
        return res;
    }
    int h=0;
    int l=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        h+=a[i];
        l=Math.max(l,a[i]);
    }
    int mid=l+((h-l)/2);
    while(l<=h){
        if(isValid(a,mid,n,m)){
            res=Math.min(res,mid);
            h=mid-1;
        }
        else{
            l=mid+1;
        }
    }
    return res;
