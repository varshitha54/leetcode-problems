class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
               sum+=nums[i+j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return (double) max/k;
    }
}