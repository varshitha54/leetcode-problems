class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int squaresum=0;
        while(n>0){

        sum=sum+n%10;
        squaresum=squaresum+(n%10)*(n%10);
        n=n/10;
        
        }
        return squaresum-sum>=50;

    }
}