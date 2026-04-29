class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){

            if(!Character.isLetterOrDigit(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[j])){
                j--;
                continue;
            }
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
