class Solution {
    public int mySqrt(int x) {
    if(x==0)
    return 0;
    int start=0;
    int end=x;
    int ans=0;
    while(start<=end){
      int  mid=(start+end)/2;
        if(mid*mid==x)
        return mid;
        else if((long)mid*mid<x){
        ans=mid;
        start=mid+1;
        }
        else
        end=mid-1;
    }
      return ans;  
    }
}