class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        StringBuilder rev=new StringBuilder(binary);
         for(int i = 0; i < rev.length(); i++) {
            if(rev.charAt(i) == '0') {
                rev.setCharAt(i, '1');
            }
            else {
                rev.setCharAt(i, '0');
            }
        }

        return Integer.parseInt(rev.toString(), 2);
    }
}