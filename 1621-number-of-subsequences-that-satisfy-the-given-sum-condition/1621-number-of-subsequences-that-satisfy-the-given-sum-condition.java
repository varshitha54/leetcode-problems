class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int MOD=1_000_000_007;
        int[] pow=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i]=(2*pow[i-1]) % MOD;
        }
                
        int res=0;
        int l=0;
        int r=n-1;
        while(l<=r){
        if(nums[l]+nums[r]<=target){
          res=(res+pow[r-l]) % MOD;
          l++;
        }
        else{
        r--;
    }
        }
    return res;

    }
}