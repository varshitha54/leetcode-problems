class Solution {
    public 
        boolean isvowel(char ch){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            return true;
            return false;
        }
        String reverseVowels(String s) {

         char[] arr=s.toCharArray();
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
        if(!isvowel(arr[i]))
        i++;
        else if(!isvowel(arr[j]))
        j--;
        else{
            char temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        }
        return new String(arr);


    }
}