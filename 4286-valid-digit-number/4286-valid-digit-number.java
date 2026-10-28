class Solution {
    public boolean validDigit(int n, int x) {
        char[] arr = String.valueOf(n).toCharArray();
        int count=0;
            if(arr[0]==(char)('0'+ x))
            return false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]==(char)('0'+x))
                count++;
            }
        return count>0;
    }
}