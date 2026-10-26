class Solution {
    public boolean threeFibonacciSum(int n) {
        int[] arr = new int[50];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < 50; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for(int i=0;i<arr.length-2;i++){
            int sum=arr[i]+arr[i+1]+arr[i+2];
            if(sum==n){
            return true;
        
        }
    
    }
    return false;
}
    
}