class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0)
            x=x*10+digit;
            sum+=digit;
            n=n/10;
        }
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return (long) rev*sum;
    
}
}