class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        int ans=0;
        int l=0;
        int r=0;

        HashSet<Character> set=new HashSet<>();
       

//sliding window because string is continuous and it requires muliple iterations 
//over same characters in order to find substring
        for (r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            
            set.add(s.charAt(r));
            ans=Math.max(ans,r-l+1);
           
        
            

        }
        return ans;
        
    }
}
