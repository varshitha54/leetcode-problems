class Solution {
    public int maxPower(String s) {
        int count=1;
        int c=1;
        for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    c++;
            count=Math.max(count,c);
            
        }
        else{
            c=1;
        }
    }
    return count;
}
}