class Solution {
    public int mirrorDistance(int n) {
        int x=reverse(n);
        return Math.abs(n-x);
    }
    private int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}