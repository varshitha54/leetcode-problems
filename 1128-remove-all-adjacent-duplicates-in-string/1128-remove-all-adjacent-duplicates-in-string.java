class Solution {
    public String removeDuplicates(String s) {
        char[] ch=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>=0 && ch[top]==s.charAt(i)){
                top--;
                
            }
            else{
                ch[++top]=s.charAt(i);
            }
        }

        return new String(ch,0,top+1);
    }
}